// Inicializa de forma manual un arreglo de cadenas y lo imprime

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String [] municipios = new String [10];

        municipios [0] = "Apozol";
        municipios [1] = "Apulco";
        municipios [2] = "Cañitas";
        municipios [3] = "Jerez";
        municipios [4] = "Fresnillo";
        municipios [5] = "Rio Grande";
        municipios [6] = "Sain Alto";
        municipios [7] = "Sombrerete";
        municipios [8] = "Teul de Gonzalez Ortega";
        municipios [9] = "Atolinga";

        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.println("\nPrimer elemento del arreglo: " + municipios[0]);
        System.out.println("Ultimo elemento del arreglo: " + municipios[9]);
        
        System.out.println("\nTodos los elementos usando el ciclo for con indice: ");
        for (int i=0; i<10; i++)
            System.out.println(municipios[i]);

        System.out.println("\nTodos los elementos usando el ciclo for each: ");
        for (String num : municipios)
            System.out.println(num.toUpperCase());
    }
}
