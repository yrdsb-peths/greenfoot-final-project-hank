import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The straw that the turtle is trying to dodge
 * 
 * @author Hank Shi
 * @version June 2022
 */
public class Straw extends Actor
{
    GreenfootImage idleStraw = new GreenfootImage("images/straw.png");
    int speed = 1;
    /**
     * Constructor for objects of class Straw.
     * 
     */
    public Straw()
    {
        idleStraw.scale(25,50);
        setImage(idleStraw);
    }

    public void act()
    {
        setLocation(getX(),getY()+speed);
        MyWorld world = (MyWorld) getWorld();
        // Spawn new straw when current straw disappears
        if(getY()>=world.getHeight())
        {
            world.spawnStraw();
            world.increaseScore();
            world.removeObject(this);   
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}