package creatingtype.builder;

/*
 * �������̶�
 */
public class BieShuBuilder implements HouseBuilder {

    House house = new House();

    public void makeFloor() {
        house.setFloor("����-->�ذ�");
    }

    public void makeHousetop() {
        house.setHousetop("����-->����");
    }

    public void makeWall() {
        house.setWall("����-->ǽ");
    }

    public House getHouse() {
        return house;
    }

}
