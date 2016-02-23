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
public class WindowsPhone extends Smartphone//Ereditarietà di attributi e metodi dalla superclasse Smartphone alla classe WindowsPhone 
{
    
    public WindowsPhone(double display, int ram, double cpu, int mem, double cam, double price) 
    {
        super(display, ram, cpu, mem, cam, price);
    }
        
public void smart()
{
    if(prezzo<=100)
        {
            
            if(schermo<5)
            {
               
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 532(65€)");
            }else{
                
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 535(97€)");
                }
        }
        
        if((prezzo>100)&&(prezzo<=200))
        {
            
            if(schermo<5)
            {
                if(processore<=2)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 625(162€");
                }else
                {
                     if(fotocamera<13)
                    {
                        System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 730(189€");
                    }else{
                         System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 640(130€");
                     }
                
                }
            }else{
                 
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 640 XL(170€)");
                
            }
        }
        if((prezzo>200)&&(prezzo<=300))
        {
            
            
            if(schermo<6)
            {
                if(processore<=2)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 925(289€");
                }else
                {
                         System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 830(299€)");
                }
                
                }
            }else{
                 
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 1320(230€)");
                
            }
        if((prezzo>300)&&(prezzo<=500))
        {
            
            if(schermo<5)
            {
               
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 920(499€)");
            }else{
                
                    System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 930(329€)");
                }
        }
        
         if(prezzo>500)
        {
            System.out.println("Lo smartphone che fa per te risulta essere: Microsoft Lumia 1020(620€)");
        }
    
    
}
}
    

