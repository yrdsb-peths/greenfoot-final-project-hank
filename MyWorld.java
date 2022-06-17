import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world where the turtle lives
 * 
 * @author Hank Shi 
 * @version June 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    public int highScore = 0;
    Turtle turtle = new Turtle();
    Label scoreLabel;
    Label highScoreLabel;
    int level = 3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Display the number of straws the turtle has dodged
        super(600, 400, 1,false); 
        addObject(turtle, 300,300);
        spawnStraw();
        Label score = new Label("Score: ",40);
        scoreLabel = new Label(0,40);
        highScoreLabel = new Label(0,40);
        addObject(score,60,25);
        addObject(scoreLabel,120,25);
    }

    /**
     * Spawn straw at turtle's X coordinate
     * Make straw faster as score increases
     */
    public void spawnStraw()
    {
        Straw straw = new Straw();
        straw.setSpeed(level);
        int x = turtle.getX();
        int y = 25;
        addObject(straw,x,y);
    }

    /**
     * Display game over when straw hits turtle
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel,300,200);
    }

    /**
     * Increase score by 1 when the turtle dodges a straw
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score%5==0)
            level+=2;
    }
}
