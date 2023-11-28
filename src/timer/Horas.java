/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

/**
 *
 * @author FLIA ARENAS CARMONA
 */
public class Horas extends Thread{
    static int frag;
        
    public Horas (int frag){
        this.frag = frag;          
    }

    @Override
    public void run(){
        int hor = 0;
        while (true){                
            System.out.println("Cambio efectuado " + frag);            
            if (frag == 1){                 
                hor += 1;
                Timer.sethor(hor);
                System.out.println("Incremento min....");
                frag = 0;
            }                
        }           
    }
}
