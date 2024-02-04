import java.util.Scanner;

public class Cuenta {

    private  double creditoCuenta;
    private  double saldoCuenta;

    public Cuenta(double creditoCuenta, double saldoCuenta) {
        this.creditoCuenta = creditoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public double getCreditoCuenta() {
        return creditoCuenta;
    }

    public void setCreditoCuenta(double creditoCuenta) {
        this.creditoCuenta = creditoCuenta;
    }


    public double sacarDinero (){
        double dineroSacar;
        Scanner sc = new Scanner(System.in);

        Cuenta cuenta = new Cuenta(100,0);

        System.out.println("Cuanto dinero quieres sacar "+ ", recuerda que tienes " + cuenta.getCreditoCuenta());
        dineroSacar = sc.nextDouble();

        if (dineroSacar < cuenta.getCreditoCuenta()){


        }

        return dineroSacar;
    }
}
