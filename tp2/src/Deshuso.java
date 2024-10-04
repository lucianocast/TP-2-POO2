/*Escenario 2: Método obsoleto con sugerencia de uso alternativo
Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
*/
public class Deshuso{
    /**
    * Este método a quedado obsoleto
    * @deprecated Este metodo esta obsoleto y no se recomienda su uso.
    * Utiliza {@link #nuevometodo()} en su lugar
    *
    */
    @Deprecated
    public void metodoObsoleto() {
    System.out.println("Este metodo esta obsoleto");
    }
    /**
    * Este es el nuevo método recomendado.
    */
    public void nuevoMetodo() {
    // Implementación nueva
    System.out.println("Este es el nuevo método.");
    }
    
    public static void main(String[] args) {
    Deshuso ejemplo = new Deshuso();
    
    // Llamada al método obsoleto (se recomienda evitar su uso)
    ejemplo.metodoObsoleto();
    
    // Llamada al nuevo método
    ejemplo.nuevoMetodo();
    }
    }