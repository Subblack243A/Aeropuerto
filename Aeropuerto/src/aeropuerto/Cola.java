package aeropuerto;

public class Cola {

    Nodo cab = null;
    Nodo col = null;
    Nodo ant = null;

    public void push(String avion, int id) {
        Nodo nuevo;
        if (cab == null) {
            cab = new Nodo(avion, id);
            ant = cab;
            col = cab;
        } else {
            nuevo = new Nodo(avion, id);
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

    public void popId(int id){
        Nodo p = cab, ant, sig;
        while(p != null){
            if(p.id == id){
                if(p.sig == null){
                    cab = null;
                    System.out.println("Cola Vacia");
                }else{
                    if(p.ant == null){
                        cab = cab.sig;
                        cab.ant = null;
                    }else{
                        ant = p.ant;
                        sig = p.sig;
                        ant.sig = sig;
                        sig.ant = ant;
                    }
                }
            }
            p = p.sig;
        }
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
