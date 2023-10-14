package ejercicio6;

public class main {
    public static void main(String args[]) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro","Pérez",123456789,CuentaBancaria.tipo.AHORROS);
        CuentaBancaria cuenta2 = new CuentaBancaria("Pablo","Pinzón",44556677,CuentaBancaria.tipo.AHORROS);
        cuenta1.consignar(200);
        cuenta2.consignar(100);
        cuenta1.transferencia(cuenta2,50);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
        cuenta2.transferencia(cuenta1,150);
        cuenta1.transferencia(cuenta2,50);
    }
}
