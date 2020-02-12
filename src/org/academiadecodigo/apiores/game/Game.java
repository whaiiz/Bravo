package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

// literally implemented in this moment to init the intro
public class Game {

    private Intro intro;
    private Play play; // ?? do we need it?
    private Finish finish;

    private static Player[] players;


    public Game(){

        // assign a new intro, play
        intro = new Intro();
        play = new Play();
        Rectangle canvas = new Rectangle(10,10,1280,720);
        canvas.draw();

    }

    public void init(){

        // init game
        intro.init();

        players = intro.getPlayers();

        play.init();


    }

    public static Player[] getPlayers(){
        return players;
    }



}
