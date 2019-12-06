package example.Pattern.StructuralPatterns.FlyweightPattern;

public class Apartment implements Building {

    private String city;   //所在城市
    private int area;  //面积
    private int floor; //楼层
    private int buildingNumber; //楼号


    public Apartment(String city) {

        this.city = city;

    }

    @Override
    public void address() {
        System.out.println( city + " 的房子，面积为：" + area + ",楼层是：" + floor + ",建筑编号：" + buildingNumber);
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
