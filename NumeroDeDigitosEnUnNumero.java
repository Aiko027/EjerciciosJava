import java.util.Scanner;

public class NumeroDeDigitosEnUnNumero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        int numero = 0;
        boolean exit = false;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa el numero a calcular el la cantidad de digitos: ");
            aux = sc.nextLine();
            try {
                numero = Integer.parseInt(aux);
                exit = true;
            } catch (NumberFormatException ex) {
                System.out.println(
                        "El valor ingresaro no es correcto, debe ser entero y no debe contener caracteres");
                System.out.println(
                        "Presiona enter para volver a intentar...");
                sc.nextLine();
            }
        } while (!exit);
        sc.close();
        aux = Integer.toString(numero);
        System.out.println("el numero de digitos del numero es:" + aux.length());
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
