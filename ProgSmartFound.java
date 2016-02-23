//PROGRAMMA CHE, DOPO AVER FATTO INSERIRE AL'UTENTE DELLE SPECIFICHE, TROVA LO SMARTPHONE PIU' ADATTO A QUELLE CARATTERISTICHE

package progsmartfound;

import java.io.*;

/**
 *
 * @author amigoni.andrea&frigerio.fabrizio
 */
public class ProgSmartFound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader (input);
        Smartphone S1, S2, S3;//Inizializzazione oggetti della classe Smartphone
        Android A1;//Inizializzazione oggetti della classe Android
        Apple I1;//Inizializzazione oggetti della classe Apple
        WindowsPhone W1;//Inizializzazione oggetti della classe WindowsPhone
        
        
        
        
        try
        {
            int scelta;
            
            System.out.println("PROGRAMMA CHE, DOPO AVER FATTO INSERIRE AL'UTENTE DELLE SPECIFICHE, TROVA LO SMARTPHONE PIU' ADATTO A QUELLE CARATTERISTICHE\n");
            System.out.println("Benvenuto in SmartFound, scegli il sistema operativo che lo smartphone dovrà avere: ");
            System.out.println("1-Android");
            System.out.println("2-iOS");
            System.out.println("3-Windows");
            System.out.print("Inserisci la tua scelta: ");
            scelta=Integer.parseInt(tastiera.readLine());
            System.out.print("\n\n");
            
            switch(scelta)
            {
                case 1:
                    System.out.print("Inserisci le dimensioni dello schermo(in pollici): ");
                    double display=Double.parseDouble(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della RAM(in GB): ");
                    int ram=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci il numero di core del processore: ");
                    int cpu=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della memoria interna(in GB): ");
                    int mem=Integer.parseInt(tastiera.readLine());
                    
                     System.out.print("Inserisci il numero di megapixel della fotocamera: ");
                    double cam=Double.parseDouble(tastiera.readLine());
                    
                     System.out.print("Inserisci la cifra che vuoi spendere(in €): ");
                    double price=Double.parseDouble(tastiera.readLine());
                    S1= new Smartphone(display,ram,cpu,mem,cam,price);//Inizializzazione oggetto della classe Smartphone
                    A1= new Android(display,ram,cpu,mem,cam,price);//Inizializzazione oggetto della classe Android
                    A1.smart();//Richiamo metodo smart nella classe Android
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Inserisci le dimensioni dello schermo(in pollici): ");
                    double idisplay=Double.parseDouble(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della RAM(in GB):");
                    int iram=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci il numero di core del processore: ");
                    int icpu=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della memoria interna(in GB): ");
                    int imem=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci il numero di megapixel della fotocamera: ");
                    double icam=Double.parseDouble(tastiera.readLine());
                    
                    System.out.print("Inserisci la cifra che vuoi spendere(in €): ");
                    double iprice=Double.parseDouble(tastiera.readLine());
                    
                    S2= new Smartphone(idisplay,iram,icpu,imem,icam,iprice);//Inizializzazione oggetto della classe Smartphone
                    I1= new Apple(idisplay,iram,icpu,imem,icam,iprice);//Inizializzazione oggetto della classe Apple
                    I1.smart();//Richiamo metodo smart nella classe Apple
                    
                     
                    break;
                
                case 3:
                    System.out.print("Inserisci le dimensioni dello schermo(in pollici): ");
                    double wdisplay=Double.parseDouble(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della RAM(in GB): ");
                    int wram=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci il numero di core del processore: ");
                    int wcpu=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci le dimensioni della memoria interna(in GB): ");
                    int wmem=Integer.parseInt(tastiera.readLine());
                    
                    System.out.print("Inserisci il numero di megapixel della fotocamera: ");
                    double wcam=Double.parseDouble(tastiera.readLine());
                    
                    System.out.print("Inserisci la cifra che vuoi spendere(in €): ");
                    double wprice=Double.parseDouble(tastiera.readLine());
                    
                    S3= new Smartphone(wdisplay,wram,wcpu,wmem,wcam,wprice);//Inizializzazione oggetto della classe Smartphone
                    W1= new WindowsPhone(wdisplay,wram,wcpu,wmem,wcam,wprice);//Inizializzazione oggetto della classe WindowsPhone
                    W1.smart();//Richiamo metodo smart nella classe WindowsPhone
                      
                    break;
                default:
                    System.out.print("Hai inserito una variabile nulla!!!!!!!!!!");
            }
        } catch(IOException | NumberFormatException e){
                    System.out.println("Si è verificata una eccezione");
                    }
        }
    }
    
