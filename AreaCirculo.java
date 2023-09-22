import java.util.Scanner;

class AreaCirculo {
    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        String radioCirculo;
        final float pi = 3.1416f;
        double areaCirculo;
        System.out.println("Ingrese el radio del circulo:");
        radioCirculo = sr.nextLine();
        sr.close();
        try {
            Math.pow(Float.parseFloat(radioCirculo), 2);
            areaCirculo = pi * Math.pow(Integer.parseInt(radioCirculo), 2);
            System.out.println("El área del circulo es: " + String.format("%.2f", areaCirculo));
        } catch (Exception ex) {
            System.out.println("Se ha ingresado un caracter no valido");
        }

    }
}