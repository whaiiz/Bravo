package org.academiadecodigo.apiores.game;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/* invocar metodo de som na classe Game:
    private Sound game;

    game = new Sound("game");
    game.play(true); //inicia
    game.stop(); //para

 //invocar metodo no / yes

    private Sound no;
    private Sound yes;

    yes = new Sound ("yes");
    yes.play(true);
    yes.stop ();

    no = new Sound ("no");
    no.play(true);
    no.stop();
*/

public class Sound {

    private Clip clip;
    private URL soundURL;

    public Sound(String yesNoGame) { // passamos "yes" / "no" para sons de certo ou errado. "Game" para o Jogo.
        initClip(generatePath(yesNoGame));
    }

    /**
     * Plays the clip from the point it was stopped or from start if passed with the fromStart argument false or true
     * @param fromStart should be true if want to replay the sound from the start or false otherwise
     */
    public String generatePath(String string){
        int i;
        switch (string){
            case "yes":{
                i = (int)(Math.random()*4);
                switch (i){
                    case 0: return "resources/yes1.mp3";
                    case 1: return "resources/yes2.mp3";
                    case 2: return "resources/yes3.mp3";
                    case 3: return "resources/yes4.mp3";
                }
            }
            case "no" :{
                i = (int)(Math.random()*3);
                switch (i){
                    case 0: return "resources/no1.mp3";
                    case 1: return "resources/no2.mp3";
                    case 2: return "resources/no3.mp3";
                }
            }
            case "game": return "resources/game.mp3";

        }
        return "resources/game.mp3";
    }

    public void play(boolean fromStart) {

        if (fromStart) {
            clip.setFramePosition(0);
        }
        clip.start();
    }

    public void stop() {

        clip.stop();
    }

    public void close() {

        clip.close();
    }

    public void setLoop(int times) {
        clip.loop(times);
    }

    public void reOpen() {

        AudioInputStream inputStream = null;

        try {

            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip.open(inputStream);

        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void initClip(String path) {

        soundURL = Sound.class.getResource(path); //if loading from jar
        AudioInputStream inputStream = null;

        try {

            if (soundURL == null) {
                path = path.substring(1);
                File file = new File(path);
                soundURL = file.toURI().toURL(); //if executing on intellij
            }

            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(inputStream);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
