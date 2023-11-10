package _p139_ArchivoEstudiante;

import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        Estudiante[] estudiantes = new Estudiante[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            estudiantes[i] = new Estudiante(nombre, edad, promedio, sexo);
        }

        guardarEnArchivo(estudiantes);

        Estudiante[] estudiantesDesdeArchivo = leerDesdeArchivo();

        System.out.println("\nEstudiantes desde el archivo:");
        mostrarEstudiantes(estudiantesDesdeArchivo);

        double promedioCalificaciones = calcularPromedioCalificaciones(estudiantes);
        System.out.println("\nPromedio de calificaciones: " + promedioCalificaciones);

        double promedioEdades = calcularPromedioEdades(estudiantes);
        System.out.println("Promedio de edades: " + promedioEdades);

        int cantidadHombres = contarEstudiantesPorSexo(estudiantes, 'M');
        int cantidadMujeres = contarEstudiantesPorSexo(estudiantes, 'F');
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }

    private static void guardarEnArchivo(Estudiante[] estudiantes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("estudiantes.txt"))) {
            for (Estudiante estudiante : estudiantes) {
                writer.println(estudiante.nombre + "," + estudiante.edad + "," + estudiante.promedio + "," + estudiante.sexo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Estudiante[] leerDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("estudiantes.txt"))) {
            int numEstudiantes = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numEstudiantes++;
            }

            Estudiante[] estudiantes = new Estudiante[numEstudiantes];
            scanner.close();
            scanner.reset();
            scanner = new Scanner(new File("estudiantes.txt"));

            for (int i = 0; i < numEstudiantes; i++) {
                String[] datos = scanner.nextLine().split(",");
                estudiantes[i] = new Estudiante(datos[0], Integer.parseInt(datos[1]), Double.parseDouble(datos[2]), datos[3].charAt(0));
            }

            return estudiantes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void mostrarEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.nombre + ", Edad: " + estudiante.edad + ", Promedio: " + estudiante.promedio + ", Sexo: " + estudiante.sexo);
        }
    }

    private static double calcularPromedioCalificaciones(Estudiante[] estudiantes) {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.promedio;
        }
        return suma / estudiantes.length;
    }

    private static double calcularPromedioEdades(Estudiante[] estudiantes) {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.edad;
        }
        return suma / estudiantes.length;
    }

    private static int contarEstudiantesPorSexo(Estudiante[] estudiantes, char sexo) {
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.sexo == sexo) {
                count++;
            }
        }
        return count;
    }
}