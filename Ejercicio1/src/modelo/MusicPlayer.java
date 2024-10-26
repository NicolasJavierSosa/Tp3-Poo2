package modelo;
/**
 *  Interfaz que define el comportamiento básico de un reproductor de música.
 */
public interface MusicPlayer {
    /**
     *  Inicia la reproducción de una canción.
     * 
     *  @param fileName El nombre del archivo de la canción.
     */
    void playSong(String fileName);
}