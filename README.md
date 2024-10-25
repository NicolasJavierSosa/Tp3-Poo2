# Trabajo Practico 3
---

**Ejercicio 1: Patrón Adapter**

Se eligio está solución debido que el enunciado pide que se integre el servicio externo sin modificar la clase ThirdPartyAudioPlayer.
La clase MusicApp utiliza el patrón Adapter para mantener una interfaz constante y ser independiente de la implementación del reproductor de audio. Si se necesitara integrar un nuevo reproductor de audio, se podría crear un nuevo adaptador que implemente la interfaz ThirdPartyAudioPlayer y la clase MusicApp seguiría funcionando sin cambios.

---

**Ejercicio 2: Patrón Composite**

El patrón Composite es ideal para representar estructuras jerárquicas donde los elementos individuales pueden ser tratados de la misma manera que los grupos de elementos. 
La consigna pide tratar archivos y directorios de manera uniforme, lo que significa que el cliente debe poder interactuar con ambos tipos de objetos de la misma manera.
de esta manera permite: 
Tratar archivos y directorios de manera uniforme utilizando la interfaz común definida por FileSystemComponent.
Mostrar los detalles de la estructura jerárquica de manera recursiva utilizando el método showDetails().

---

**Ejercicio 3: Patrón Template Method**

Es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.
La consigna pide hacer una clase abstracta "Cake" y dos subclase que la utilicen como plantilla heredando algunas funcionalidades y modificando otras según el tipo de pastel.
