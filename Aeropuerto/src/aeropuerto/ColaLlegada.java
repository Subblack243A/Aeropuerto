package aeropuerto;

public class ColaLlegada {

    NodoLlegada cab = null, col = null;

    public void push(String avion) {
        NodoLlegada nuevo, ant = null;
        if (cab == null) {
            cab = new NodoLlegada(avion);
            ant = cab;
            col = cab;
        } else {
            nuevo = new NodoLlegada(avion);
            nuevo.ant = ant;
            ant.sig = nuevo;
            ant = ant.sig;
            col = nuevo;
        }
    }
    
    public void pop(){
        cab = cab.sig;
        cab.ant = null;
    }
    
    public void mostrar(){
        NodoLlegada p = cab;
        String s = "";
        while (p != null) {
            s += p.avion;
            p = p.sig;
        }
    }
}
