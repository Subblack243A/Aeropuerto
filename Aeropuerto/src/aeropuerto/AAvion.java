package aeropuerto;


public class AAvion {
    protected int id, numeroVuelo, numeroPuestos;
    protected String nomJefe, aerolinea;

    public int getId() {
        return id;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getNumeroPuestos() {
        return numeroPuestos;
    }

    public String getNomJefe() {
        return nomJefe;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setNumeroPuestos() {
        int numeroPuestos = (int)(Math.random()*3);
        switch(numeroPuestos){
            case 0:
                numeroPuestos = 100;
                break;
            case 1: 
                numeroPuestos = 150;
                break;
            case 2: 
                numeroPuestos = 200;
                break;
            case 3:
                numeroPuestos = 250;
                break;
        }
        this.numeroPuestos = numeroPuestos;
    }

    public void setNomJefe(String nomJefe) {
        this.nomJefe = nomJefe;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
}
