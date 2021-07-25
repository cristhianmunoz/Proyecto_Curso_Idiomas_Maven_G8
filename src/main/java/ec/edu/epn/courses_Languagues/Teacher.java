package ec.edu.epn.courses_Languagues;

public class Teacher extends Person {

    private  Boolean estado;

    public Teacher(String nombre, String apellidos, int id){
        super(nombre,apellidos,id);
        this.estado=true;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id= "+getId()+";"+
                "nombre= "+ getNombre()+";"+
                "apellidos= "+getApellidos()+";"+
                "estado=" + estado + '\'' +
                '}';
    }

    public String toSave(){
        return getId()+";"+getNombre()+";"+getApellidos()+";"+estado + ";";
    }



}
