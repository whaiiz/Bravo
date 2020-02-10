package org.academiadecodigo.apiores.game;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    private Movable movable;
    private int keyOutput;
    private String answer = "";

    private boolean isListening = true;

    private boolean listen = true;

    Keyboard keyboard ;
    private KeyboardEvent number_1;
    private KeyboardEvent number_2;
    private KeyboardEvent number_3;
    private KeyboardEvent number_4;
    private KeyboardEvent number_5;
    private KeyboardEvent number_6;
    private KeyboardEvent number_7;
    private KeyboardEvent number_8;
    private KeyboardEvent number_9;
    private KeyboardEvent number_0;
    private KeyboardEvent space;

    private Play play;

    public KeyboardListener(Play play){

        this.movable = movable;

        this.play= play;

        keyboard = new Keyboard(this);

        number_1 = new KeyboardEvent();
        number_1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_1.setKey(KeyboardEvent.KEY_1);
        keyboard.addEventListener(number_1);

        number_2 = new KeyboardEvent();
        number_2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_2.setKey(KeyboardEvent.KEY_2);
        keyboard.addEventListener(number_2);

        number_3 = new KeyboardEvent();
        number_3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_3.setKey(KeyboardEvent.KEY_3);
        keyboard.addEventListener(number_3);

        number_4 = new KeyboardEvent();
        number_4.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_4.setKey(KeyboardEvent.KEY_4);
        keyboard.addEventListener(number_4);

        number_5 = new KeyboardEvent();
        number_5.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_5.setKey(KeyboardEvent.KEY_5);
        keyboard.addEventListener(number_5);

        number_6 = new KeyboardEvent();
        number_6.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_6.setKey(KeyboardEvent.KEY_6);
        keyboard.addEventListener(number_6);

        number_7 = new KeyboardEvent();
        number_7.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_7.setKey(KeyboardEvent.KEY_7);
        keyboard.addEventListener(number_7);

        number_8 = new KeyboardEvent();
        number_8.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_8.setKey(KeyboardEvent.KEY_8);
        keyboard.addEventListener(number_8);

        number_9 = new KeyboardEvent();
        number_9.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_9.setKey(KeyboardEvent.KEY_9);
        keyboard.addEventListener(number_9);

        number_0 = new KeyboardEvent();
        number_0.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        number_0.setKey(KeyboardEvent.KEY_0);
        keyboard.addEventListener(number_0);

        KeyboardEvent space = new KeyboardEvent();
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);
    }
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch(keyboardEvent.getKey()) {
            case 32:
                System.out.println("space pressed");
                play.checkQuestion();
                break;
            case 48:
                System.out.println("you pressed zero");
                answer += "0";
                listen = false;
                break;

            case 49:
                System.out.println("you pressed one");
                answer += "1";
                System.out.println(answer);
                break;
            case 50:
                System.out.println("you pressed two");
                answer +="2";
                break;
            case 51:
                System.out.println("you pressed three");
                answer +="3";
                break;
            case 52:
                System.out.println("you pressed four");
                answer +="4";
                break;
            case 53:
                System.out.println("you pressed five");
                answer +="5";
                break;
            case 54:
                System.out.println("you pressed six");
                answer +="6";
                break;
            case 55:
                System.out.println("you pressed seven");
                answer +="7";
                break;
            case 56:
                System.out.println("you pressed eight");
                answer +="8";
                break;
            case 57:
                System.out.println("you pressed nine");
                answer +="9";
                break;
            default:
                System.out.println("you pressed  o crl");
        }
    }


    public String getAnswer(){
        return answer;
    }

    public void removeEventListeners(){

        keyboard.removeEventListener(number_0);
        keyboard.removeEventListener(number_1);
        keyboard.removeEventListener(number_2);
        keyboard.removeEventListener(number_3);
        keyboard.removeEventListener(number_4);
        keyboard.removeEventListener(number_5);
        keyboard.removeEventListener(number_6);
        keyboard.removeEventListener(number_7);
        keyboard.removeEventListener(number_8);
        keyboard.removeEventListener(number_9);
        keyboard.removeEventListener(space);

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public boolean getIsListening (){
        return isListening;
    }

}

