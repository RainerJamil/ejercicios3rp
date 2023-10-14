package ejercicio5;
    public class main {
        public static void main(String args[]){
        CuentaBancaria cuenta1=new CuentaBancaria("Pedro","Perez",123456789, CuentaBancaria.tipo.AHORROS,15);
            cuenta1.imprimir();
            cuenta1.consignarValor(200000);
            cuenta1.consignarValor(300000);
            cuenta1.retirar(400000);
            cuenta1.consultarSaldo();
            cuenta1.saldoInteres();
        }
    }
