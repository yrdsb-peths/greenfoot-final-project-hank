import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Dodge the Straws!",80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
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
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle,409,100);
        Label label = new Label ("Use the A and D to move",40);
        Label label2 = new Label ("Press <space> to start",40);
        addObject(label,300,300);
        addObject(label2,300,350);
    }
}
