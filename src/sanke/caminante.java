
package sanke;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class caminante implements Runnable {
    
    panel panelito;
    boolean estado = true;

    public caminante(panel panelito) {
        this.panelito = panelito;
    }
    
    @Override
    public void run() {
        while(estado) {
            panelito.avanzar();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(caminante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
