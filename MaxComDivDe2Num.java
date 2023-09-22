import java.util.Scanner;

public class MaxComDivDe2Num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux;
        int[] numero = new int[2];
        boolean exit = false;
        for (int j = 0; j < 2; j++) {
            do {
                exit = false;
                clean();
                System.out.println("Ingresa el numero " + (j + 1) + " a calcular el Maximo comun divisor");
                aux = sc.nextLine();
                try {
                    numero[j] = Integer.parseInt(aux);
                    exit = true;
                } catch (NumberFormatException exception) {
                    System.out.println(
                            "El valor ingresaro no es correcto, debe ser entero y no debe contener caracteres");
                    System.out.println(
                            "Presiona enter para volver a intentar...");
                    sc.nextLine();
                }
            } while (!exit);
        }
        sc.close();
        System.out.println("El maximo comun divisor es: " + calcularMaximoComunDivisor(numero[0], numero[1]));
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int calcularMaximoComunDivisor(int numero0, int numero1) {
        int maximoComunDivisor = 0;
        for (int j = numero0; j > 0; j--) {
            if (numero0 % j == 0) {
                if (numero1 % j == 0) {
                    maximoComunDivisor = j;
                    break;
                }
            }
        }
        return maximoComunDivisor;
    }
}
