package ec.edu.epn.courses_Languagues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BudgetBusines {
    private double totalBalance=1120;
    private double value;


    public BudgetBusines() {
    }

    public boolean budget(){
        this.totalBalance = checkAmountFile();
        if(totalBalance > 0){
            System.out.println("La empresa cuenta con un presupuesto");
            return true;
        }else{
            System.out.println("La empresa no cuenta con un presupuesto");
            return false;
        }
    }

    public double checkAmountFile() {

        String line = "";
        double totalBudget=0;
        try{

            FileReader r = new FileReader("Datos_Comprobante.txt");

            BufferedReader br = new BufferedReader(r);
            while((line=br.readLine()) != null){
                String[] elements = line.split(";");
                double value2 = Double.parseDouble(elements[5]);
                totalBudget = totalBudget + value2;
            }
            r.close();
            br.close();
            return totalBudget;

        }catch(IOException e){
            e.printStackTrace();
            return 0.0;
        }
    }
    public double recalculateBudget(double value){
        this.value = value;
        if(totalBalance>value){
            totalBalance-=value;
            return totalBalance;
        }
        return totalBalance;
    }
    //DOS MESES SON 10 SEMANAS
    public double returnPayment(int weekNumber){
        double monetaryLoss=0.0;
        if(weekNumber <= 10){
            //Porcentaje de reembolso del 0%
            System.out.println("Reembolso no permitido");
            return 0.0;
        }else{
            //Porcentaje de reembolso del 25%
            if(weekNumber >=  5){
                monetaryLoss = 280*0.25;
                recalculateBudget(monetaryLoss);
                return monetaryLoss;
            }else{
                //Porcentaje de reembolso del 50%
                monetaryLoss = 280*0.5;
                recalculateBudget(monetaryLoss);
                return monetaryLoss;
            }
        }
    }


}
