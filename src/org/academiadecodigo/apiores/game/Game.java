package org.academiadecodigo.apiores.game;
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

    }

    public void init(){

        // init game
        intro.init();


    }





}
