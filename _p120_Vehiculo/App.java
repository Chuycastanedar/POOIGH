package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Sedan misedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(misedan.toString());
        misedan.sistemaElectrico();
        misedan.combustionInterna();
        misedan.carroceriaTres();
        misedan.chasisMonocasco();
        misedan.repostar();
        misedan.arrancar();
        misedan.frenar();
        System.out.println();

        Suv miSuv = new Suv("La Mamalona", "Carlos Castaneda", 6);
        System.out.println(miSuv.toString());
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
        System.out.println();
        
    }
}
