import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

    HouseService houseService = new HouseService();

    List<Housing> allHouses = new ArrayList<>();
    allHouses.addAll(houseService.summeries);
    allHouses.addAll(houseService.villas);
    allHouses.addAll(houseService.houses);

    System.out.println("Total price for houses: " + houseService.getTotalPriceForHousing(houseService.houses));
    System.out.println("Total price for villas: " + houseService.getTotalPriceForHousing(houseService.villas));
    System.out.println("Total price for summer houses: " + houseService.getTotalPriceForHousing(houseService.summeries));
    System.out.println("Total price for all houses: " + houseService.getTotalPriceForHousing(allHouses));


    System.out.println("Average square meters for houses: " + houseService.getAverageSquareMetersForHousing(houseService.houses));
    System.out.println("Average square meters for villas: " + houseService.getAverageSquareMetersForHousing(houseService.villas));
    System.out.println("Average square meters for summer houses: " + houseService.getAverageSquareMetersForHousing(houseService.summeries));
    System.out.println("Average square meters for all houses: " + houseService.getAverageSquareMetersForHousing(allHouses));

    List<Housing> filteredHouses = houseService.filterHousesByRoomsAndSalons(5, 3);
    System.out.println("Houses filtered by rooms and salons: " + filteredHouses);
    }
}

