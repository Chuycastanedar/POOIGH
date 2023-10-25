package _p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados miDados = new JuegoDados();

        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina mAdivina = new JuegoAdivina();
        mAdivina.iniciar();
        mAdivina.jugar();
        mAdivina.finalizar();
        
    }
}
