package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private Boolean Relleno;
    public Forma() {
    }
    public Forma(String color, Boolean relleno) {
        Color = color;
        Relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public Boolean getRelleno() {
        return Relleno;
    }
    public void setRelleno(Boolean relleno) {
        Relleno = relleno;
    }
    public abstract double getArea();

    public abstract double getPerimetro();

    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
}