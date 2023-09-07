public class CrearCuenta {
    public static void main(String[] args){
        Cuenta cuentaDeVanya = new Cuenta();
        cuentaDeVanya.saldo=10000;
        System.out.println("Saldo de la cuenta: " + cuentaDeVanya.saldo);
        System.out.printf("Saldo de la cuenta: %.2f" , cuentaDeVanya.saldo);
    }
}
