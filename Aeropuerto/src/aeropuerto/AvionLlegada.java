
package aeropuerto;

public final class AvionLlegada extends AAvion{
    
    protected String origen, destino, horaSalida, horaLlegada;
    
    public AvionLlegada(int id, int numVuelo, String aerolinea, String horaSalida, String horaLlegada, String nomJefe) {
        this.id = id;
        this.numeroVuelo = numVuelo;
        this.aerolinea = aerolinea;
        setOrigen();
        setDestino();
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        setNumeroPuestos();
        this.nomJefe = nomJefe;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setOrigen() {
        String origen = "";
        int ale = (int)(Math.random()*2);
        switch(ale){
            case 0:
                origen = "Bogotá";
                break;
            case 1: 
                origen = "Paris";
                break;
            case 2: 
                origen = "Bangladesh";
                break;
        }
        this.origen = origen;
    }

    public void setDestino() {
        this.destino = "Tokyo";
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
    public String toString(){
        String s = "-------------------------------------------------\n";
        s = "ID :\t" + getId() +"\nNum. Vuelo :\t" + getNumeroVuelo() + "\nAerolínea :\t" + getAerolinea()+ "\nOrigen :\t" + getOrigen() + "\nDestino :\t" + getDestino() + "\nHora de Salida :\t"+getHoraSalida()+"\nHora de Llegada :\t"+getHoraLlegada()+"\nNum. Puestos:\t"+getNumeroPuestos()+"\nJefe de Tripulación :\t"+getNomJefe()+"\n-------------------------------------------------\n";
        return s;
    }
}
