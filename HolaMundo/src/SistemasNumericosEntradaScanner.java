import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
            // numeroDecimal = Integer.parseInt(numeroStr);
        }catch(InputMismatchException e) {
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        
        int numeroBinario = 0B111110100;

        String resultadoOctal = "Número octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "Número hexadecimal de " + numeroBinario + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHex;
        System.out.println(mensaje);
    }
}
