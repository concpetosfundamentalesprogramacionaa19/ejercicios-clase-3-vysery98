package paqueteprincipal2;

//import paquetedatos.*; /* llama a todas las clases del paquete */
import paquetedatos.Variable; /* es válido */
import paquetedatos.VariableDos;

/**
 *
 * @author vysery98
 */
public class Principal {

    public static void main(String[] args) {
        // método principal
        double resultado;
        double resultado2;

        resultado = Variable.numero1 + Variable.numero2;

        System.out.printf("El resultado es: %.1f\n", resultado);

        resultado2 = Variable.numero1 + VariableDos.numero3;

        System.out.printf("El resultado es: %.1f\n", resultado2);

    }

}
