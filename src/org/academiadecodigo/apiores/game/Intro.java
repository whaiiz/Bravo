package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Intro implements KeyboardHandler {

    private Player players[] = new Player [2];
    private Picture background = new Picture(10,10,"resources/BackgroundIntro_.png");

    private Picture jojo = new Picture(680, 220, "resources/jojo menu.png");
    private Picture soraia = new Picture(960, 28, "resources/soraia menu.png");

    private Keyboard keyboard = new Keyboard(this);
    private KeyboardEvent space = new KeyboardEvent();

    public boolean isFinished = false;

    public Intro (){

        players[0] = new Jojo();
        players[1] = new Soraia();

    }

    public void init() throws InterruptedException{

        keyListener();

        while (!isFinished){

            for (int i = 0; i < 10; i++) {

                Thread.sleep(50);
                jojo.grow(1, 1);
                soraia.grow(1, 1);
                jojo.translate(0, -1);
                soraia.translate(0, 1);

            }
            for (int i = 0; i < 10; i++) {

                Thread.sleep(50);
                jojo.grow(-1, -1);
                soraia.grow(-1, -1);
                jojo.translate(0, 1);
                soraia.translate(0, -1);

            }

            background.draw();
            jojo.draw();
            soraia.draw();

        }
    }
    public void keyListener(){

        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);

    }
    public void keyPressed(KeyboardEvent var1){

        hideElements();
        isFinished = true;

    }
    public void keyReleased(KeyboardEvent var1){

    }
    public void hideElements(){
        background.delete();
    }
    public Player[] getPlayers(){
        return players;
    }
}