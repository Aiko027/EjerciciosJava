import java.util.Scanner;

public class Minimo3Numeros {
    public static void main(String args[]) {
        int[] numerosOrdenados = new int[3];
        int aux;
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            System.out.print("Ingrese numero ");
            System.out.print(j + 1);
            System.out.println(":");
            numerosOrdenados[j] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3 - 1; k++) {
                if (numerosOrdenados[k + 1] < numerosOrdenados[k]) {
                    aux = numerosOrdenados[k + 1];
                    numerosOrdenados[k + 1] = numerosOrdenados[k];
                    numerosOrdenados[k] = aux;
                }
            }
        }
        System.out.println("El numero menor de los 3 numeros es: " + numerosOrdenados[0]);
    }
}
