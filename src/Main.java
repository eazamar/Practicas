import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
//Curso Introducción Java
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

        //Sentencias de desición
        //if-else if- else
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }else if(edad < 18){
            System.out.println("Eres menor de edad.");
        }else{
            System.out.println("Ingresaste un dato diferente a la edad");
        }

        //Operador ternario
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        var numero_2 = -5;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";

        //switch
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        int dia_2 = 3;
        String nombreDia;
        nombreDia = switch (dia_2) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7-> "Fin de semana";
            default -> {
                yield "Día inválido"; // Devolver un valor con yield
            }
        };
        System.out.println(nombreDia);

        //Ciclos
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int o = 1;
        do {
            System.out.println(i);
            i++;
        } while (o>0);


    }
}