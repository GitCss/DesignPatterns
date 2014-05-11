package creatingtype.builder;

/*
 * ºÀÕ¬¹¤³Ì¶Ó
 */
public class HaoZhaiBuilder implements HouseBuilder {

    House house = new House();

    public House getHouse() {
        return house;
    }

    public void makeFloor() {
        house.setFloor("ºÀÕ¬-->µØ°å");
    }

    public void makeHousetop() {
        house.setHousetop("ºÀÕ¬-->·¿¶¥");
    }

    public void makeWall() {
        house.setWall("ºÀÕ¬-->Ç½");
    }

}
