package Ejercicio2_2;

public class Main {
    public static void main(String[] args) {
    Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12, 12742, 150000000,1 , 1,Planeta.tipoPlaneta.TERRESTRE,true);
    p1.imprimir();
        System.out.println("Densidad del planeta = "+ p1.calcularDensidad());
        System.out.println("Es planeta exterior = "+ p1.esPlanetaExterior());
        System.out.println();
    Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15, 139820,750000000, 0.96f,11.4f,Planeta.tipoPlaneta.GASEOSO,true);
        p2.imprimir();
        System.out.println("Densidad del planeta = " +  p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
}

}
