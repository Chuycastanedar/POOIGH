package _p147_TercerExamenParcial;
import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
            datos.add(new Jugador("José de Jesús", 21, 'M', "Casado", "Defensa", 3700));
            datos.add(new Jugador("Beatriz Dominguez", 19, 'F', "Soltera", "Delantera", 4000));
            datos.add(new Jugador("Humberto Vázquez", 23, 'M', "Viudo", "Defensa", 3400));
            datos.add(new Jugador("Pedro Reyes", 22, 'M', "Soltero", "Medio", 3700));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}