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


public class Android extends Smartphone//Ereditarietà di attributi e metodi dalla superclasse Smartphone alla classe Android 
{
    
    public Android(double display, int ram, double cpu, int mem, double cam, double price) 
    {
        super(display, ram, cpu, mem, cam, price);
    }
    
    public void smart()
{
        
        if(prezzo<=100)
        {
            
            if(schermo<5)
            {
               if(schermo<4.5){
                    System.out.println("Lo smartphone che fa per te risulta essere: Motorola  Moto E 2014(79€)");
               } else{
                 System.out.println("Lo smartphone che fa per te risulta essere: LG Leon 4G(94€)");
            }
                   
            }else{
                if(schermo<5.5)
                    System.out.println("Lo smartphone che fa per te risulta essere: Huawei y 625(88€)");
                else
                {
                    if(fotocamera<13)
                        System.out.println("Lo smartphone che fa per te risulta essere: Doogee X6 Pro(99€)");
                    else
                        System.out.println("Lo smartphone che fa per te risulta essere: Leagoo Alfa 1(99€)");
                }
            
            }
        }
        
        if((prezzo>100)&&(prezzo<=200))
        {
            
            if(schermo>5)
            {
                if(processore<=4)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Asus Zenfone 2 Laser(199€)");
                }else
                {
                     if(memoria<32)
                    {
                        System.out.println("Lo smartphone che fa per te risulta essere: Xiaomi RedMi Note 2 (180€)");
                    }else{
                         System.out.println("Lo smartphone che fa per te risulta essere: Meizu M2 Note(199€)");
                     }
                
                }
            }else{
                 
                if(processore<=4)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Samsung Galaxy J5(150€)");
                }else    
                    System.out.println("Lo smartphone che fa per te risulta essere: Huawei P8 Lite(199€)");
            }
        }
        if((prezzo>200)&&(prezzo<=300))
        {
            
            
            if(schermo>5)
            {
                if(processore<=4)
                    {
                    if(RAM<=3)
                        System.out.println("Lo smartphone che fa per te risulta essere: LG G3(279€");
                    else
                        System.out.println("Lo smartphone che fa per te risulta essere: Asus Zenfone 2 ZE551ML(239€");
                    }
                else
                    {
                         if(fotocamera<=13)
                            System.out.println("Lo smartphone che fa per te risulta essere: Xiaomi RedMi Note 3(220€)");
                        else
                            System.out.println("Lo smartphone che fa per te risulta essere: Meizu MX5(299)");
                    }
            }
            else
            {
                System.out.println("Lo smartphone che fa per te risulta essere: Honor 6 (299€)");
            }        
                
        
        }
        if((prezzo>300)&&(prezzo<=500))
        {
            
            if(schermo<5.5)
            {
               
                    if(schermo<=5)
                        System.out.println("Lo smartphone che fa per te risulta essere: HTC One M9 (400€)");
                    if((schermo>5)&&(schermo<=5.1))
                        System.out.println("Lo smartphone che fa per te risulta essere: Samsung Galaxy S6 (430€)");
                    if((schermo>5.1)&&(schermo<=5.2))
                    {
                        if(fotocamera<=13)
                            System.out.println("Lo smartphone che fa per te risulta essere: Huawei P8 (329€)");
                        if((fotocamera>13)&&(fotocamera<=20))
                            System.out.println("Lo smartphone che fa per te risulta essere: Honor 7 (349€)");
                        if((fotocamera>20)&&(fotocamera<=23))
                            System.out.println("Lo smartphone che fa per te risulta essere: Sony Xperia Z5 (480€)");
                    }
            }else{
                   if(fotocamera<=13)
                       System.out.println("Lo smartphone che fa per te risulta essere: One Plus Two (370€)");
                   else
                       System.out.println("Lo smartphone che fa per te risulta essere: Meizu Pro 5 (399€)");
                 }
        }
        
         if(prezzo>500)
        {
            if(processore<=6)
                {
                    System.out.println("Lo smartphone che fa per te risulta essere: Blackberry Priv (798€");
                }else
                {
                    if(schermo>=5.7)
                            System.out.println("Lo smartphone che fa per te risulta essere: Samsung Galaxy S6 Edge Plus (600€)");
                    else{
                        if(schermo<=5.2)
                            System.out.println("Lo smartphone che fa per te risulta essere: HTC One M9 Plus (599€)");
                        else
                            System.out.println("Lo smartphone che fa per te risulta essere: Sony Xperia Z5 Premium (659€)");
                    }
                }
        }
    }
    
}
