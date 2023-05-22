package aeropuerto;

public final class AvionLlegada extends AAvion {

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
        this.origen = origen;
    }

    public void setDestino() {
        this.destino = "Tokyo";
    }

    public void setHoraSalida(int a, String h) {
        String horaSalida = "";
        if (getOrigen().equals("Bogota")) {
            for (int i = 0; i < 16; i++) {
                if (a == 0) {
                    a = 12;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a--;
                }
            }
        } else if (getOrigen().equals("Paris")) {
            for (int i = 0; i < 8; i++) {
                if (a == 0) {
                    a = 12;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a--;
                }
            }
        } else if (getOrigen().equals("Bangladesh")) {
            for (int i = 0; i < 4; i++) {
                if (a == 0) {
                    a = 12;
                    if (h.equals("am")) {
                        h = "pm";
                    } else {
                        h = "am";
                    }
                } else {
                    a--;
                }
            }
        }
        horaSalida = a + ":00 " + h;
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String toString() {
        String s = "-------------------------------------------------\n";
        s += "ID :\t" + getId() + "\nNum. Vuelo :\t" + getNumeroVuelo() + "\nAerolinea :\t" + getAerolinea() + "\nOrigen :\t" + getOrigen() + "\nDestino :\t" + getDestino() + "\nHora de Salida :\t" + getHoraSalida() + "\nHora de Llegada :\t" + getHoraLlegada() + "\nNum. Puestos:\t" + getNumeroPuestos() + "\nJefe de Tripulacion :\t" + getNomJefe() + "\n-------------------------------------------------\n";
        return s;
    }
}
