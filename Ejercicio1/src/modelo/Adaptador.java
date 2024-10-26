package modelo;

/**
 *  Adaptador que implementa la interfaz MusicPlayer para un ThirdPartyAudioPlayer.
 */
public class Adaptador implements MusicPlayer {
    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    /**
     * Constructor del adaptador.
     *
     * @param thirdPartyAudioPlayer El reproductor de audio de terceros que se va a adaptar.
     */
    public Adaptador(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    /**
     * Implementa el método para iniciar la canción.
     * 
     * @param fileName El nombre del archivo de la canción.
     */
    @Override
    public void playSong(String fileName) {
        thirdPartyAudioPlayer.startAudio(fileName);
    }
}