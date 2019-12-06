package example.Pattern.StructuralPatterns.FlyweightPattern;

public enum FlyweightDemo {

    Instance;

    FlyweightDemo() {

    }

    public void show() {

        final String houses[] = {"BeiJin", "ShangHai", "ChongQin", "ChangSha", "BeiJin", "ShangHai", "ChongQin", "ChangSha", "BeiJin", "ShangHai", "ChongQin", "ChangSha"};

        for (int i = 0; i < houses.length; ++i) {

            Apartment building = (Apartment) BuildingFactory.getApartmentmap(houses[i]);
            building.setArea(30 * (i+1));
            building.setFloor(2 * (i+2));
            building.setBuildingNumber(238099 + i);
            building.address();

        }

    }

}
