import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author Hank 
 * @version June 2022
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world = (MyWorld) getWorld();
    GreenfootImage[] idle = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    public Turtle()
    {
        for(int i = 0;i < 3;i++)
        {
            idle[i] = new GreenfootImage("images/idle"+i+".png");
        }
        setImage(idle[0]);
    }
    int imageIndex = 0;
    public void animateTurtle()
    {
        if(animationTimer.millisElapsed()<100)
            return;
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex+1)%idle.length;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        if(isTouching(Straw.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
        animateTurtle();
    }
    
    
}
