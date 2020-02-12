package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;
public class Rita extends Player {

    private static Picture p1 = new Picture(80,450,"resources/Soraia.png");
    private static Picture arrowPosition = new Picture(100,400,"resources/arrow.png");
    private static Picture winningImage = new Picture(10,10, "resources/Ricardo.png");

    public Rita() {

        super(p1,arrowPosition,winningImage);


    }

    public void drawHL(){
        p1.load("resources/soraiahl.png");
    }
    public void deleteHL(){
        p1.load("resources/Soraia.png");
    }

    public String toString(){
        return "Rita";
    }





}
