import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int score = 0;
    Turtle turtle = new Turtle();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(turtle, 300,300);
        spawnStraw();
    }
    public void spawnStraw()
    {
        Straw straw = new Straw();
        int x = turtle.getX();
        int y = 25;
        addObject(straw,x,y);
    }
}
