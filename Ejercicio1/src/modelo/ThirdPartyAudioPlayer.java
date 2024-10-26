package modelo;

/**
 *  Clase que representa un reproductor de audio de terceros.
 */
public class ThirdPartyAudioPlayer {

    /**
     *  Inicia la reproducción de audio.
     * 
     *  @param file El nombre del archivo de audio.
     */
    public void startAudio(String file){
        System.out.println("Reproduciendo audio desde ThirdPartyAudioPlayer: " + file);
    }
}