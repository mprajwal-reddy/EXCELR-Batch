public class Bowler {
    private String name;
    private int matchesPlayed;
    private int wicketsTaken;
    private double bowlingAverage;

    public Bowler(String name, int matchesPlayed, int wicketsTaken, double bowlingAverage) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wicketsTaken = wicketsTaken;
        this.bowlingAverage = bowlingAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public double getBowlingAverage() {
        return bowlingAverage;
    }

    public void setBowlingAverage(double bowlingAverage) {
        this.bowlingAverage = bowlingAverage;
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name='" + name + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", wicketsTaken=" + wicketsTaken +
                ", bowlingAverage=" + bowlingAverage +
                '}';
    }

    public static void main(String[] args) {
        Bowler bowler = new Bowler("James Anderson", 150, 600, 27.5);
        System.out.println(bowler);
    }
}