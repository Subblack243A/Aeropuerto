package aeropuerto;

import java.util.Scanner;
public static Arbol arbolito = new Arbol();
public class Aeropuerto {
    private static  int a = 0;
    private static String h = "am";
    public static void main(String[] args) {
        Cola salida = new Cola(), llegada = new Cola();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 9){
            System.out.println("-------------------------------------------------");
            System.out.println("MENU\n1. Agregar Avion de Llegada\n2. Agregar Avion de Salida\n3. Eliminar Avion en Cola de Llegada\n4. Eliminar Avion en Cola de Salida \n5. Mostrar Cola Llegada\n6. Mostrar Cola Salida\n7. Buscar Informacion de Avion\n8. ELiminar avion por ID\n9. Cerrar Programa\n-------------------------------------------------");
            System.out.println("OPCION: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    llegada.push(agregarLlegada());
                    System.out.println("Guardado con Exito");
                    break;
                case 2:
                    salida.push(agregarSalida());
                    System.out.println("Guardado con Exito");
                    break;
                case 3:
                    llegada.pop();
                    System.out.println("Eliminado con Exito");
                    break;
                case 4: 
                    salida.pop();
                    System.out.println("Eliminado con Exito");
                    break;
                case 5: 
                    llegada.mostrar();
                    break;
                case 6:
                    salida.mostrar();
                    break;
                case 7:
                    busqueda();
                    break;
                case 8:
                    System.out.println("Ingrese el ID del vuelo que desea eliminar");
                    int id = sc.nextInt();
                    arbolito.eliminar(id);
                    salida.popId(id);
                    System.out.println("Eliminado con Exito");
                    break;
                case 9: 
                    if (op == 9) {
                        break;
                    }
                    break;
                default:
                    System.out.println("No existe esta opcion");
                    break;
            }
        }
    }
    
    public static String agregarLlegada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID del Vuelo");
        int id = sc.nextInt();
        System.out.println("Ingrese Numero de Vuelo");
        int numVuelo = sc.nextInt();
        System.out.println("Ingrese Aerolinea del Vuelo");
        String aerolinea = sc.next();
        System.out.println("Nombre del Jefe de Tripulacion");
        String nomJefe = sc.next();
        AvionLlegada avLlegada = new AvionLlegada(id, numVuelo, aerolinea, hora(), nomJefe);
        avLlegada.setHoraSalida(a, h);
        return avLlegada.toString();
    }
    
    public static String agregarSalida(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID del Vuelo");
        int id = sc.nextInt();
        System.out.println("Ingrese Numero de Vuelo");
        int numVuelo = sc.nextInt();
        System.out.println("Ingrese Aerolinea del Vuelo");
        String aerolinea = sc.next();
        System.out.println("Nombre del Jefe de Tripulacion");
        String nomJefe = sc.next();
        AvionSalida avSalida = new AvionSalida(id, numVuelo, aerolinea, hora(), nomJefe);
        avSalida.setHoraLlegada(a, h);
        arbolito.insertar(id, avSalida.toString());
        return avSalida.toString();
    }
    
    public static void busqueda(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        arbolito.busca(id);
    }
    
    public static String hora(){
        String s = "";
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
        s = a + ":00"+ " " + h;
        return s;
    }
}
