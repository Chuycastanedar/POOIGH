package _p138_ArchivoMaterias;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static void leerdatos (ArrayList<String> datos) {
        String dato = "";
        System.out.println("\nIntroduce una materia, presiona [Enter] vacío para terminar: ");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (!dato.isEmpty()) datos.add(dato);
            else break;
        }
    }

    public static void grabarArchivo(String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)

            fdatos.write(dato + "\n");
        fdatos.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while((dato=fdatos.readLine())!=null)

            datos.add(dato);
        fdatos.close();
        return datos;
    }   

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        String archivo = "Materias.txt";
        ArrayList<String> materias = new ArrayList<>(), lasmaterias = new ArrayList<>();
        leerdatos(materias);
        try {
            grabarArchivo(archivo, materias);
            lasmaterias = leerArchivo(archivo);
            System.out.println("Materias capturadas: ");lasmaterias.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e);
        }
    }
}