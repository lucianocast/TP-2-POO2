import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase Excepciones proporciona métodos para leer el contenido de un archivo.
 */
public class Excepciones {

    /**
     * Lee el contenido de un archivo y lo devuelve como una cadena.
     *
     * @param ruta El path del archivo a leer.
     * @return El contenido del archivo como una cadena.
     * @throws FileNotFoundException Si el archivo no se encuentra en la ruta especificada.
     * @throws IOException Si ocurre un error de entrada/salida durante la lectura del archivo.
     */
    public String leerArchivo(String ruta) throws FileNotFoundException, IOException {
        StringBuilder contenido = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append(System.lineSeparator());
            }
        }
        
        return contenido.toString();
    }

    public static void main(String[] args) {
        Excepciones fileReader = new Excepciones();
        String rutaArchivo = "ruta/del/archivo.txt"; // Acá debe ir la ruta donde se encuentra el archivo
        
        try {
            String contenido = fileReader.leerArchivo(rutaArchivo);
            System.out.println("Contenido del archivo:\n" + contenido);
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo no fue encontrado en la ruta especificada: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: Ocurrió un error de entrada/salida: " + e.getMessage());
        }
    }
}