package App;
import java.util.Scanner;

import modelo.Adaptador;
import modelo.MusicPlayer;
import modelo.ThirdPartyAudioPlayer;

/**
 *  Clase MusicApp que representa la lógica de una aplicación de reproducción de música.
 */
public class MusicApp implements MusicPlayer {
    private MusicPlayer musicPlayer;

    /**
     *  Constructor de MusicApp.
     * 
     *  @param musicPlayer El reproductor de música que se va a utilizar.
     */
    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    /**
     *  Inicia la reproducción de una canción.
     * 
     *  @param fileName El nombre del archivo de la canción.
     */
    public void playSong(String fileName) {
        musicPlayer.playSong(fileName);
    }

    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            // Crea un objeto ThirdPartyAudioPlayer
            ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();

            // Crea un adaptador que envuelva ThirdPartyAudioPlayer
            Adaptador adapter = new Adaptador(thirdPartyAudioPlayer);

            // Crea una instancia de MusicApp usando el adaptador
            MusicApp musicApp = new MusicApp(adapter);

            System.out.println("Ingrese canción a reproducir");
            String cancion = leer.nextLine();
            // Reproduce una canción usando MusicApp
            musicApp.playSong(cancion +".mp3");
        }
    }
}