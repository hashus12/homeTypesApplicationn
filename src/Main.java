import java.util.List;

public class Main {
    public static void main(String[] args){

    HouseService houseService = new HouseService();

    System.out.println("Houses: " + houseService.getHouses());
    System.out.println("Villas: " + houseService.getVillas());
    System.out.println("Summer Houses: " + houseService.getSummerHouses());

    System.out.println("Total price for houses: " + houseService.getTotalPriceForHouses());
    System.out.println("Total price for villas: " + houseService.getTotalPriceForVillas());
    System.out.println("Total price for summer houses: " + houseService.getTotalPriceForSummerHouses());
    System.out.println("Total price for all houses: " + houseService.getTotalPriceForAllHouses());

    System.out.println("Average square meters for houses: " + houseService.getAverageSquareMetersForHouses());
    System.out.println("Average square meters for villas: " + houseService.getAverageSquareMetersForVillas());
    System.out.println("Average square meters for summer houses: " + houseService.getAverageSquareMetersForSummerHouses());
    System.out.println("Average square meters for all houses: " + houseService.getAverageSquareMetersForAllHouses());

    List<Housing> filteredHouses = houseService.filterHousesByRoomsAndSalons(5, 3);
    System.out.println("Houses filtered by rooms and salons: " + filteredHouses);
    }
}

