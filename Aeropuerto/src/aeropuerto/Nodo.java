
package aeropuerto;

/**
 *
 * @author osfel
 */
public class Nodo {
    Nodo ant;
    Nodo sig;
    String avion;
    int id;
    public Nodo(String avion, int id) {
        this.ant = null;
        this.sig = null;
        this.avion = avion;
        this.id = id;
    }
}
