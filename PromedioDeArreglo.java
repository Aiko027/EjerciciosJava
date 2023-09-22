import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromedioDeArreglo {
    public static void main(String args[]) {
        clean();
        Scanner sc = new Scanner(System.in);
        boolean aux = true;
        String valorIngresado = null;
        double suma = 0, promedio = 0;
        List<Double> listaNumeros = new ArrayList<>();
        System.out.print("Ingrese los numeros de los que se quiere sacar promedio.\n");
        do {
            System.out.println("Una vez que termine de ingresar los valores ingrese el caracter \' @ \'");
            System.out.println("Numero de valores leidos: " + listaNumeros.size());
            System.out.print("Ingrese el siguiente valor:");
            valorIngresado = sc.nextLine();
            clean();
            if (valorIngresado.equals("@"))
                aux = false;
            else {
                try {
                    listaNumeros.add((Double.parseDouble(valorIngresado)));
                } catch (Exception ex) {
                    System.out.println("Has ingresado un digito no correcto. Intente nuevamente.");
                }
            }
        } while (aux);
        sc.close();
        for (Double elemento : listaNumeros) {
            suma = suma + elemento;
        }
        promedio = suma / listaNumeros.size();
        System.out.println("El promedio de los elementos es: " + promedio);
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
