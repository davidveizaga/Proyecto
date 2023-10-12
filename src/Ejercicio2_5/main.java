package Ejercicio2_5;

public class main {
    public static void main(String args[]) {
        cuentabancaria cuenta = new cuentabancaria("Pedro","Pérez", 123456789, cuentabancaria.tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);

    }
}

