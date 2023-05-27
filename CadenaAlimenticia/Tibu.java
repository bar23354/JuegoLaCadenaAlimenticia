import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tibu extends Actor
{ 
    private GreenfootImage image1;
    private GreenfootImage image2;
    int counter = 0;

    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Tibu()
    {
        image1 = new GreenfootImage("finalshark.png");
        image2 = new GreenfootImage("sharkmoving1.png");
    }

    public void act() 
    {
        {
            randomTurn();
            switchImage();
            move(2) ;

            turnAtEdge();

            Buscando();
        }
    }

    public void switchImage()
    {
        counter ++;
        if (counter == 6)
        {
            if (getImage () == image1)
            {
                setImage(image2);
            }
            else
            {
                setImage(image1);
            }
            counter = 0;
        }
    }

    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(17);
        }
    }

    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10)
        {
            turn( Greenfoot.getRandomNumber(90)-45 ); 
        }
    }

    /**
     * Check whether we have stumbled upon a Crab
     * If we have, eat it. if not, do nothing
     */
    public void Buscando()
    {
        if ( isTouching(Prota.class) )
        {
            removeTouching(Prota.class);

        }
    }

} 