import java.util.Scanner;

public class ParOImpar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese el numero a verificar si es par o impar: ");
        numero = Integer.parseInt(sc.nextLine());
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        sc.close();
    }
}
