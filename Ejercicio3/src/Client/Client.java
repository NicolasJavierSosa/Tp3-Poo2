package Client;

import Cake.Cake;
import Cake.ChocolateCake;
import Cake.VanillaCake;

/**
 * Clase cliente que prepara los pasteles.
 */
public class Client {
    /**
     * Método principal que ejecuta el proceso de fabricación de diferentes tipos de pasteles.
     * 
     * @param args Argumentos de línea de comandos, no utilizados en este caso.
     */
    public static void main(String[] args) {
        // Creando y procesando un pastel de chocolate
        Cake chocolateCake = new ChocolateCake();
        chocolateCake.makeCake();

        // Creando y procesando un pastel de vainilla
        Cake vanillaCake = new VanillaCake();
        vanillaCake.makeCake();
    }

}
