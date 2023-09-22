import java.util.Scanner;

public class AnioBiciesto {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        int numero = 0;
        boolean exit, biciesto = false;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa el año para verificar si es biciesto: ");
            aux = sc.nextLine();
            try {
                numero = Integer.parseInt(aux);
                exit = true;
            } catch (NumberFormatException ex) {
                System.out.println(
                        "El año ingresado no es correcto, debe ser entero y no debe contener caracteres");
                System.out.println(
                        "Presiona enter para volver a intentar...");
                sc.nextLine();
            }
        } while (!exit);
        sc.close();
        if (numero % 4 == 0)
            if (numero % 100 == 0)
                if (numero % 400 == 0)
                    biciesto = true;
                else
                    ;
            else
                biciesto = true;
        if (!biciesto)
            System.out.println("El año " + numero + " no es biciesto");
        else
            System.out.println("El año " + numero + " es biciesto");

    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
