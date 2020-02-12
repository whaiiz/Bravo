package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Jojo;
import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Finish implements KeyboardHandler {

    private Player winner;
    private Picture imageFinal = new Picture (10,10, "resources/maxresdefault.jpg");
    private Picture backgroundImage = new Picture (10,10, "resources/fim.png");

    private Keyboard keyboard = new Keyboard(this);
    private KeyboardEvent letter_R = new KeyboardEvent();


    public Finish(Player winner){
        this.winner = winner;
        init();

    }

    public void init(){
        //imageFinal = winner.getPicture();
        //imageFinal.draw();
        if(winner instanceof Jojo){
            backgroundImage.load("resources/Fimjojo.png");
        }else{
            backgroundImage.load("resources/Fimsoraia.png");

        }
        backgroundImage.draw();
        keyListener();

    }

    public void keyListener(){

        letter_R.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        letter_R.setKey(KeyboardEvent.KEY_R);
        keyboard.addEventListener(letter_R);


    }

    public void keyPressed(KeyboardEvent var1){

        backgroundImage.delete();
        System.out.println("You pressed R");

       // System.exit(0);
       // Game g1 = new Game();
        //g1.init();


    }

    public void keyReleased(KeyboardEvent var1){

    }


}
