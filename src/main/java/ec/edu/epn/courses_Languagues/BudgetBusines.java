package ec.edu.epn.courses_Languagues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BudgetBusines {
    private double totalBalance;
    private double value;
    int contador=0;

    public BudgetBusines(double value) {
        this.value=value;
        String line = "";

        try{
            FileReader r = new FileReader("Datos_Comprobante.txt");
            BufferedReader br = new BufferedReader(r);
            while(br.readLine() != null){
                String[] elements = line.split(";");
                int value2=Integer.parseInt(elements[5]);
                value=value+value2;
            }
            r.close();
            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }
        //budget(contador);
    }

    public BudgetBusines() {
    }

    public void budget(){
        totalBalance = contador*value;
        System.out.println("Total Balance: "+totalBalance);
    }
    public double recalculateBudget(double value){
        if(totalBalance>value){
            totalBalance-=value;
            return totalBalance;
        }else{
            System.out.println("Devoluciòn no permitida");
            return totalBalance;
        }
    }

}
