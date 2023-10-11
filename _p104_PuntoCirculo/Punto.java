public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getDistancia(Punto Punto2) {
        double dx = this.x - Punto2.getX();
        double dy = this.y - Punto2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public String toString() {
        return "Punto [X= " + x + ", Y= " + y + "]";
    }
}