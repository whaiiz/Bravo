package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.*;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Intro implements KeyboardHandler {

    private Player players[];

    private Picture background = new Picture(10,10,"resources/introBackground.jpg");
    private Text textStart = new Text(640,310,"Start");

    Keyboard keyboard = new Keyboard(this);
    KeyboardEvent space = new KeyboardEvent();

    private Play playGame = new Play();

    public Intro (){

        players = new Player[2];
        players[0] = new Jojo();
        players[1] = new Rita();

    }

    public void init(){

        background.draw();
        textStart.draw();
        keyListener();

    }

    public void keyListener(){

        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);


    }

    public void keyPressed(KeyboardEvent var1){
        // when key is pressed
        hideElements();
        //playGame.init(players);

    }

    public void keyReleased(KeyboardEvent var1){

    }

    public void hideElements(){

        background.delete();

    }


}
