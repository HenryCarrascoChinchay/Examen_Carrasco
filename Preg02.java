import java.util.Scanner;

public class App {

    
    private int suma;
    public int getSuma(){
        return suma;
    }
        public void sumar(int n){
            for(int i=1; i<=n;i++)
            suma+=i;
        }

    public static void main(String[] args) throws Exception {
        
        int res;
        int n;

        Scanner nj = new Scanner(System.in);
        
        System.out.println("Programa para ingresar la sumatoria de los primeros N numeros enteros");
        System.out.println("Ingresar el numero: ");

        n= nj.nextInt();

        App objSumaEnteros = new App();

        objSumaEnteros.sumar(n);

        res = objSumaEnteros.getSuma();
        
        System.out.println("La suma de los "+n+" primeros n numeros es = "+res );


    }
}
