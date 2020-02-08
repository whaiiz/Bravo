package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.*;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Intro implements KeyListener {

    private Player p1;
    private Player p2;
    private Player p3;
    private Player p4;

    private Picture background = new Picture(10,10,"resources/introBackground.jpg");

    private Player[] players = {p1, p2};

    public Intro (){
        p1 = new Jojo();
        p2 = new Rita();

    }

    public void init(){

        background.draw();

        Text textStart = new Text(640,310,"Start");
        textStart.draw();
        //JLabel jlbl1 = new JLabel();
        //jlbl1.setLocation(640,310);

    }

    public void keyPressed(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){


    }

    public void keyReleased(KeyEvent e){


    }

}
