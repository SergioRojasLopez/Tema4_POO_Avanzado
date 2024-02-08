package interfaces;

import excepciones.JugueteException;
import modelo.Juguete;

public interface IApilable {

    public default void apilar(Juguete juguete) throws JugueteException {

        if (!(juguete instanceof  IApilable)){

            throw new JugueteException("El juguete no es apilable");

        }

        if (juguete == this){

            throw new JugueteException("No te puedes apilar contigo mismo");

        }

        if (juguete.getClass() != this.getClass()){

            throw new JugueteException("No puedes apilar un juguete de tipo " + juguete.getClass().getSimpleName() + "con un jugeute de tipo" + this.getClass().getSimpleName());
        }


    }
}
