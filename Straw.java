import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Straw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Straw extends Actor
{
    /**
     * Act - do whatever the Straw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage idleStraw = new GreenfootImage("images/straw.png");
    public Straw()
    {
        idleStraw.scale(25,50);
        setImage(idleStraw);
    }
    public void act()
    {
        // Add your action code here.

        int speed = Greenfoot.getRandomNumber(5);
        setLocation(getX(),getY()+speed);
        MyWorld world = (MyWorld) getWorld();
        if(getY()>=world.getHeight())
        {
            world.spawnStraw();
            world.increaseScore();
            world.removeObject(this);   
        }
    }
}
