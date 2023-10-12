package Ejercicio2_4;

public class trapecio {
    int h;
    int B;
    int b;
    int L;
    int l;

    trapecio(int h, int B, int b,int L, int l) {
        this.h = h;
        this.B = B;
        this.b = b;
        this.L = l;
        this.l = l;
    }

    double calcularArea() {
        return ((B + b)/2)*h;
    }

    double calcularPerimetro() {
        return B+b+L+l;
    }

}
