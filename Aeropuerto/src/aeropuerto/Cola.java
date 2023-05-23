package aeropuerto;

public class Cola {

    Nodo cab = null;
    Nodo col = null;
    Nodo ant = null;

    public void push(String avion) {
        Nodo nuevo;
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

    public void pop() {
        if (cab == null) {
            System.out.println("Cola Vacia");
        } else {
            if (cab.sig == null) {
                cab = null;
                System.out.println("Cola Vacia");
            } else {
                cab = cab.sig;
                cab.ant = null;
            }
        }
    }

    public void popAll(){
        cab.ant = null;
        cab.sig = null;
        cab = null;
    }
    
    public void mostrar() {
        Nodo p = cab;
        String s = "";
        while (p != null) {
            s += p.avion;
            p = p.sig;
        }
        System.out.println(s);
    }
}
