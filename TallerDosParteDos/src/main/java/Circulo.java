
public class Circulo {
    public int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI*Math.pow(this.radio,2);
    }

    double calcularPerímetro() {
        return 2*Math.PI*this.radio;
    }
}
