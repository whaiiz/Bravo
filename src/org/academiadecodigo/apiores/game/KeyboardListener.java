package org.academiadecodigo.apiores;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    private Movable movable;
    private Movable movable1;

    public KeyboardListener(Movable movable/*, Movable movable1*/){

        /*this.movable1 = movable1;*/
        this.movable = movable;

        Keyboard keyboard = new Keyboard(this);

        /*KeyboardEvent space = new KeyboardEvent();
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);

        KeyboardEvent spaceRelease = new KeyboardEvent();
        spaceRelease.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        spaceRelease.setKey(32);
        keyboard.addEventListener(spaceRelease);*/

        //set #1 - One
        KeyboardEvent one = new KeyboardEvent();
        one.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_1);
        keyboard.addEventListener(one);

        //set #2 - Two
        KeyboardEvent two = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_2);
        keyboard.addEventListener(two);

        //set #3 - Three
        KeyboardEvent three = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_3);
        keyboard.addEventListener(three);

        //set #4 - Four
        KeyboardEvent four = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_4);
        keyboard.addEventListener(four);

        //set #5 - Five
        KeyboardEvent five = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_5);
        keyboard.addEventListener(five);

        //set #6 - Six
        KeyboardEvent six = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_6);
        keyboard.addEventListener(six);

        //set #7 - Seven
        KeyboardEvent seven = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_7);
        keyboard.addEventListener(seven);

        //set #8 - Eight
        KeyboardEvent eight = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_8);
        keyboard.addEventListener(eight);

        //set #9 - Nine
        KeyboardEvent nine = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_9);
        keyboard.addEventListener(nine);

        //set #0 - Zero
        KeyboardEvent zero = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_0);
        keyboard.addEventListener(zero);

        //set Space
        KeyboardEvent space = new KeyboardEvent();
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        one.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

            movable.translate(10, 0);
            movable1.translate(10, 0);
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        movable.translate(0,10);
        movable1.translate(0,30);
    }
}
