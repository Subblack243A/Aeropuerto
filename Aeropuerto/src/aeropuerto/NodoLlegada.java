
package aeropuerto;

/**
 *
 * @author osfel
 */
public class NodoLlegada {
    NodoLlegada ant;
    NodoLlegada sig;
    String avion;
    public NodoLlegada(String avionLlegada) {
        this.ant = null;
        this.sig = null;
        this.avion = avionLlegada;
    }
}
