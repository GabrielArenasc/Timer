
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class segundos extends Thread{
    
    int j = 0;

        @Override
        public void run(){
            if(j == 0){
                for (int i = 0; i < 60; i++) {     
                    Timer.setsec(i);
                    try {
                        segundos.sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (i==59){

                        i = 0;
                        Minutos.flag = 1;
                    }           
                }
            }else if (j == 1){
            } else{
                j = 0;
            }
                      
        }    
}
