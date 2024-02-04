public class Coche {

   public class coche extends Vehiculo{

       private Combustible combustible;

       public coche(String matricula, Gama gama,Combustible combustible) {

           super(matricula, gama);
           this.combustible = combustible;
       }

       public Combustible getCombustible() {
           return combustible;
       }

       @Override
       public double getPrecioDiario() {
           return getGama().getPrecioDia() + combustible.getPrecioCombustibleDia();
       }
   }
}
