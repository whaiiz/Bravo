package org.academiadecodigo.apiores.players;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract  class Player {
    private int position = 0;
    private Picture picture;

    private boolean finishLine = false;
    private boolean currentPlayer = false;


    public Player (Picture picture) {

        this.picture = picture;

   }

    public void move()  {
        picture.translate(100,0);
        position += 100;
    }

    public void showPicture(){
        picture.draw();
    }
    public Picture getPicture(){
        return picture;
    }

    public void deletePicture(){
        this.picture.delete();
    }

    public void drawHL(){}
    public void deleteHL(){}


    public boolean checkFinishLine(){

        if (position >= 850){ //850 CORRECTO
            return true;
        }
        return false;

    }

    public void setCurrentPlayer(){

       if (currentPlayer){
           currentPlayer = false;
           return;
       }
       currentPlayer = true;
    }

}



