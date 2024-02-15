public class Ship {
    private final double draft;
    private final int crew;
    
    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double peso_trip = this.crew*1.5;

        if ((this.draft-peso_trip)>20) {
            return true;
        } else {
            return false;
        }
    }
}
