package Ejercicio2_4;

public class rombo {
    int lado;
    int Dan;
    int dan;

    rombo(int lado, int Dan, int dan) {
        this.lado = lado;
        this.Dan = Dan;
        this.dan = dan;
    }

    double calcularArea() {
        return (Dan * dan)/2;
    }

    double calcularPerimetro() {
        return lado+lado+lado+lado;
    }
}
