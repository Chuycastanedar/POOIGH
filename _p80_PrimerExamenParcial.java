// JOSÉ DE JESÚS CASTAÑEDA RODARTE
// EXAMEN PARCIAL: Control escolar sobre el curso de tecnicas avanzadas de programación...

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaracion de variables
        int edad;
        char sexo;
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        double totalDineroAlumnos = 0;
        double totalDineroDocentes = 0;
        double totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;
        double totalEdad = 0;
        double promedioEdad;
        String nombre, tipoParticipante, mensajeFinal;

        // Ciclo principal para ingresar los datos
        while (true) {
            // Limpiar la consola 
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Texto de bienvenida al programa
            System.out.println("UNIVERSIDAD AUTONOMA DE ZACATECAS");
            System.out.println("Inscripciones al curso de técnicas avanzadas de programación...");
            System.out.print("\nPara finalizar ingresa: salir");
            System.out.println("\n\nIngresa los siguientes datos... ");
            System.out.print("\nTu Nombre: ");
            nombre = input.nextLine();
            
            // Concional para finalizar
            if (nombre.equals("salir")) {
                break;
            }
            
            System.out.print("Tu Edad: ");
            edad = input.nextInt(); 
            input.nextLine();  
            
            System.out.print("Sexo (M/F): ");
            sexo = input.nextLine().charAt(0);
            
            System.out.print("Tipo de Participante [Alumno/Docente/Trabajador]: ");
            tipoParticipante = input.nextLine();
            
            if (edad >= 18) {
                totalParticipantes++;
                totalEdad += edad;
                
                switch (tipoParticipante.toLowerCase()) {
                    case "alumno":
                        totalAlumnos++;
                        totalDineroAlumnos += 50;
                        break;
                    case "docente":
                        totalDocentes++;
                        totalDineroDocentes += 80;
                        break;
                    case "trabajador":
                        totalTrabajadores++;
                        totalDineroTrabajadores += 60;
                        break;
                }
                
                if (sexo == 'M' || sexo == 'm') {
                    totalHombres++;
                } else if (sexo == 'F' || sexo == 'f') {
                    totalMujeres++;
                }
            } else{
                // Mensaje para menores de edad
                System.out.print("\nLo siento, debes ser mayor de edad para registrarte...");
                // Tiempo de espera del mensaje en pantalla
                try {
                    Thread.sleep(2500); // 2500 milisegundos = 2.5 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        // Suma total de dinero 
        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        // Edad promedio de participantes
        promedioEdad = totalEdad / totalParticipantes;

        // Mensaje final de ganancias
        if (totalDineroGeneral < 100) {
           mensajeFinal = "\nEl evento concluye con ganancias BAJAS...";
        } else if (totalDineroGeneral < 200) {
            mensajeFinal = "\nEl evento concluye con ganancias MODERADAS...";
        } else {
            mensajeFinal = "\nEl evento concluye con BUENAS ganancias...";
        }
        // Limpiar la pantalla para los resultados
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nRESULTADOS DE INSCRIPCIONES...\n");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        
        System.out.println("\nRESULTADOS DEL DINERO RECAUDADO...\n");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);
        System.out.print(mensajeFinal);
    }
}