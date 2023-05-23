
package aeropuerto;

/**
 *
 * @author osfel
 */
public class NodoAvl {
    int altura;
    int dato;
    int peso;
    String info;
    NodoAvl izq;
    NodoAvl der;
    
    NodoAvl(int dato, String info){
        this.dato=dato;
        this.altura = 1;
        this.info = info;
        this.izq = this.der = null;
    }
}
