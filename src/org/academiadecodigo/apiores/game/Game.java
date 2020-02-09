package org.academiadecodigo.apiores.game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

// literally implemented in this moment to init the intro
public class Game {

    private Intro intro;
    private Play play; // ?? do we need it?
    private Finish finish;


    public Game(){

        // assign a new intro, play
        intro = new Intro();
        play = new Play();
        finish = new Finish();
        Rectangle canvas = new Rectangle(10,10,1280,720);
        canvas.draw();


    }

    public void init(){

        // init game
        intro.init();


    }





}
