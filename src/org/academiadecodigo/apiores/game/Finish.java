package org.academiadecodigo.apiores.game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Finish {

    private Picture imageFinal = new Picture (10,10, "resources/maxresdefault.jpg");

    public void init(){
        imageFinal.draw();
        System.out.println("The end");
    }


    public Picture getImageFinal(){
        return imageFinal;
    }
}
