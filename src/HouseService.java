import java.util.ArrayList;
import java.util.List;

//House -> Ev
//Housing -> Konut
public class HouseService {
    //ev, villa ve yazlık için ödevde istenilen şekilde ayrı ayrı liste oluşturdum.
    private List<Housing> houses = new ArrayList<>();
    private List<Housing> villas = new ArrayList<>();
    private List<Housing> summeries = new ArrayList<>();

    //Datayı almak için constructor kullandım.
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

    //Evleri yazlıkları ve villaları döndüren metodlar.
    public List<Housing> getHouses() {
        return houses;
    }

    public List<Housing> getVillas() {
        return villas;
    }

    public List<Housing> getSummerHouses() {
        return summeries;
    }

    //Evlerin toplam fiyatını dönen metod
    public double getTotalPriceForHouses() {
        double totalPrice = 0;
        for (Housing house : houses) {
                totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    //Villaların toplam fiyatını dönen metod
    public double getTotalPriceForVillas() {
        double totalPrice = 0;
        for (Housing villa : villas) {
                totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    //Yazlıkların toplam fiyatını dönen metod
    public double getTotalPriceForSummerHouses() {
        double totalPrice = 0;
        for (Housing summery : summeries) {
                totalPrice += summery.getPrice();
        }
        return totalPrice;
    }

    //Tüm tipteki evlerin toplam fiyatını alan metod
    public double getTotalPriceForAllHouses() {
        return getTotalPriceForHouses() + getTotalPriceForSummerHouses() + getTotalPriceForVillas();
    }

    //Evlerin ortlama metrekareisini dönen metod
    public double getAverageSquareMetersForHouses() {
        double totalSquareMeters = 0;
        for (Housing house : houses) {
            if (house instanceof House) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / houses.size();
    }

    //Villaların ortalama metrekaresini dönen metod
    public double getAverageSquareMetersForVillas() {
        double totalSquareMeters = 0;
        for (Housing house : villas) {
            if (house instanceof Villa) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / villas.size();
    }

    //Yazlıkların ortalama metrekaresini dönen metod
    public double getAverageSquareMetersForSummerHouses() {
        double totalSquareMeters = 0;
        for (Housing house : summeries) {
            if (house instanceof SummerHouse) {
                totalSquareMeters += house.getSquareMeters();
            }
        }
        return totalSquareMeters / summeries.size();
    }

    //Tüm tipteki evlerin ortalama metrekaresini dönen metod
    public double getAverageSquareMetersForAllHouses() {
        int totalHouse = houses.size() + villas.size() + summeries.size();
        return (getAverageSquareMetersForHouses() + getAverageSquareMetersForSummerHouses() + getAverageSquareMetersForVillas()) / totalHouse;
    }

    //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metod
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