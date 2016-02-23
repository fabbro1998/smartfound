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


public class Smartphone //Superclasse Smartphone  
{
    public double schermo;//Attributi superclasse
    public int RAM;
    public double processore;
    public int memoria;
    public double fotocamera;
    public double prezzo;
    
    public Smartphone(double display, int ram, double cpu, int mem, double cam, double price )//Metodo costruttore superclasse
    {
        
        schermo=display;
        RAM=ram;
        processore=cpu;
        memoria=mem;
        fotocamera=cam;
        prezzo=price;
    }
}
