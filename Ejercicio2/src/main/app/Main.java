package app;

import com.example.modelo.Directory;
import com.example.modelo.File;

/**Clase Main */
public class Main {
    /**
     * @param args parametro que usa el programa principal
     */
    
    public static void main(String[] args) {
        /**Crear archivos */ 
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 76);

        /**Crear directorios */ 
        Directory directorio1 = new Directory("Directorio1");
        Directory directorio2 = new Directory("Directorio2");
        Directory directorioPrin = new Directory("Main");

        /**Construir la estructura jerárquica */ 
        directorio1.agregarComponente(file1);  // Añadir archivo a Dir1
        directorio2.agregarComponente(file2);  // Añadir archivo a Dir2
        directorioPrin.agregarComponente(directorio1);  // Añadir Dir1 a Root
        directorioPrin.agregarComponente(directorio2);  // Añadir Dir2 a Root

        /**Mostrar la estructura completa antes de eliminar */ 
        System.out.println("Estructura antes de eliminar un archivo:");
        directorioPrin.showDetails("");  // Mostrar detalles desde el directorio raíz

        //**Eliminar un archivo de directorioPrincipal */ 
        directorio2.eliminarComponente(file2);

        /**  Mostrar la estructura después de eliminar*/
        System.out.println("\nEstructura después de eliminar File3.txt de Dir2:");
        directorioPrin.showDetails("");  /**Mostrar detalles después de la eliminación */
    }
}