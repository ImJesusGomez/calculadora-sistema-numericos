import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importamos la clase escaner para ingresar datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Le damos la bienvenida al usuario
        System.out.println("-------- Bienvenido al sistema de calculadora --------");

        // Le preguntamos que sistema númerico utilizar
        System.out.println("Selecciona el sistema el sistema númerico: \n1. Decimal \n2. Binario \n3. Octal \n4. Hexadecimales");

        // La elecccion la almacenamos en una variable
        int eleccion;
        eleccion = scanner.nextInt();

        // Dependiendo del sistema numerico que ingreso el usuario, le asignaremos un valor a la variable "sistemaNumerico"
        String sistemaNumerico = "";
        if(eleccion == 1){
            sistemaNumerico = "Decimal";
        } else if (eleccion == 2) {
            sistemaNumerico = "Binario";
        } else if (eleccion == 3) {
            sistemaNumerico = "Octal";
        } else if (eleccion == 4) {
            sistemaNumerico = "Hexadecimal";
        } else {
            System.out.println("Eleccion no válida. Programa Finalizado");
            System.exit(0);
        }

        System.out.println("Sistema " + sistemaNumerico + " seleccionado");

        // Le pedimos dos números al usuario en el sistema que indicó
        System.out.println("------- Ingresa los números -------");

        // Guardamos las variables en un String para evitar excepciones en el caso de que el sistema sea Hexidecimal
        System.out.println("Primer número: ");
        String primerNumero;
        primerNumero = scanner.next();

        System.out.println("Segundo número: ");
        String segundoNumero;
        segundoNumero = scanner.next();

        // Convertimos los numeros de String a int
        int nuevoPrimerNumero = 0;
        int nuevoSegundoNumero = 0;

        if(eleccion == 1){
            nuevoPrimerNumero = Integer.parseInt(primerNumero);
            nuevoSegundoNumero = Integer.parseInt(segundoNumero);
        } else if (eleccion == 2) {
            nuevoPrimerNumero = Integer.parseInt(primerNumero.substring(2), 2);
            nuevoSegundoNumero = Integer.parseInt(segundoNumero.substring(2), 2);
        } else if (eleccion == 3) {
            nuevoPrimerNumero = Integer.parseInt(primerNumero, 8);
            nuevoSegundoNumero = Integer.parseInt(segundoNumero, 8);
        } else if (eleccion == 4) {
            nuevoPrimerNumero = Integer.parseInt(primerNumero.substring(2), 16);
            nuevoSegundoNumero = Integer.parseInt(segundoNumero.substring(2), 16);
        }


        // Preguntamos al usuario que operacion desea hacer
        System.out.println("Selecciona la operación: \n1. Suma \n2. Resta \n3. Multiplicación \n4. División");

        // Almacenamos la eleccion en una variable
        int operacion;
        operacion = scanner.nextInt();

        // Declaramos una variable que almacenara el resultado de la operación
        int resultado = 0;
        String resultadoFormateado = "";

        // Dependiendo del operación que ingreso el usuario, le asignaremos un valor a la variable "operacionARealizar"
        String operacionARealizar = "";
        if(operacion == 1){
            operacionARealizar = "Suma";
            resultado = nuevoPrimerNumero + nuevoSegundoNumero;
        } else if (operacion == 2) {
            operacionARealizar = "Resta";
            resultado = nuevoPrimerNumero - nuevoSegundoNumero;
        } else if (operacion == 3) {
            operacionARealizar = "Multiplicación";
            resultado = nuevoPrimerNumero * nuevoSegundoNumero;
        } else if (operacion == 4) {
            operacionARealizar = "División";
            resultado = nuevoPrimerNumero / nuevoSegundoNumero;
        }  else {
            System.out.println("Eleccion no válida. Programa Finalizado");
            System.exit(0);
        }

        System.out.println("Operacion " + operacionARealizar + " seleccionada");

        // Mostrar el resultado según el sistema numerico
        if(eleccion == 1){
            resultadoFormateado = String.valueOf(resultado);
        } else if (eleccion == 2) {
            resultadoFormateado = Integer.toBinaryString(resultado);
        } else if (eleccion == 3) {
            resultadoFormateado = Integer.toOctalString(resultado);
        } else if (eleccion == 4) {
            resultadoFormateado = Integer.toHexString(resultado);
        }

        System.out.println(operacionARealizar + " de " + primerNumero + " y " + segundoNumero + " es = " + resultadoFormateado + " [Sistema " + sistemaNumerico + "]");

        System.out.println("------------------------------------------");
        // Convertir el resultado
        System.out.println("¿Desea convertir el resultado? 1 = Si/2 = NO");
        int decision = scanner.nextInt();

        String nuevoResultadoFormateado = "";
        if (decision == 1) {
            System.out.println("Selecciona el sistema el sistema númerico: \n1. Decimal \n2. Binario \n3. Octal \n4. Hexadecimales");
            int nuevaEleccion = scanner.nextInt();
            if(nuevaEleccion == 1){
                nuevoResultadoFormateado = String.valueOf(resultado);
            } else if (nuevaEleccion == 2) {
                nuevoResultadoFormateado = Integer.toBinaryString(resultado);
            } else if (nuevaEleccion == 3) {
                nuevoResultadoFormateado = Integer.toOctalString(resultado);
            } else if (nuevaEleccion == 4) {
                nuevoResultadoFormateado = Integer.toHexString(resultado);
            } else {
                System.out.println("Eleccion no válida");
                System.exit(0);
            }
            System.out.println("Nuevo resultado formateado = " + nuevoResultadoFormateado);
        } else if (decision == 2){
            System.out.println("Resultado sin cambios");
        }  else {
            System.out.println("Eleccion no válida. Programa Finalizado");
            System.exit(0);
        }

        System.out.println("------- GRACIAS POR EL USAR EL SISTEMA DE CALCULADORA -------");

    }
}