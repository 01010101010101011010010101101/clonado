import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        System.out.println("Bienvenido a la calculadora de fracciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese el numerador del primer número:");
                int n1 = scanner.nextInt();
                System.out.println("Ingrese el denominador del primer número:");
                int d1 = scanner.nextInt();
                Fraccion fraccion1 = new Fraccion(n1, d1);

                System.out.println("Ingrese el numerador del segundo número:");
                int n2 = scanner.nextInt();
                System.out.println("Ingrese el denominador del segundo número:");
                int d2 = scanner.nextInt();
                Fraccion fraccion2 = new Fraccion(n2, d2);

                Fraccion suma = fraccion1.sumar(fraccion2);
                System.out.println("La suma en fracción es: " + NotacionCientificaParser.convertirAFraccion(suma.toDouble()));
                System.out.println("La suma en notación científica es: " + NotacionCientificaParser.convertirACientifico(suma.toDouble()));
                break;

            case 2:
                System.out.println("Ingrese el numerador del primer número:");
                int n3 = scanner.nextInt();
                System.out.println("Ingrese el denominador del primer número:");
                int d3 = scanner.nextInt();
                Fraccion subFraccion1 = new Fraccion(n3, d3);

                System.out.println("Ingrese el numerador del segundo número:");
                int n4 = scanner.nextInt();
                System.out.println("Ingrese el denominador del segundo número:");
                int d4 = scanner.nextInt();
                Fraccion subFraccion2 = new Fraccion(n4, d4);

                Fraccion diferencia = subFraccion1.restar(subFraccion2);
                System.out.println("La diferencia en fracción es: " + NotacionCientificaParser.convertirAFraccion(diferencia.toDouble()));
                System.out.println("La diferencia en notación científica es: " + NotacionCientificaParser.convertirACientifico(diferencia.toDouble()));
                break;

            case 3:
                System.out.println("Ingrese el numerador del primer número:");
                int n5 = scanner.nextInt();
                System.out.println("Ingrese el denominador del primer número:");
                int d5 = scanner.nextInt();
                Fraccion mulFraccion1 = new Fraccion(n5, d5);

                System.out.println("Ingrese el numerador del segundo número:");
                int n6 = scanner.nextInt();
                System.out.println("Ingrese el denominador del segundo número:");
                int d6 = scanner.nextInt();
                Fraccion mulFraccion2 = new Fraccion(n6, d6);

                Fraccion producto = mulFraccion1.multiplicar(mulFraccion2);
                System.out.println("El producto en fracción es: " + NotacionCientificaParser.convertirAFraccion(producto.toDouble()));
                System.out.println("El producto en notación científica es: " + NotacionCientificaParser.convertirACientifico(producto.toDouble()));
                break;

            case 4:
                System.out.println("Ingrese el numerador del primer número:");
                int n7 = scanner.nextInt();
                System.out.println("Ingrese el denominador del primer número:");
                int d7 = scanner.nextInt();
                Fraccion divFraccion1 = new Fraccion(n7, d7);

                System.out.println("Ingrese el numerador del segundo número:");
                int n8 = scanner.nextInt();
                System.out.println("Ingrese el denominador del segundo número:");
                int d8 = scanner.nextInt();
                Fraccion divFraccion2 = new Fraccion(n8, d8);

                Fraccion cociente = divFraccion1.dividir(divFraccion2);
                System.out.println("El cociente en fracción es: " + NotacionCientificaParser.convertirAFraccion(cociente.toDouble()));
                System.out.println("El cociente en notación científica es: " + NotacionCientificaParser.convertirACientifico(cociente.toDouble()));
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}
