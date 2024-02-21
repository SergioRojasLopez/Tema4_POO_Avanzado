package interfaces;

import excepciones.JugueteException;
import modelo.Juguete;

public interface IApilable {

    public default void apilar(Juguete juguete) throws JugueteException {

        if (!(juguete instanceof  IApilable)){

            throw new JugueteException(" El juguete no es apilable ");

        }

        if (this == juguete){

            throw new JugueteException("No te puedes apilar contigo mismo");

        }

        if (this.getClass() != juguete.getClass()){

            throw new JugueteException("No puedes apilar un juguete de tipo " + this.getClass().getSimpleName() + " con un juguete de tipo " + juguete.getClass().getSimpleName());
        }

    }
}
