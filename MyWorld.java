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
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        addObject(turtle, 300,300);
        spawnStraw();
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
    }
    public void spawnStraw()
    {
        Straw straw = new Straw();
        int x = turtle.getX();
        int y = 25;
        addObject(straw,x,y);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel,300,200);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
