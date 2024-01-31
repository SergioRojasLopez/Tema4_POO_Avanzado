public enum Gama {

    BAJA(30),MEDIA(40),ALTA(50);

    private double precioDia;

    Gama(double precioDia) {
        this.precioDia = precioDia;
    }

    public double getPrecioDia() {
        return precioDia;

    }
}



