public class TrianguloRectangulo {
    public int base;
    public int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (this.base * this.altura / 2);
    }

    double calcularPerimetro() {
        return (this.base + this.altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(this.base * this.base + this.altura * this.altura, 0.5);
    }

    public void determinarTipoTriangulo() {
        if ((this.base == this.altura) && (this.base == calcularHipotenusa()) && (altura
                == calcularHipotenusa())) {

            System.out.println("Es un triángulo equilátero");

        } else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa())) {

            System.out.println("Es un triángulo escaleno");

        } else {

            System.out.println("Es un triángulo isósceles");

        }
    }
}
