package Ejercicio2_4;

public class main {
        public static void main(String args[]) {
            circulo figura1 = new circulo(2);
            rectangulo figura4 = new rectangulo(1,2);
            cuadrado figura2 = new cuadrado(3);
            triangulorectangulo figura7 = new triangulorectangulo(3,5);
            rombo figura5 = new rombo(5,8,4);
            trapecio figura6 =new trapecio(4,8,6,5,5);
            System.out.println("El área del círculo es = "+ figura1.calcularArea());
            System.out.println("El perímetro del círculo es = "+ figura1.calcularPerimetro());
            System.out.println();
            System.out.println("El área del rectángulo es = " + figura4.calcularArea());
            System.out.println("El perímetro del rectángulo es = " + figura4.calcularPerimetro());
            System.out.println();
            System.out.println("El área del cuadrado es = " + figura2.calcularArea());
            System.out.println("El perímetro del cuadrado es = " + figura2.calcularPerimetro());
            System.out.println();
            System.out.println("El área del triángulo es = " + figura7.calcularArea());
            System.out.println("El perímetro del triángulo es = "+ figura7.calcularPerimetro());
            figura7.determinarTipoTriangulo();
            System.out.println("El área del rombo es = " + figura5.calcularArea());
            System.out.println("El perímetro del rombo es = "+ figura5.calcularPerimetro());
            System.out.println();
            System.out.println("El área del trapecio es = " + figura6.calcularArea());
            System.out.println("El perímetro del trapecio es = "+ figura6.calcularPerimetro());
        }
    }
