package _p105_PuntoTriangulo;
public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Punto getV1() {
        return v1;
    }
    public Punto getV2() {
        return v2;
    }
    public Punto getV3() {
        return v3;
    }
    public double getPerimetro() {
        double distancia1 = calcularDistancia(v1, v2);
        double distancia2 = calcularDistancia(v2, v3);
        double distancia3 = calcularDistancia(v3, v1);
        return distancia1 + distancia2 + distancia3;
    }
    public String getTipo() {
        double distancia1 = calcularDistancia(v1, v2);
        double distancia2 = calcularDistancia(v2, v3);
        double distancia3 = calcularDistancia(v3, v1);

        if (distancia1 == distancia2 && distancia2 == distancia3) {
            return "Equilátero";
        } else if (distancia1 == distancia2 || distancia2 == distancia3 || distancia3 == distancia1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    @Override
    public String toString() {
        return "Triángulo [V1=Punto " + v1 + ", V2=Punto " + v2 + ", V3=Punto " + v3 + "]";
    }
    private double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}   