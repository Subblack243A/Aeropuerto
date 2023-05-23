package aeropuerto;

public final class AvionSalida extends AAvion {

    private String origen, destino, horaSalida, horaLlegada;

    public AvionSalida(int id, int numVuelo, String aerolinea, String horaSalida, String nomJefe) {
        this.id = id;
        this.numeroVuelo = numVuelo;
        this.aerolinea = aerolinea;
        setOrigen();
        setDestino();
        this.horaSalida = horaSalida;
        setNumeroPuestos();
        this.nomJefe = nomJefe;
    }

    public String toString() {
        String s = "-------------------------------------------------\n";
        s += "ID :\t" + getId() + "\nNum. Vuelo :\t" + getNumeroVuelo() + "\nAerolinea :\t" + getAerolinea() + "\nOrigen :\t" + getOrigen() + "\nDestino :\t" + getDestino() + "\nHora de Salida :\t" + getHoraSalida() + "\nHora de Llegada :\t" + getHoraLlegada() + "\nNum. Puestos:\t" + getNumeroPuestos() + "\nJefe de Tripulacion :\t" + getNomJefe() + "\n-------------------------------------------------\n";
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
        int ale = (int) (Math.random() * 2);
        switch (ale) {
            case 0:
                origen = "Bogota";
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
        if (getDestino().equals("Bogota")) {
            for (int i = 0; i < 16; i++) {
                if (a == 12) {
                    a = 1;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a++;
                }
            }
        }else if(getDestino().equals("Paris")){
            for (int i = 0; i < 8; i++) {
                if (a == 12) {
                    a = 1;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a++;
                }
            }
        }else if(getDestino().equals("Bangladesh")){
            for (int i = 0; i < 4; i++) {
                if (a == 12) {
                    a = 1;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a++;
                }
            }
        }
        horaLlegada = a + ":00 " + h;
        this.horaLlegada = horaLlegada;
    }

}
