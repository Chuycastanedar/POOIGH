public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    protected double Salario;
    protected double Total;
   
    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Descripcion = descripcion;
        this.Salario = salario;
        this.Total = 0.0; // El total se calcula en las clases derivadas
    }

    public abstract double getBono();
    public abstract double getTotal();

    public char getSexo() {
        return Sexo;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario +  "]" + ", Bono=" + getBono() + ", Total=" + Total;
    }
}