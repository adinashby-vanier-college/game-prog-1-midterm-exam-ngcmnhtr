// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * For the Pig to move by pressing left and right keys
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
            move(4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(-3);
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(3);
            move(4);
        }
    }

    /**
     * The Pig can eat Burgers
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * When the Pig eats all burgers, we win!
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transition to Game Won World
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
