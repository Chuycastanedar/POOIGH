public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Equipo equipo = new Equipo("Limones", "Torneo la Bombonera");
        equipo.reporte ();

        JugadorEntrenador entrenador1 = new JugadorEntrenador("Francisco Zapeda", 'H', "Entrenador Principal", 1000.0, 8, 1);
        JugadorEntrenador entrenador2 = new JugadorEntrenador("Alexis Estrada", 'H', "Entrenador de Apoyo", 900.0, 10, 2);
        JugadorActivo jugador1 = new JugadorActivo("Alexander Lopez", 'H', "Principal No 11", 100.0, 2, 2);
        JugadorActivo jugador2 = new JugadorActivo("Uriel Puga", 'H', "Principal No 16", 100.0, 3, 1);
        JugadorActivo jugador3 = new JugadorActivo("Alejandra Escalona", 'M', "Principal No 21", 100.0, 3, 3);
        JugadorActivo jugador4 = new JugadorActivo("Armando Santana", 'H', "Banca No 10", 120.0, 4, 1);
        JugadorActivo jugador5 = new JugadorActivo("Daniel Mijares", 'H', "Banca No 15", 150.0, 4, 4);
        JugadorActivo jugador6 = new JugadorActivo("Antonio Hernandez", 'M', "Banca No 20", 350.0, 5, 3);
        JugadorActivo jugador7 = new JugadorActivo("Andrea Solis", 'M', "Principal No 12", 550.0, 5, 5);
        JugadorActivo jugador8 = new JugadorActivo("Marissa Hernandez", 'M', "Principal No 12", 600.0, 4, 2);
        JugadorActivo jugador9 = new JugadorActivo("Diana Soto", 'M', "Principal No 12", 700.0, 5, 3);

        equipo.agregarJugador(entrenador1);
        equipo.agregarJugador(entrenador2);
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);
        equipo.agregarJugador(jugador5);
        equipo.agregarJugador(jugador6);
        equipo.agregarJugador(jugador7);
        equipo.agregarJugador(jugador8);
        equipo.agregarJugador(jugador9);

        equipo.reporte();
    }
}