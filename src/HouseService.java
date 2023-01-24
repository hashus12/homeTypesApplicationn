import java.util.ArrayList;
import java.util.List;

//House -> Ev
//Housing -> Konut
public class HouseService {
    private List<Housing> allHouses;

    public HouseService() {
        allHouses = new ArrayList<>();
        allHouses.add(new House(1000000, 150, 3, 2));
        allHouses.add(new House(1200000, 180, 4, 2));
        allHouses.add(new House(1500000, 200, 5, 2));
        allHouses.add(new Villa(2000000, 250, 5, 3));
        allHouses.add(new Villa(2200000, 300, 6, 4));
        allHouses.add(new Villa(2500000, 320, 6, 5));
        allHouses.add(new SummerHouse(1800000, 200, 4, 2));
        allHouses.add(new SummerHouse(1900000, 220, 4, 2));
        allHouses.add(new SummerHouse(2000000, 250, 5, 3));
    }

    public List<Housing> getHouses() {
        List<Housing> houses = new ArrayList<>();
        for (Housing house : allHouses) {
            if (house instanceof House) {
                houses.add(house);
            }
        }
        return houses;
    }

    public List<Housing> getVillas() {
        List<Housing> villas = new ArrayList<>();
        for (Housing house : allHouses) {
            if (house instanceof Villa) {
                villas.add(house);
            }
        }
        return villas;
    }

    public List<Housing> getSummerHouses() {
        List<Housing> summerHouses = new ArrayList<>();
        for (Housing house : allHouses) {
            if (house instanceof SummerHouse) {
                summerHouses.add(house);
            }
        }
        return summerHouses;
    }

    public double getTotalPriceForHouses() {
        double totalPrice = 0;
        for (Housing house : allHouses) {
            if (house instanceof House) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceForVillas() {
        double totalPrice = 0;
        for (Housing house : allHouses) {
            if (house instanceof Villa) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceForSummerHouses() {
        double totalPrice = 0;
        for (Housing house : allHouses) {
            if (house instanceof SummerHouse) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public double getTotalPriceForAllHouses() {
        double totalPrice = 0;
        for (Housing house : allHouses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public double getAverageSquareMetersForHouses() {
        double totalSquareMeters = 0;
        int houseCount = 0;
        for (Housing house : allHouses) {
            if (house instanceof House) {
                totalSquareMeters += house.getSquareMeters();
                houseCount++;
            }
        }
        return totalSquareMeters / houseCount;
    }
    public double getAverageSquareMetersForVillas() {
        double totalSquareMeters = 0;
        int villaCount = 0;
        for (Housing house : allHouses) {
            if (house instanceof Villa) {
                totalSquareMeters += house.getSquareMeters();
                villaCount++;
            }
        }
        return totalSquareMeters / villaCount;
    }

    public double getAverageSquareMetersForSummerHouses() {
        double totalSquareMeters = 0;
        int summerHouseCount = 0;
        for (Housing house : allHouses) {
            if (house instanceof SummerHouse) {
                totalSquareMeters += house.getSquareMeters();
                summerHouseCount++;
            }
        }
        return totalSquareMeters / summerHouseCount;
    }

    public double getAverageSquareMetersForAllHouses() {
        double totalSquareMeters = 0;
        for (Housing house : allHouses) {
            totalSquareMeters += house.getSquareMeters();
        }
        return totalSquareMeters / allHouses.size();
    }

    public List<Housing> filterHousesByRoomsAndSalons(int minRooms, int minSalons) {
        List<Housing> filteredHouses = new ArrayList<>();
        for (Housing house : allHouses) {
            if (house.getRooms() >= minRooms && house.getSalons() >= minSalons) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}