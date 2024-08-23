package ExamenProg2;

public class Room{
    private int numbre;
    private double pricePerNight;

    public Room(int numbre, double pricePerNight) {
        this.numbre = numbre;
        this.pricePerNight = pricePerNight;
    }

    public int getNumbre() {
        return numbre;
    }

    public void setNumbre(int numbre) {
        this.numbre = numbre;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
