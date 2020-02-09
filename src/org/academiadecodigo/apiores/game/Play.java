package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Play {

    private Player p1;
    private Player p2;

    private Player currentPlayer;

    private Picture gamePicture = new Picture(10,10,"resources/GameBackground.png");

   // private KeyboardListener keyboardListener = new KeyboardListener(gamePicture);

    // private boolean winner = false;


    public Player  init (){

        p1 = Game.getPlayers()[0];
        p2 = Game.getPlayers()[1];

        gamePicture.draw();
        p1.getPicture().draw();
        p2.getPicture().draw();
        walk();
        return currentPlayer;


    }

    public void walk(){

        while (p1.getFinishLine() == false || p2.getFinishLine()== false) {

            if (currentPlayer == p1){
                currentPlayer = p2;
                return;
            }
            currentPlayer = p1;

            int[] mFactors = Alu.generateMath();

            drawNumbers(mFactors);

            KeyboardListener keyboardListener = new KeyboardListener(gamePicture);

            String answer = keyboardListener.getAnswer();

            if (answer == Alu.getCorrectAnswer()) {
                //correctSymbol.draw();
                currentPlayer.move();

                //precisamos de um delay!!


            }


        }

    }


    private Picture selectPicture(int i) {

        switch (i) {
            case 0:
                Picture firstNumber0 = new Picture(370, 50, "resources/0.png");
                return firstNumber0;
            //firstNumber0.draw();
            //break;
            case 1:
                Picture firstNumber1 = new Picture(375, 50, "resources/1.png");
                return firstNumber1;
            //firstNumber1.draw();
            //break;
            case 2:
                Picture firstNumber2 = new Picture(390, 50, "resources/2.png");
                return firstNumber2;
            //firstNumber2.draw();
            //break;
            case 3:
                Picture firstNumber3 = new Picture(380, 50, "resources/3.png");
                return firstNumber3;
            //firstNumber3.draw();
            //break;
            case 4:
                Picture firstNumber4 = new Picture(380, 50, "resources/4.png");
                return firstNumber4;
            //firstNumber4.draw();
            //break;
            case 5:
                Picture firstNumber5 = new Picture(380, 50, "resources/5.png");
                return firstNumber5;
            //firstNumber5.draw();
            //break;
            case 6:
                Picture firstNumber6 = new Picture(375, 50, "resources/6.png");
                return firstNumber6;
            //firstNumber6.draw();
            //break;
            case 7:
                Picture firstNumber7 = new Picture(380, 50, "resources/7.png");
                return firstNumber7;
            //firstNumber7.draw();
            //break;
            case 8:
                Picture firstNumber8 = new Picture(365, 50, "resources/8.png");
                return firstNumber8;
            //firstNumber8.draw();
            //break;
            case 9:
                Picture firstNumber9 = new Picture(370, 50, "resources/9.png");
                return firstNumber9;
            //firstNumber9.draw();
            //break;
            case 10:
                Picture firstNumber10 = new Picture(370, 50, "resources/10.png");
                return firstNumber10;
            //firstNumber10.draw();
            //break;
        }
        return null;
    }

    private void drawFirstPicture(int counts[]) {

        if(counts[0] == 10) {

            Picture ten = selectPicture(counts[0]);
            ten.translate(-40,0);
            ten.draw();
        }else {
            selectPicture(counts[0]).draw();
        }
        Picture multiplication = new Picture(450, 50, "resources/x.png");
        multiplication.draw();

    }

    private void drawSecondPicture(int counts[]){
        Picture picture = selectPicture(counts[1]);
        picture.translate(150, 0);
        picture.draw();
        Picture iqual = new Picture(600, 50, "resources/=.png");
        if(counts[1] == 10){
            iqual.translate(20,0);
            iqual.draw();
        }

        iqual.draw();
    }

    public void drawNumbers(int counts[]){
        
        drawFirstPicture(counts);
        drawSecondPicture(counts);
    }



    public void show(){

    }








}

