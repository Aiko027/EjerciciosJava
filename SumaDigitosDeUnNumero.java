import java.util.Scanner;

public class SumaDigitosDeUnNumero {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        int cantidadDeDigitos;
        System.out.println("Ingrese el numero a sumar sus digitos");
        String numeroString = sc.nextLine();
        sc.close();
        cantidadDeDigitos = numeroString.length();
        char[] numeroDescompuestoEnDigitos = new char[cantidadDeDigitos];
        numeroDescompuestoEnDigitos = numeroString.toCharArray();
        int suma = 0;
        for (int j = 0; j < cantidadDeDigitos; j++) {
            suma = suma + Character.getNumericValue(numeroDescompuestoEnDigitos[j]);
        }
        System.out.println("La suma de los digitos es: " + suma);
    }
}
