import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;            
import java.io.FileReader;
import java.io.FileWriter;

public class _p137_ArchivoMunicipios {
    public static void main(String args []) {
        String[] deportes = { "Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};
        File arch = new File("deportes.txt");
        System.out.print("\033[H\033[2J");System.out.flush();
        
        try {
            BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
            for (String deporte : deportes)
                fdeportes.write(deporte + "\n");
            System.out.println("Los datos han sido escritos en el archivo " + arch.getName());
            fdeportes.close();
            
            System.out.println("\nDatos del archivo: \n");
            BufferedReader  fdeportesReader = new BufferedReader(new FileReader(arch));
            String linea;
            while ((linea = fdeportesReader.readLine()) != null)
            System.out.println(linea);
            fdeportes.close();
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo...");
            System.out.println(e);
        }
    }
}   