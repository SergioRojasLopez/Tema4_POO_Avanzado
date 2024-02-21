package Ej4Chape.Excepciones;

public class ProductoElectronicoException extends Exception {

    public ProductoElectronicoException() {
    }

    public ProductoElectronicoException(String message) {
        super(message);
    }

    public ProductoElectronicoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductoElectronicoException(Throwable cause) {
        super(cause);
    }

    public ProductoElectronicoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
