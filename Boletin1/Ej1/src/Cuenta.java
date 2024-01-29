import java.util.Scanner;

public class Cuenta {

    public static final double SALDO_DEFAULT = 0;
    private double saldo;



    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
        this.saldo = SALDO_DEFAULT;

    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero (double dineroAIngresar)throws CuentaException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres ingresar");
        dineroAIngresar = sc.nextDouble();
        if (dineroAIngresar < 0){
            throw new CuentaException("El valor debe ser positivo");
        }else {

            this.saldo += dineroAIngresar;
        }

    }
    public void sacarDinero (double dineroASacar) throws CuentaException, CuentaCreditoException {


        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero deseas sacar");
        dineroASacar = sc.nextDouble();

        if (dineroASacar <= 0){
            throw new CuentaException("Debes ingresar un valor positivo");


        }
        if (dineroASacar > saldo){

            throw new CuentaException("No puedes sacar mas del saldo disponible(" + saldo + "$)");

        }

        this.saldo -= dineroASacar;


    }
}
