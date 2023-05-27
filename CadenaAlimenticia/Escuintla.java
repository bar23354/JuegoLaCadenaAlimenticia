import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escuintla, lugar de arenas y mujeres negras.
 * 
 * Roberto Barreda No. 23354 
 */
public class Escuintla extends World
{
    public Escuintla()
    {    
        super(700, 700, 1); 
        prepare();
        MusicaFondo music = new MusicaFondo();
        addObject(music, 0, 0);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Prota prota = new Prota();
        addObject(prota,346,341);
        Tibu tibu = new Tibu();
        addObject(tibu,61,646);
        Tibu tibu2 = new Tibu();
        addObject(tibu2,620,69);
        Pescadito pescadito = new Pescadito();
        addObject(pescadito,78,156);
        Pescadito pescadito2 = new Pescadito();
        addObject(pescadito2,238,66);
        Pescadito pescadito3 = new Pescadito();
        addObject(pescadito3,242,397);
        Pescadito pescadito4 = new Pescadito();
        addObject(pescadito4,624,146);
        Pescadito pescadito5 = new Pescadito();
        addObject(pescadito5,582,636);
        Pescadito pescadito6 = new Pescadito();
        addObject(pescadito6,287,536);
        Pescadito pescadito7 = new Pescadito();
        addObject(pescadito7,559,291);
        Pescadito pescadito8 = new Pescadito();
        addObject(pescadito8,120,294);
        Pescadito pescadito9 = new Pescadito();
        addObject(pescadito9,255,582);
        Pescadito pescadito10 = new Pescadito();
        addObject(pescadito10,598,465);
        Pescadito pescadito11 = new Pescadito();
        addObject(pescadito11,62,486);
        tibu.setLocation(135,530);
        tibu2.setLocation(457,151);
        Tibu tibu3 = new Tibu();
        addObject(tibu3,504,471);
    }
}
