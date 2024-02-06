public class Main {

    public static void main(String[] args) {

        EsportsTournament torneo = new EsportsTournament();

        Gamer[] players = {new FPSGamer(), new MOBAGamer(), new SportsGamer()};

        torneo.startTournament(players);

    }


}
