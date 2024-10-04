/**
 * La clase IMC proporciona métodos para calcular el índice de masa corporal (IMC).
 */
public class IMC {

    /**
     * Calcula el índice de masa corporal (IMC) a partir del peso y la altura.
     *
     * @param peso El peso de la persona en kilogramos (kg).
     * @param altura La altura de la persona en metros (m).
     * @return El valor del IMC, que es el peso dividido por la altura al cuadrado.
     * @throws IllegalArgumentException Si el peso o la altura son menores o iguales a cero.
     */
    public double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que cero.");
        }
        
        return peso / (altura * altura);
    }

    /**
     * Devuelve una categoría de IMC basada en el valor calculado.
     *
     * @param imc El índice de masa corporal calculado.
     * @return La categoría correspondiente al IMC: "Bajo peso", "Peso normal", "Sobrepeso" o "Obesidad".
     */
    public String categoriaIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public static void main(String[] args) {
        IMC calculadora = new IMC();
        double peso = 70;
        double altura = 1.75;
        double imc = calculadora.calcularIMC(peso, altura);
        String categoria = calculadora.categoriaIMC(imc);
        System.out.printf("El IMC es: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);
    }
}