package paquete2;

/**
 *
 * @author vysery98
 */
public class Clase22 {

    public static void main(String[] args) {

        // uso de expresionLogica ? expresion_1 : expresion_2
        int valor1 = 10;
        int valor2 = 9;

        /*Según el resultado de la comparación -> Si es true, realiza 
        expresion_1 - si es false, realiza expresion_2
         */
        int resultado = valor1 == valor2 ? valor1 + valor2 : valor2 - valor1;

        System.out.printf("resultado es: %d\n", resultado);

    }
}
