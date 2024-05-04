public class NotacionCientificaParser {

    public static String convertirACientifico(double numero) {
        // Verificar si el número es cero
        if (numero == 0) {
            return "0";
        }

        // Calcular el exponente
        int exponente = (int) Math.floor(Math.log10(Math.abs(numero)));

        // Normalizar el número
        double base = numero / Math.pow(10, exponente);

        // Generar la representación en notación científica
        String resultado = String.format("%.2f", base) + " x 10^" + exponente;

        return resultado;
    }

    public static String convertirAFraccion(double numero) {
        // Definir la precisión para la aproximación de la fracción
        final double PRECISION = 1E-10;

        // Convertir el número a fracción
        int signo = (numero < 0) ? -1 : 1;
        numero = Math.abs(numero);
        int numerador = 0;
        int denominador = 1;
        double fraccion = numerador / (double) denominador;

        while (Math.abs(fraccion - numero) > PRECISION) {
            if (fraccion < numero) {
                numerador++;
            } else {
                denominador++;
                numerador = (int) Math.round(numero * denominador);
            }
            fraccion = numerador / (double) denominador;
        }

        // Aplicar el signo al numerador
        numerador *= signo;

        // Generar la representación de la fracción
        String resultado = numerador + "/" + denominador;

        return resultado;
    }
}