
package aeropuerto;

public class Arbol {
     
   private NodoAvl raiz;
   
   void clearAll(){
       setRaiz(null);
   }
 
    public void insertar(int dato, String info) {
        setRaiz(insertarAvl(getRaiz(), dato,info));
    }
    
    private NodoAvl insertarAvl(NodoAvl nuevo, int dato, String info) {
        if (nuevo == null) {
            return (new NodoAvl(dato,info));
        }
        
        if (dato < nuevo.dato) {
            nuevo.izq = insertarAvl(nuevo.izq, dato,info);
        }else if (dato > nuevo.dato) {
            nuevo.der = insertarAvl(nuevo.der, dato,info);
        }else {
            return nuevo;
        }
        
        nuevo.altura = 1 + Math.max(getAltura(nuevo.izq), getAltura(nuevo.der));
        
        int facEqui = getFactorEquilibrio(nuevo);

        if (facEqui > 1 && dato < nuevo.izq.dato) {
            return rotacionDerecha(nuevo);
        }
        if (facEqui < -1 && dato > nuevo.der.dato) {
            return rotacionIzquierda(nuevo);
        }
        if (facEqui > 1 && dato > nuevo.izq.dato) {
            nuevo.izq = rotacionIzquierda(nuevo.izq);
            return rotacionDerecha(nuevo);
        }
        if (facEqui < -1 && dato < nuevo.der.dato) {
            nuevo.der = rotacionDerecha(nuevo.der);
            return rotacionIzquierda(nuevo);
        }
 
        return nuevo;
    }
    //---búsqueda de un elemento en el AVL
    public void busca(int id) {
        System.out.print(BuscaEnAvl(raiz, id));
    }
    
    private String BuscaEnAvl(NodoAvl actual, int id) {
        if (actual == null) {
            return "El avión no existe";
        } else if (id == actual.dato) {
            return "El avión "+actual.dato+" existe, y  su información es:\n"+actual.info+"\n";
        } else if (id < actual.dato) {
            return BuscaEnAvl(actual.izq, id);
        } else {
            return BuscaEnAvl(actual.der, id);
        }
    }
    
    public String eliminar(int dato) {
        raiz = eliminarAvl(raiz, dato);
    }
    
    private NodoAvl eliminarAvl(NodoAvl actual, int dato) {
        if (actual == null)
            return actual;
 
        if (dato < actual.dato){
            actual.izq = eliminarAvl(actual.izq, dato);
        }else if (dato > actual.dato){
            actual.der = eliminarAvl(actual.der, dato);
        }else {
            if ((actual.izq == null) || (actual.der == null)) {
                NodoAvl temp = null;
                if (temp == actual.izq) {
                    temp = actual.der;
                }else {
                    temp = actual.izq;
                }
                if (temp == null) {
                    return null;
                }else{
                    actual = temp;
                }
            }else {
                NodoAvl temp = getValorMaximoNodo(actual.izq);
                actual.dato = temp.dato;
                actual.izq = eliminarAvl(actual.izq, temp.dato);
            }
        }
        actual.altura = Math.max(getAltura(actual.izq), getAltura(actual.der)) + 1;
 
        int facEqui = getFactorEquilibrio(actual);

        if (facEqui > 1 && getFactorEquilibrio(actual.izq) >= 0) {
            return rotacionDerecha(actual);
        }
        if (facEqui < -1 && getFactorEquilibrio(actual.der) <= 0) {
            return rotacionIzquierda(actual);
        }
        if (facEqui > 1 && getFactorEquilibrio(actual.izq) < 0) {
            actual.izq = rotacionIzquierda(actual.izq);
            return rotacionDerecha(actual);
        }
        if (facEqui < -1 && getFactorEquilibrio(actual.der) > 0) {
            actual.der = rotacionDerecha(actual.der);
            return rotacionIzquierda(actual);
        }
        return actual;
    }

    private NodoAvl rotacionDerecha(NodoAvl nodo) {
        NodoAvl nuevaRaiz = nodo.izq;
        NodoAvl temp = nuevaRaiz.der;
        nuevaRaiz.der = nodo;
        nodo.izq = temp;
        nodo.altura = Math.max(getAltura(nodo.izq), getAltura(nodo.der)) + 1;
        nuevaRaiz.altura = Math.max(getAltura(nuevaRaiz.izq), getAltura(nuevaRaiz.der)) + 1;
        return nuevaRaiz;
    }
 
    private NodoAvl rotacionIzquierda(NodoAvl nodo) {
        NodoAvl nuevaRaiz = nodo.der;
        NodoAvl temp = nuevaRaiz.izq;
        nuevaRaiz.izq = nodo;
        nodo.der = temp;
        nodo.altura = Math.max(getAltura(nodo.izq), getAltura(nodo.der)) + 1;
        nuevaRaiz.altura = Math.max(getAltura(nuevaRaiz.izq), getAltura(nuevaRaiz.der)) + 1;
        
        return nuevaRaiz;
    }
        
    //Obtiene el peso de un arbol dado
    private int getAltura(NodoAvl nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }
    private int getFactorEquilibrio(NodoAvl nodo) {
        if (nodo == null) {
            return 0;
        }
        return getAltura(nodo.izq) - getAltura(nodo.der);
    }

    
    private NodoAvl getValorMaximoNodo(NodoAvl nodo) {
        NodoAvl actual = nodo;
        
        while (actual.der != null){
           actual = actual.der;
        }
        
        return actual;
    }

    public NodoAvl getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAvl raiz) {
        this.raiz = raiz;
    }
    
    
}