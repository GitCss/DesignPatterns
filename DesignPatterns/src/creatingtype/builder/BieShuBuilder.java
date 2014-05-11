package creatingtype.builder;

/*
 * 别墅工程队
 */
public class BieShuBuilder implements HouseBuilder {

    House house = new House();

    public void makeFloor() {
        house.setFloor("别墅-->地板");
    }

    public void makeHousetop() {
        house.setHousetop("别墅-->房顶");
    }

    public void makeWall() {
        house.setWall("别墅-->墙");
    }

    public House getHouse() {
        return house;
    }

}
