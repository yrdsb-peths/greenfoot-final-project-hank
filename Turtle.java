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
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        //addObject(gameOverLabel,300,200);
    }
    public void isHit()
    {
        if(isTouching(Straw.class))
        {
            
        }
    }
}
