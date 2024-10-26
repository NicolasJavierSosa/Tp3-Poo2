package Cake;
/**
 * Clase abstracta Cake
 */
public abstract class Cake {

    /**
     * Template Method para la preparación de los pasteles.
     * Prepara los ingredientes, hornea, decora y empaqueta.
     * Este metodo no debe ser modificado por las subclases
     */
    public final void makeCake() {
        prepareIngredients();
        bake();
        decorateCake();
        packCake();
    }

    /*
    void prepareIngredients(){
        System.out.println("Preparando ingredientes...");
    }
    void decorateCake(){
        System.out.println("Decorando...");
    }
    */
    /**
     * Paso general de horneado
     */
    void bake(){
        System.out.println("Cocinando...");
    }
    /**
     * Paso general de empaquetado
     */
    void packCake(){
        System.out.println("Empaquetando...");
    }
    /**
     * Método abstracto para la preparación de ingredientes.
     * Debe ser implementado en las subclases para definir los ingredientes
     * específicos de cada tipo de pastel.
     */
    protected abstract void prepareIngredients();

    /**
     * Método abstracto para la decoración del pastel.
     * Debe ser implementado en las subclases para definir cómo se decora
     * cada tipo de pastel.
     */
    protected abstract void decorateCake();
}
