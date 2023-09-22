import java.util.Scanner;

public class PosNegOCero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String numeroString;
        char numeroChar[];
        System.out.print("Ingresa el caracter a validar si es Positivo, negativo o cero: ");
        numeroString = sc.nextLine();
        sc.close();
        numeroChar = numeroString.toCharArray();
        switch (numeroChar[0]) {
            case '-':
                numeroChar = shift(numeroChar);
                try {
                    Double.parseDouble(numeroString.toString());
                    System.out.println("Es negativo");
                } catch (Exception ex) {
                    System.out.println("Has ingresado un caracter no valido");
                }
                break;
            case '+':
                numeroChar = shift(numeroChar);
            default:
                try {
                    if (Double.parseDouble(numeroString.toString()) != 0)
                        System.out.println("Es positivo");
                    else
                        System.out.println("Es un 0");
                } catch (Exception ex) {
                    System.out.println("Has ingresado un caracter no valido");
                }
                break;
        }
    }

    public static char[] shift(char[] numeroChar) {
        int charLong = numeroChar.length;
        if (charLong == 1)
            return null;
        char[] aux = new char[charLong - 1];
        for (int i = charLong; i > +1; i--) {
            aux[i - 2] = numeroChar[i - 1];
        }
        return aux;
    }
}
