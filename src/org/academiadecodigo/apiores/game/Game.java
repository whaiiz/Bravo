package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class Game {

    private Intro intro;
    private Play play;
    private static Player[] players;
    private Sound game;


    public Game(){

        intro = new Intro();
        play = new Play();

    }

    public void init()throws InterruptedException{

        Rectangle canvas = new Rectangle(10,10,1280,720);
        canvas.draw();
        game = new Sound("game");
        game.play(true); //inicia
        // game.stop(); //para

        intro.init();
        players = intro.getPlayers();
        play.init();


    }

    public static Player[] getPlayers(){
        return players;
    }



}
