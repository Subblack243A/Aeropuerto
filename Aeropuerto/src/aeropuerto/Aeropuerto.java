package aeropuerto;

import java.util.Scanner;

public class Aeropuerto {
    private static  int a = 0;
    private static String h = "am";
    public static void main(String[] args) {
        Cola salida = new Cola(), llegada = new Cola();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 6){
            System.out.println("-------------------------------------------------");
            System.out.println("MENÚ\n1. Agregar Avión de Llegada\n2. Agregar Avión de Salida\n3. Eliminar Avion Llegada\n4. Eliminar Avión Salida \n5. Mostrar Cola Llegada\n6. Mostrar Cola Salida\n7. Buscar Información de Avión\n8. Cerrar Programa");
            System.out.println("OPCION:");
            op = sc.nextInt();
            switch(op){
                case 1:
                    llegada.push(agregarLlegada());
                    System.out.println("Guardado con Éxito");
                    break;
                case 2:
                    salida.push(agregarSalida());
                    System.out.println("Guardado con Éxito");
                    break;
                case 3:
                    llegada.pop();
                    System.out.println("Eliminado con Éxito");
                    break;
                case 4: 
                    salida.pop();
                    System.out.println("Eliminado con Éxito");
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
                    if (op == 6) {
                        break;
                    }
                    break;
                default:
                    System.out.println("No existe esta opción");
                    break;
            }
        }
    }
    
    public static String agregarLlegada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID del Vuelo");
        int id = sc.nextInt();
        System.out.println("Ingrese Número de Vuelo");
        int numVuelo = sc.nextInt();
        System.out.println("Ingrese Aerolínea del Vuelo");
        String aerolinea = sc.next();
        System.out.println("Nombre del Jefe de Tripulación");
        String nomJefe = sc.next();
        AvionLlegada avLlegada = new AvionLlegada(id, numVuelo, aerolinea, hora(), nomJefe);
        avLlegada.setHoraSalida(a, h);
        return avLlegada.toString();
    }
    
    public static String agregarSalida(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID del Vuelo");
        int id = sc.nextInt();
        System.out.println("Ingrese Número de Vuelo");
        int numVuelo = sc.nextInt();
        System.out.println("Ingrese Aerolínea del Vuelo");
        String aerolinea = sc.next();
        System.out.println("Nombre del Jefe de Tripulación");
        String nomJefe = sc.next();
        AvionSalida avLlegada = new AvionSalida(id, numVuelo, aerolinea, hora(), nomJefe);
        avLlegada.setHoraLlegada(a, h);
        return avLlegada.toString();
    }
    
    public static void busqueda(){
        
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
