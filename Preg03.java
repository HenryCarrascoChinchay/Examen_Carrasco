import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de horas");
        int n=sc.nextInt();
        if (n>=4){
            int pagar= 6;
            if (n>4){
                pagar=pagar+2*(n-4);
               System.out.println("impote a pagar= s/. " + pagar);
            }
            System.out.println("impote a pagar= s/. " + pagar);
        } else{
            System.out.println("las horas no son suficientes");
        }

    }
}