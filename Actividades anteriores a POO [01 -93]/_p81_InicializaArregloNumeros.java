// Inicializar de forma manual un arreglo de numeros flotantes y lo imprime

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        int MAX = 8;
        double [] nums = new double [MAX];

        nums [0] = 5.0;
        nums [1] = 10.0;
        nums [2] = 15.0;
        nums [3] = 20.0;
        nums [4] = 25.0;
        nums [5] = 30.0;
        nums [6] = 35.0;
        nums [7] = 666;
        // nums [8] = 66; <- NO SE PUEDE, SE SALE DEL LIMITE

        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.println("\nEl primer elemento del arreglo es: "+ nums[0]);
        System.out.println("El ultimo elemento del arreglo es: "+ nums[6]);

        System.out.println("\nTodos los valores del arreglo con un ciclo FOR tradicional: ");
        for (int i=0; i<MAX; i++)
            System.out.println(nums[i]);

        System.out.println("\nTodos los valores del arreglo con un ciclo FOR - each: ");
        for (double num : nums)
            System.out.println(num);
    }
}