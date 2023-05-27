import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Los pescados son como las lombrices.
 * 
 * Roberto Barreda No. 23354
 */
public class Pescadito extends Actor
{
    public void act() 
    {
        {
            randomTurn();
            move(-5) ;
            turnAtEdge();
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
}
     