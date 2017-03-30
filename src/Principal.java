import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alumnos on 30/03/2017.
 */

public class Principal {

    /**
     * Este método realiza la división de dos números
     * @param num1 valor del primer número
     * @param num2 valor del segundo número
     * @return regresa la división de los números
     */

    public static int divideNumeros(int num1, int num2)
    {
        return num1/num2;
    }
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);

        boolean correcto = false;
        int numero = 0;
        do {
            try {
                numero = 1;
                System.out.println("Valor del primer numero ");
                int numero1 = entrada.nextInt();

                numero = 2;
                System.out.println("Valor del segundo numero ");
                int numero2 = entrada.nextInt();

                int resultado = divideNumeros(numero1, numero2);
                System.out.println("El resultado es igual a : " + resultado);
                correcto = true;
            }   catch (InputMismatchException excepcionEntrada) {
                System.out.println("Error en el numero "+numero);
                System.out.println("La entrada no concuerda con un número entero");
                entrada.nextLine();
                }
                catch(ArithmeticException excepcionAritmetica){
                System.out.println("Error en el numero "+numero);
                System.out.println("El denominador no puede ser 0");
                }
        }while(!correcto);
    }
}
