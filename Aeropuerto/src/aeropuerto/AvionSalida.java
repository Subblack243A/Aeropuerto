
package aeropuerto;


public final class AvionSalida extends AAvion{
    private String origen, destino, horaSalida, horaLlegada;

    public AvionSalida(int id, int numVuelo, String aerolinea, String horaSalida,String nomJefe) {
        this.id = id;
        this.numeroVuelo = numVuelo;
        this.aerolinea = aerolinea;
        setOrigen();
        setDestino();
        this.horaSalida = horaSalida;
        setNumeroPuestos();
        this.nomJefe = nomJefe;
    }
    public String toString(){
        String s = "-------------------------------------------------\n";
        s = "ID :\t" + getId() +"\nNum. Vuelo :\t" + getNumeroVuelo() + "\nAerolínea :\t" + getAerolinea()+ "\nOrigen :\t" + getOrigen() + "\nDestino :\t" + getDestino() + "\nHora de Salida :\t"+getHoraSalida()+"\nHora de Llegada :\t"+getHoraLlegada()+"\nNum. Puestos:\t"+getNumeroPuestos()+"\nJefe de Tripulación :\t"+getNomJefe()+"\n-------------------------------------------------\n";
        return s;
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
        this.origen = "Tokyo";
    }

    public void setDestino() {
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
        this.destino = origen;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(int a, String h) {
        String horaLlegada = "";
        int sum = 0;
        switch(getDestino()){
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
            if (a == 12) {
                a = 1;
                if (h.equals("am")) {
                    h = "pm";
                }else{
                    h = "am";
                }
            }else{
                a++;
            }
        }
        horaLlegada = a+":00 "+ h;
        this.horaLlegada = horaLlegada;
    }
    
}
