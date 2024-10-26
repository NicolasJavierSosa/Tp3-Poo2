package Cake;

/**
 * Subclase del pastel de chocolate
 */
public class ChocolateCake extends Cake {
    /**
     * Implementación específica de la preparación de ingredientes para un pastel de chocolate.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para el pastel de chocolate...");
    }

    /**
     * Implementación específica de la decoración para un pastel de chocolate.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de chocolate con virutas de chocolate...");
    }
}
