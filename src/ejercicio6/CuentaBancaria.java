package ejercicio6;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    boolean estaActiva = true;

    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = "  + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("La cuenta está activa: " + estaActiva);
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
        System.out.println("La cuenta está: " + estaActiva);
    }

    boolean consignar(int valor) {
        if(saldo==0){
            estaActiva = false;
            System.out.println("La cuenta está : " + estaActiva);
        }
        if (valor > 0) {
            saldo = saldo + valor;
            estaActiva = true;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            System.out.println("La cuenta está : " + estaActiva);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            if (saldo == 0) {
                estaActiva = false;
            }
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            System.out.println("La cuenta está : " + estaActiva);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    void compararCuentas(CuentaBancaria cuenta) {
        if (saldo >= cuenta.saldo) {
            System.out.println("El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parámetro.");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parámetro.");
        }
    }

    void transferencia(CuentaBancaria cuenta, int valor) {
        if(cuenta.saldo==0){
            System.out.println("No se puede trasnferir. la cuenta esta inactiva");
        }else if (retirar(valor)) {
            cuenta.consignar(valor);
        }
    }
}
