package ejercicio5;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;



    enum tipo{AHORROS,CORRIENTE}
    tipo tipoCuenta;
    float saldo=0;
    double porcentajeInteresMensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta, double porcentajeInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeInteresMensual=porcentajeInteresMensual;

    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Porcenta de interes mensual = "+porcentajeInteresMensual+"%");
    }
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }
    boolean consignarValor(int valor){
        if(valor>0){
            saldo=saldo+valor;
            System.out.println("Se asignado $"+valor+" en la cuenta. El nuevo saldo es $"+saldo);
            return true;
        }
        else{
            System.out.println("El valor a consignar debe ser mayor que cero");
            return false;
        }
    }
    boolean retirar(int valor){
        if(valor<saldo){
            saldo=saldo-valor;
            System.out.println("Se a retirado $"+valor+" en la cuenta. El nuevo saldo es $"+saldo);
            return true;
        }
        else {
            System.out.println("El valor a retirar de ser menor que el saldo");
            return  false;
        }
    }
    boolean saldoInteres(){
        double interes=(saldo*porcentajeInteresMensual)/100;
        saldo= (float) ((interes)+saldo);
        System.out.println("El interes es $"+interes+" . El saldo mas el interes es $"+saldo);
        return true;
    }
}
