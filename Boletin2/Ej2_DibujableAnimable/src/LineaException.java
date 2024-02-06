public class LineaException extends Exception{

    public LineaException() {
    }

    public LineaException(String message) {
        super(message);
    }

    public LineaException(String message, Throwable cause) {
        super(message, cause);
    }

    public LineaException(Throwable cause) {
        super(cause);
    }

    public LineaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
