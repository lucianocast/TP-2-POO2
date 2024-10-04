/**
* Escenario 1: Escenario 1: Método que lanza una excepción
* Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.
*/

public class Division {
    /**
    * Método que lanza una excepción si el divisor es 0
    * @param numerador Variable que recibe un entero como numerador
    * @param denominador Variable que recibe un entero como denomiador
    * @param resultado Variable que devuelve el resultado de la división
    * @return Devuelve el resultado de una división
    * @throws ArithmeticException Si la división es por 0 se crea una excepción
    * @author Luciano
    */
    
    public static double dividir( double numerador, double denominador) throws ArithmeticException {
    if( denominador == 0){
    throw new ArithmeticException( "Division por cero no permitida");
    }
    return numerador/ denominador;
    }
    public static void main(String[] args) throws Exception {
    try{
    double resultado = dividir(10, 0);
    System.out.println("Resultado:" + resultado);
    }catch (ArithmeticException e){
    System.out.println("Error:" + e.getMessage());
    }
    
    }
    }