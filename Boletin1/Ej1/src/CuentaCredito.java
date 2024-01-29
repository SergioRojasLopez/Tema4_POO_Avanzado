public class CuentaCredito extends Cuenta {


    public static final double CREDITO_DEFAULT = 100;
    public static final double CREDITO_MAXIMO = 300;
    private double credito;

    public CuentaCredito(double saldo, double credito) throws CuentaCreditoException {
        super(saldo);
        setCredito(credito);
    }

    public CuentaCredito(double credito) throws CuentaCreditoException {
        setCredito(credito);
    }

    public CuentaCredito() {
        this.credito = CREDITO_DEFAULT;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) throws CuentaCreditoException {

        if (this.credito > CREDITO_MAXIMO) {
            throw new CuentaCreditoException("El credito supera el maximo");
        }

        if (this.credito < 0) {
            throw new CuentaCreditoException("El credito no puede ser 0 o negativo");
        }

        this.credito = credito;

    }

    @Override
    public void ingresarDinero(double dineroAIngresar) throws CuentaException {


    }

    @Override
    public void sacarDinero(double dineroASacar) throws CuentaException, CuentaCreditoException {
        if (dineroASacar > getSaldo() + getCredito()) {
            throw new CuentaCreditoException("Has llegado a su limite de credito");

        }
        if (dineroASacar <= getSaldo()) {
            super.sacarDinero(dineroASacar);

        } else {

            dineroASacar -= getSaldo();
            super.sacarDinero(getSaldo());

            this.credito -= dineroASacar;

        }


    }
}