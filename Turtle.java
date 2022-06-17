import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The turtle which is trying to dodge plastic straws
 * 
 * @author Hank 
 * @version June 2022
 */
public class Turtle extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootSound fail = new GreenfootSound("epicfail.mp3");
    /**
     * Constructor for objects of class Turtle.
     * 
     */
    public Turtle()
    {
        for(int i = 0;i < 3;i++)
        {
            idle[i] = new GreenfootImage("images/idle"+i+".png");
        }
        setImage(idle[0]);
    }
    int imageIndex = 0;
    /**
     * Animate the turtle
     */
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
        // Move left if A key is pressed
        if(Greenfoot.isKeyDown("A"))
        {
            move(-1);
        }
        // Move right if D key is pressed
        else if(Greenfoot.isKeyDown("D"))
        {
            move(1);
        }
        // Game over if straw touches turtle
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
