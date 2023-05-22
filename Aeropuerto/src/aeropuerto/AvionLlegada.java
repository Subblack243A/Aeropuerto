
package aeropuerto;

public final class AvionLlegada extends AAvion{
    
    protected String origen, destino, horaSalida, horaLlegada;
    
    public AvionLlegada(int id, int numVuelo, String aerolinea, String horaLlegada, String nomJefe) {
    this.id = id;
        this.numeroVuelo = numVuelo;
        this.aerolinea = aerolinea;
        setOrigen();
        setDestino();
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

    public void setHoraSalida(int a, String h) {
        String horaSalida = "";
        int sum = 0;
        switch(getOrigen()){
            case "Bogotá":
                sum = 16;
                break;
            case "París":
                sum = 8;
                break;
            case "Bangladesh":
                sum = 4;
                break;
        }
        for (int i = 0; i < sum; i++) {
            if (a == 0) {
                a = 12;
                if (h.equals("am")) {
                    h = "pm";
                }else{
                    h = "am";
                }
            }else{
                a--;
            }
        }
        horaSalida = a+":00 "+ h;
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
