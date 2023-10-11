// Manda un saludo a la pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {

        String amigo = "Emiliano";
        String hermana = "Liz";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",amigo,hermana);

        System.out.println("Hola mundo desde el lenguaje java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermana es " + hermana);
        System.out.println("\n" + mensaje);

    }
}
