/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsmartfound;

/**
 *
 * @author amigoni.andrea&frigerio.fabrizio
 */


public class Apple extends Smartphone//Ereditarietà di attributi e metodi dalla superclasse Smartphone alla classe Apple
{
    
    public Apple(double display, int ram, double cpu, int mem, double cam, double price) 
    {
        super(display, ram, cpu, mem, cam, price);
    }
    
    public void smart()
{
        if(prezzo>=500)
        {
            
            if(schermo<5.5)
            {
                if(RAM<2)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Iphone 6(540€)");
                }else
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Iphone 6s(620€)");
                }
            }else{
                 if(RAM<2)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Iphone 6 plus(639€)");
                }else
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Iphone 6s plus(739€)");
                }
            }
        }else
        {
            System.out.println("Smartphone inesistente");
        }
    }
    
}
