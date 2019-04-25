/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author vysery98
 */
public class Clase21 {

    public static void main(String[] args) {

        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;

        /* bandera toma el resultado de la comparación entre valor1 y valor2: 
        true*/
        bandera = valor1 < valor2;

        System.out.printf("Resultado de bandera con comparativos: %s\n", bandera);

        bandera = (valor1 < valor2) & (valor1 > valor2); // Producto lógico – \AND (binario)

        System.out.printf("Resultado de bandera usando AND: %s\n", bandera);

        bandera = (valor1 < valor2) | (valor1 > valor2);

        System.out.printf("Resultado de bandera usando OR: %s\n", bandera);

        bandera = !((valor1 < valor2) | (valor1 > valor2)); // Negación - NOT (unario)

        System.out.printf("Resultado de bandera usando NOT: %s\n", bandera);
    }

}
