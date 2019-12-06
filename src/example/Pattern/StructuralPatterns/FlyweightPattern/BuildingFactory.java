package example.Pattern.StructuralPatterns.FlyweightPattern;

import java.util.HashMap;

public class BuildingFactory {

    private static final HashMap<String, Building> apartmentMap = new HashMap();

    public static Building getApartmentmap(String house) {

        Apartment apartment = (Apartment) apartmentMap.get(house);

        if (apartment == null) {

            apartment = new Apartment(house);
            apartmentMap.put(house, apartment);
            System.out.println("__Creating house of name: " + house);

        }

        return apartment;

    }

}
