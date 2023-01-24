import java.util.ArrayList;
import java.util.List;

//House -> Ev
//Housing -> Konut
public class HouseService {
    //ev, villa ve yazlık için ödevde istenilen şekilde ayrı ayrı liste oluşturdum.
    public List<Housing> houses = new ArrayList<>();
    public List<Housing> villas = new ArrayList<>();
    public List<Housing> summeries = new ArrayList<>();
    public List<Housing> allHouses = new ArrayList<>();

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
        allHouses.addAll(summeries);
        allHouses.addAll(villas);
        allHouses.addAll(houses);
    }

    //evlerin toplam fiyatını dönen metod
    public double getTotalPriceForHousing(List<Housing> housings) {
        double totalPrice = 0;
        for (Housing housing : housings) {
            totalPrice += housing.getPrice();
        }
        return totalPrice;
    }

    //Evlerin ortalama metrekaresini dönen metod
    public double getAverageSquareMetersForHousing(List<Housing> housings) {
        double totalSquareMeters = 0;
        for (Housing housing : housings) {
                totalSquareMeters += housing.getSquareMeters();
        }
        return totalSquareMeters / housings.size();
    }

    //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metod
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