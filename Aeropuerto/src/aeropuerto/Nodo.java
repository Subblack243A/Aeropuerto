
package aeropuerto;

/**
 *
 * @author osfel
 */
public class Nodo {
    Nodo ant;
    Nodo sig;
    String avion;
    public Nodo(String avion) {
        this.ant = null;
        this.sig = null;
        this.avion = avion;
    }
}
