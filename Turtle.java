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
    GreenfootImage[] idle = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootSound fail = new GreenfootSound("epicfail.mp3");
    public Turtle()
    {
        for(int i = 0;i < 3;i++)
        {
            idle[i] = new GreenfootImage("images/idle"+i+".png");
        }
        /*idle[0] = new GreenfootImage("images/idle.png");
        idle[1] = new GreenfootImage("images/idleOne.png");
        idle[2] = new GreenfootImage("images/idle.png");*/
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
        if(Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        if(isTouching(Straw.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            removeTouching(Straw.class); 
            fail.play();
        }
        animateTurtle();
    }
    
    
}
