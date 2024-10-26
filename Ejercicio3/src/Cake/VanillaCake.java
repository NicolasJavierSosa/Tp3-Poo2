package Cake;

/**
 * Subclase del pastel de vainilla
 */
public class VanillaCake extends Cake {
    /**
     * Implementación específica de la preparación de ingredientes para un pastel de vainilla.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para el pastel de vainilla...");
    }

    /**
     * Implementación específica de la decoración para un pastel de vainilla.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de vainilla con glaseado de vainilla...");
    }
}
