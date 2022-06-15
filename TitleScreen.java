import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen of my game
 * 
 * @author Hank Shi
 * @version June 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Dodge the Straws!",60);
    /**
     * Constructor for objects of class TitleScreen. 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel,getWidth()/2,getHeight()/2);
        prepare();
    }

    public void act()
    {
        // Start the game if the user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Display instructions on how to play the game
     */
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle,409,100);
        Label label = new Label ("Use the A and D keys to move",40);
        Label label2 = new Label ("Press <space> to start",40);
        Label label3 = new Label("Note: The turtle values its personal", 40);
        Label label4 = new Label("space, therefore any straw that lands", 40);
        Label label5 = new Label("in the box will result in a game over", 40);
        Label label6 = new Label("box ", 40);
        addObject(label,300,250);
        addObject(label2,300,280);
        addObject(label3,300,310);
        addObject(label4,300,340);
        addObject(label5,300,370);
    }
}
