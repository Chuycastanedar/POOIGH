package _p111_CuentaBancariaV2;
public class App {
    public static void main(String[] args) {
        Banco  miBanco = new Banco ("Banco del Norte SA de CV", "Privada las cumbres 123");
        System.out.print("\033[H\033[2J"); System.out.flush();
        miBanco.reporte();
        miBanco.agregarCliente(new Cliente ("Carlos Fuentes"));
        miBanco.agregarCliente(new Cliente ("Juan de la Fuente"));
        miBanco.agregarCliente(new Cliente ("Rene Mayorga"));
        miBanco.agregarCliente(new Cliente ("Maria Vazquez"));
        miBanco.reporte();
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeAhorro(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(1000, 0.40));
        miBanco.reporte();
        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(0).retira(100);
        miBanco.getClientes().get(2).getCuentas().get(0).retira(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        miBanco.reporte();
        miBanco.calcularInteres();
        miBanco.reporte();

    }
}
