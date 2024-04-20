import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, op;
        double a, b, c;

        System.out.println("Bienvenido a la calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Ecuación Cuadrática");
        op = scanner.nextInt();

        switch(op) {
            case 1:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextInt();
                int suma = n1 + n2;
                System.out.println("La suma es: " + suma);
                break;

            case 2:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextInt();
                int resta = n1 - n2;
                System.out.println("La diferencia es: " + resta);
                break;

            case 3:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextInt();
                int multiplicacion = n1 * n2;
                System.out.println("El producto es: " + multiplicacion);
                break;

            case 4:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextInt();
                if (n2 != 0) {
                    double division = (double) n1 / n2;
                    System.out.println("El cociente es: " + division);
                } else {
                    System.out.println("No es posible dividir entre cero.");
                }
                break;

            case 5:
                System.out.println("Considerando la forma 'ax^2 + bx + c', defina:");
                System.out.println("a = ");
                a = scanner.nextDouble();
                System.out.println("b = ");
                b = scanner.nextDouble();
                System.out.println("c = ");
                c = scanner.nextDouble();
                double discriminante = b * b - 4 * a * c;
                if (discriminante > 0) {
                    double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("Las raíces son reales y diferentes:");
                    System.out.println("Raíz 1 = " + raiz1);
                    System.out.println("Raíz 2 = " + raiz2);
                } else if (discriminante == 0) {
                    double raiz = -b / (2 * a);
                    System.out.println("La raíz es real y doble:");
                    System.out.println("Raíz = " + raiz);
                } else {
                    System.out.println("Las raíces son complejas:");
                    double parteReal = -b / (2 * a);
                    double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                    System.out.println("Raíz 1 = " + parteReal + " + " + parteImaginaria + "i");
                    System.out.println("Raíz 2 = " + parteReal + " - " + parteImaginaria + "i");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}