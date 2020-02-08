package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.game.Intro;
import org.academiadecodigo.apiores.players.Jojo;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) {
        Jojo jojo  = new Jojo();



        Intro intro = new Intro();
        intro.init();
        jojo.showPicture();
    }



}
