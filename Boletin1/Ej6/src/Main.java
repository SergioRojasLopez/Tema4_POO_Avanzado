public class Main {

    public static void main(String[] args) {
        try {
            Mago magoA = new Mago(TipoRaza.HUMANO,"Merlin",13,20,90);
            Mago magoB = new Mago(TipoRaza.ENANO,"Orfeo",14,19,95);
            Clerigo clreigoC = new Clerigo(TipoRaza.ELFO,"Rasputin",18,14,100,"Jisus");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clreigoC);

            magoA.aprenderHechizo("Mewing");
            magoA.aprenderHechizo("Polimorfia");
            magoB.aprenderHechizo("Echale papa nivel 100");

            System.out.println(magoA);
            System.out.println(magoB);

            magoA.lanzarHechizo("Mewing",magoB);

            magoB.lanzarHechizo("Echale papa nivel 100", magoA);

        } catch (PersonajeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
