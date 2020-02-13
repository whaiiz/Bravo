package org.academiadecodigo.apiores.game;

import org.academiadecodigo.apiores.players.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Play {

    private Player p1;
    private Player p2;
    private Player currentPlayer = p1;

    private Picture gamePicture = new Picture(10,10,"resources/GameBackground.png");

    private Picture firstPicture;
    private Picture secondPicture;

    private Picture picture0 = new Picture(450, 50, "resources/x.png");
    private Picture picture1 = new Picture(450, 50, "resources/x.png");
    private Picture picture2 = new Picture(450, 50, "resources/x.png");

    private Picture xSign = new Picture(450, 50, "resources/x.png");
    private Picture equalSign = new Picture(600, 50, "resources/=.png");
    private Picture wrongOrRight = new Picture(1000,50, "resources/nothing.png");

    private String answer;
    private KeyboardListener keyboardListener;
    private Player winner;

    private Sound no;
    private Sound yes;


    public void init (){

        p1 = Game.getPlayers()[0];
        p2 = Game.getPlayers()[1];
        gamePicture.draw();
        p1.showPicture();
        p2.showPicture();
        logicGame();

    }

    public void logicGame (){

        if(!p1.checkFinishLine() && !p2.checkFinishLine()) {
            readQuestion();
        }else {
            if(p1.checkFinishLine()) {
                winner = p1;
            }else{
                winner = p2;
            }
            finish();
        }
    }

    public void readQuestion() {

        if (currentPlayer == p1) {
            currentPlayer = p2;
            p2.drawHL();
            p1.deleteHL();

        }else{
           currentPlayer = p1;
           p1.drawHL();
           p2.deleteHL();
        }

        int[] mFactors = Alu.generateMath();

        drawNumbers(mFactors);

        keyboardListener = new KeyboardListener(this); // start reading keyboard input

    }

    public void checkQuestion() {

        answer = keyboardListener.getAnswer();


        if (answer.equals(Alu.getCorrectAnswer())) {

            System.out.println("CORRECTO");
            wrongOrRight.load("resources/yes.png");

            wrongOrRight.draw();

            currentPlayer.move();
            playSound(true);


        } else {

            System.out.println("Wrong");
            wrongOrRight.load("resources/no.png");
            playSound(false);

        }

        System.out.println("ASDASDASDASDASDASDASDASD");
        keyboardListener.cleanAnswer();

        deleteNumbers();

        logicGame();
    }


    private Picture selectPicture(int i) {

        switch (i) {
            case 0:
                return new Picture(370, 50, "resources/0.png");
            case 1:
                return new Picture(375, 50, "resources/1.png");
            case 2:
                return new Picture(390, 50, "resources/2.png");
            case 3:
                return new Picture(380, 50, "resources/3.png");
            case 4:
                return new Picture(380, 50, "resources/4.png");
            case 5:
                return new Picture(380, 50, "resources/5.png");
            case 6:
                return new Picture(375, 50, "resources/6.png");
            case 7:
                return new Picture(380, 50, "resources/7.png");
            case 8:
                return new Picture(365, 50, "resources/8.png");
            case 9:
                return new Picture(370, 50, "resources/9.png");
            case 10:
                return new Picture(370, 50, "resources/10.png");
        }
        return null;
    }

    private void drawFirstPicture(int arrayNumber0) {

        firstPicture = selectPicture(arrayNumber0);
        if(arrayNumber0 == 10) // when picture is then move a little to left
            firstPicture.translate(-40,0);
        firstPicture.draw();

    }

    private void drawSecondPicture(int arrayNumber1){
        secondPicture = selectPicture(arrayNumber1);
        secondPicture.translate(150, 0);
        secondPicture.draw();
    }

    public void drawNumbers(int[] counts) {

        drawFirstPicture(counts[0]);

        xSign.draw();

        drawSecondPicture(counts[1]);

        equalSign.draw();

        if (counts[1] == 10) { // if its then move a little bit to the right
            equalSign.translate(20, 0);
        }

        equalSign.draw();

    }

    public void playSound(boolean yesOrNo){

        if(!yesOrNo) {
            Sound no = new Sound("no");
            no.play(true);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                System.out.println("No sound problem!");

            }
            no.stop();

        }else{
                Sound yes = new Sound("yes");
                yes.play(true);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException exception) {
                    System.out.println("No sound problem!");

                }
                yes.stop();

        }





    }


    public void drawLiveAnswer (int i){
        if (keyboardListener.getAnswerCounter() == 0){
            picture0 = selectPicture(i);
            picture0.translate(320,0);
            picture0.draw();
            keyboardListener.setAnswerCounter(1);
            return;
        }
        if (keyboardListener.getAnswerCounter()==1){
            picture1 = selectPicture(i);
            picture1.translate(400,0);
            picture1.draw();
            keyboardListener.setAnswerCounter(2);
            return;
        }
        if (keyboardListener.getAnswerCounter()==2){
            picture2 = selectPicture(i);
            picture2.translate(480,0);
            picture2.draw();
            keyboardListener.setAnswerCounter(3);
            return;
        }
    }

    public void clearLiveAnswer (){

        picture0.delete();
        picture1.delete();
        picture2.delete();
        keyboardListener.setAnswerCounter(0);

    }

    public void deleteNumbers(){

        firstPicture.delete();
        secondPicture.delete();
        xSign.delete();
        equalSign.delete();

        clearLiveAnswer(); // apaga a resposta do jogador!
    }

    public void finish(){

         gamePicture.delete();
         firstPicture.delete();
         secondPicture.delete();
         xSign.delete();
         equalSign.delete();
         wrongOrRight.delete();
         p1.getPicture().delete();
         p2.getPicture().delete();
         keyboardListener.removeEventListeners();


         Finish f1 = new Finish(winner);

    }

}

