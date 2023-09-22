import java.util.Scanner;

public class Fibonnaci {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        double limNumerosEnSucesion;
        System.out.print("Introduce la cantidad de numeros de la sucecion de Fibonnaci que quieres ver: ");
        limNumerosEnSucesion = Double.parseDouble(sc.nextLine());
        sc.close();
        double[] fibonnaci = new double[(int) (limNumerosEnSucesion + 1)];
        fibonnaci[0] = 1;
        if (limNumerosEnSucesion > 0)
            fibonnaci[1] = 1;
        if (limNumerosEnSucesion > 1)
            for (int j = 2; j < limNumerosEnSucesion; j++) {
                fibonnaci[j] = fibonnaci[j - 1] + fibonnaci[j - 2];
            }
        System.out.print("Sucesion: ");
        for (int j = 0; j < limNumerosEnSucesion; j++) {
            System.out.print(fibonnaci[j] + " ");
        }
    }
}
