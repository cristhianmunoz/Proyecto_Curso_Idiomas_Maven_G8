package ec.edu.epn.courses_Languagues;

import java.io.*;
import java.util.Date;

public class voucher {
    private int idComprobante;
    private String cliente;
    private Date date;
    private String idioma;
    private String nivel;
    private double valor=250.0;
    private Date fecha_pago;

    public voucher(Student cliente, Course course) {
        this.cliente = cliente.getNombre()+" "+cliente.getApellidos();
        this.date = date;
        this.idioma = course.getIdioma();
        this.nivel= course.getNivel();
        this.valor = calculoPago();
    }

    public int getIdComprobante() {
        return idComprobante++;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String imprimirComprobante(){
        date = new Date();
        return "voucher No: "+ this.idComprobante+
                "; Cliente: "+this.cliente+
                "; Fecha de emisiòn: "+date+
                "; Idioma: "+this.idioma+
                "; Nivel: "+this.nivel+
                "; Costo: "+calculoPago()+
                "; Fecha de Pago: "+date.getMonth();

    }
    public String toSave(){

        return this.idComprobante+";"+this.cliente+";"+date+";"+this.idioma+";"+this.nivel+";"+this.valor+";"+date;

    }

    public void guardarComporbante(){
        String Comprobante = toSave();
        File voucher = new File(getPath());
        checkFile(voucher);
    }

    private void checkFile(File voucher) {
            try{
                if(voucher.exists()) {
                    FileTXT(voucher, true);
                } else{
                    voucher.createNewFile();
                    FileTXT(voucher, false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    private void FileTXT(File voucher, boolean b) throws IOException {
        FileWriter escribir_datos = new FileWriter(voucher,b);
        BufferedWriter bwr_datos = new BufferedWriter(escribir_datos);
        PrintWriter mostrarDatos = new PrintWriter(bwr_datos);

        mostrarDatos.println(toSave());
        bwr_datos.flush();
        escribir_datos.close();
    }

    public double calculoPago(){
        return valor*0.12+valor;
    }
    private String getPath(){
        return "Datos_Comprobante.txt";
    }
}
