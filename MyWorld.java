import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    public int highScore = 0;
    Turtle turtle = new Turtle();
    Label scoreLabel;
    Label highScoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        addObject(turtle, 300,300);
        spawnStraw();
        Label score = new Label("Score: ",40);
        scoreLabel = new Label(0,40);
        highScoreLabel = new Label(0,40);
        addObject(score,60,25);
        addObject(scoreLabel,120,25);
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
