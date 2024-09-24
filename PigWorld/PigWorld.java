// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 465, 112);
        Burger burger2 =  new  Burger();
        addObject(burger2, 353, 136);
        Burger burger3 =  new  Burger();
        addObject(burger3, 490, 36);
        Burger burger4 =  new  Burger();
        addObject(burger4, 455, 211);
        Burger burger5 =  new  Burger();
        addObject(burger5, 222, 65);
        Burger burger6 =  new  Burger();
        addObject(burger6, 119, 138);
        Burger burger7 =  new  Burger();
        addObject(burger7, 93, 319);
        Burger burger8 =  new  Burger();
        addObject(burger8, 458, 344);
        Pig pig =  new  Pig();
        addObject(pig, 289, 217);
        Snake snake =  new  Snake();
        addObject(snake, 31, 367);
    }
}
