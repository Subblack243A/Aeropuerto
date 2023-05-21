package aeropuerto;

public class Cola {

    Nodo cab = null;
    Nodo col = null;

    public void push(String avion) {
        Nodo nuevo;
        Nodo ant = null;
        if (cab == null) {
            cab = new Nodo(avion);
            ant = cab;
            col = cab;
        } else {
            nuevo = new Nodo(avion);
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
        Nodo p = cab;
        String s = "";
        while (p != null) {
            s += p.avion;
            p = p.sig;
        }
    }
}
