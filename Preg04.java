import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        
        Scanner nj = new Scanner(System.in);
        System.out.println("programa para dar donaciones dependiendo al sueldo");
        System.out.println("Ingresar el sueldo: "); 
        double n= nj.nextInt();


        if(n >0 && n<=1000){
            double p=0;
             p = 0.05;
             double res = n * p;

        System.out.println("la donacion a dar es:" + res);
        }
        if(n >1000 && n<=1500){
            double p=0;
            p = 0.07;
            double res = n * p;

        System.out.println("la donacion a dar es:" + res);
        }
        if(n >1500 && n<=2000){
            double p=0;
             p = 0.08;
             double res = n * p;

        System.out.println("la donacion a dar es:" + res);
        }
        if(n >2000 && n<=5000){
            double p=0;
            p = 0.1;
            double res = n * p;

        System.out.println("la donacion a dar es:" + res);
        }
        if(n >5000){
            double p=0;
             p = 0.15;
             double res = n * p;

        System.out.println("la donacion a dar es:" + res);
        }

        

    }

}
