import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String saludoConst = "Hola Mundo!";
        int[] listaNum = new int[]{5,4,3,2,1};

        System.out.println(saludoConst);

        for(var x: listaNum){
            System.out.println("i = " + x);
        }

        System.out.println("****************");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //Metodos en cadenas
        var cadena1 = saludoConst.length();
        var cadena2 = saludoConst.toLowerCase();
        var cadena3 = saludoConst.toUpperCase();
        var cadena4 = saludoConst.replace('o', 'a');
        var cadena5 = saludoConst.substring(0,4);
        var cadena6 = saludoConst.replace("Hola", "Adios");

        //Concatenar cadenas
        var palabra1 = "Hola";
        var palabra2 = "Mundo";
        var palabra3 = palabra1 + " " + palabra2;
        //Metodo concat
        var palabra4 = palabra1.concat(" ").concat(palabra2);
        // StringBuilder
        var constructorCadena = new StringBuilder();
        constructorCadena.append(palabra1).append(" ").append(palabra2);
        var resultadosPalabra = constructorCadena.toString();
        // StringBuffer
        var CadenaBuffer = new StringBuffer();
        CadenaBuffer.append(palabra1).append(" ").append(palabra2);
        var resultadosPalabra2 = CadenaBuffer.toString();
        // Join
        var palabra5 = String.join(" ", palabra1,palabra2);

        //Leer datos en cosola
        Scanner linea = new Scanner(System.in);
        System.out.println("Introduce un dato");
        var dato = linea.nextLine();
        System.out.println("El dato es dato = " + dato);
        System.out.println("Introduce tu edad");
        var edadNext = linea.nextLine();
        System.out.println("El dato es dato = " + Integer.parseInt(dato));

        //Número aleatorios
        Random numRandom = new Random();
        var numAleatorio = numRandom.nextInt(0,10);

        //Formateo de cadenas
        var nameFormat = "Emmanuel";
        var edadFormat = 36;
        var salario = 500.99;
        var mensajeFormat = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nameFormat, edadFormat, salario);

        // Cadena Multilena
        int numEmpleado = 12;
        var mensajeMulti = """
                %nDetalle persona:\s
                ----------------------
                \tN° Empleado: %04d
                \tNombre: %s
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nameFormat,edadFormat,salario);

        /*
        Operadores Aritméticos: +, -, *, /, %
        Operadores de Asignación: =, +=, -=, *=, /=, %=
        Operadores de Comparación: ==, !=, >, <, >=, <=
        Operadores Lógicos: &&, ||, !
        Operadores Unarios: +, -, ++, --, !
        Operadores de Incremento y Decremento: ++, --
        Operador Condicional Ternario: ? :
        Operadores de Bits: &, |, ^, ~, <<, >>, >>>
         */

    }
}