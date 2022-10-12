import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el 1er número");
        int x = sc.nextInt();
        System.out.println("Ingrese el 2do número");
        int y = sc.nextInt();
        System.out.println("El intercambio de valores es: ");
        System.out.println("El 1er número es: " +y);
        System.out.println("El 2do número es: " +x);

    }
}
