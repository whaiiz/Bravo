package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Intro implements KeyboardHandler {

    private Player players[] = new Player [2];

    private Picture background = new Picture(10,10,"resources/BackgroundIntro.png");

    Keyboard keyboard = new Keyboard(this);
    KeyboardEvent space = new KeyboardEvent();

    //private Play playGame = new Play();

    public boolean isFinished = false;



    public Intro (){

        players[0] = new Jojo();
        players[1] = new Rita();

    }

    public void init(){

        keyListener();
        //background.draw();
        while (isFinished == false){

            background.draw();
        }


    }

    public void keyListener(){

        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);


    }

    public void keyPressed(KeyboardEvent var1){
        // when key is pressed
        hideElements();
        isFinished = true;
        //playGame.init(players);

    }

    public void keyReleased(KeyboardEvent var1){

    }

    public void hideElements(){

        background.delete();

    }

    public void finish(){

        isFinished = true;

    }

    public Player[] getPlayers(){
        return players;
    }


}
