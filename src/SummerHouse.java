public class SummerHouse implements Housing {
    private double price;
    private double squareMeters;
    private int rooms;
    private int salons;

    public SummerHouse(double price, double squareMeters, int rooms, int salons) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
        this.salons = salons;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getSquareMeters() {
        return squareMeters;
    }

    @Override
    public int getRooms() {
        return rooms;
    }

    @Override
    public int getSalons() {
        return salons;
    }
}
