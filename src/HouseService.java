import java.util.ArrayList;
import java.util.List;

//House -> Ev
//Housing -> Konut
public class HouseService {
    private List<Housing> houses = new ArrayList<>();
    private List<Housing> villas = new ArrayList<>();
    private List<Housing> summeries = new ArrayList<>();

    public HouseService() {
        houses.add(new House(1000000, 150, 3, 2));
        houses.add(new House(1200000, 180, 4, 2));
        houses.add(new House(1500000, 200, 5, 2));
        villas.add(new Villa(2000000, 250, 5, 3));
        villas.add(new Villa(2200000, 300, 6, 4));
        villas.add(new Villa(2500000, 320, 6, 5));
        summeries.add(new SummerHouse(1800000, 200, 4, 2));
        summeries.add(new SummerHouse(1900000, 220, 4, 2));
        summeries.add(new SummerHouse(2000000, 250, 5, 3));
    }

    public List<Housing> getHouses() {
        return houses;
    }

    public List<Housing> getVillas() {
        return villas;
    }

    public List<Housing> getSummerHouses() {
        return summeries;
    }

    public double getTotalPriceForHouses() {
        double totalPrice = 0;
        for (Housing house : houses) {
                totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceForVillas() {
        double totalPrice = 0;
        for (Housing villa : villas) {
                totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceForSummerHouses() {
        double totalPrice = 0;
        for (Housing summery : summeries) {
                totalPrice += summery.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceForAllHouses() {
        return getTotalPriceForHouses() + getTotalPriceForSummerHouses() + getTotalPriceForVillas();
    }

    public double getAverageSquareMetersForHouses() {
        double totalSquareMeters = 0;
        for (Housing house : houses) {
            if (house instanceof House) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / houses.size();
    }
    public double getAverageSquareMetersForVillas() {
        double totalSquareMeters = 0;
        for (Housing house : villas) {
            if (house instanceof Villa) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / villas.size();
    }

    public double getAverageSquareMetersForSummerHouses() {
        double totalSquareMeters = 0;
        for (Housing house : summeries) {
            if (house instanceof SummerHouse) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / summeries.size();
    }

    public double getAverageSquareMetersForAllHouses() {
        int totalHouse = houses.size() + villas.size() + summeries.size();
        return (getAverageSquareMetersForHouses() + getAverageSquareMetersForSummerHouses() + getAverageSquareMetersForVillas()) / totalHouse;
    }

    public List<Housing> filterHousesByRoomsAndSalons(int minRooms, int minSalons) {
        List<Housing> allHouses = new ArrayList<>();
        allHouses.addAll(summeries);
        allHouses.addAll(villas);
        allHouses.addAll(houses);
        List<Housing> filteredHouses = new ArrayList<>();
        for (Housing house : allHouses) {
            if (house.getRooms() >= minRooms && house.getSalons() >= minSalons) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}