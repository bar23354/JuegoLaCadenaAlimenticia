import greenfoot.*;

/**
 * This class defines a fish. Fish live on the beach.
 */
public class Prota extends Actor
{

    private int PescaditosTragados;
    
    public Prota()
    {
        PescaditosTragados = 0;
    }


    public void act()
    {
        move(-6) ;
        BuscandoPescaditos();
        checkKeyPress();


    }
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-9);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            turn(9);
        }
    }

    public void BuscandoPescaditos()
    {
        if ( isTouching(Pescadito.class) ) 
        {
            removeTouching(Pescadito.class);
            Greenfoot.playSound("slurp.wav");

            PescaditosTragados = PescaditosTragados + 1;

            if (PescaditosTragados == 8) 
            {
                Greenfoot.playSound("Victory.wav");
           
                Greenfoot.stop();
            }
        }
    }
}


