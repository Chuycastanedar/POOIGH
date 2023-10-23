public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;
    
    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.Partidos = partidos;
        this.Goles = goles;
        this.Total = Salario + getBono();
    }

    @Override
    public double getBono() {
        return (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
    }

    @Override
    public double getTotal() {
        return Salario + getBono();
    }

    @Override
    public String toString() {
        return "- JugadorActivo [" + super.toString() + ", Partidos=" + Partidos + ", Goles=" + Goles + "]\n";
    }
}