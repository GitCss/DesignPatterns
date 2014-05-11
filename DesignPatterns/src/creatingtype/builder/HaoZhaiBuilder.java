package creatingtype.builder;

/*
 * ��լ���̶�
 */
public class HaoZhaiBuilder implements HouseBuilder {

    House house = new House();

    public House getHouse() {
        return house;
    }

    public void makeFloor() {
        house.setFloor("��լ-->�ذ�");
    }

    public void makeHousetop() {
        house.setHousetop("��լ-->����");
    }

    public void makeWall() {
        house.setWall("��լ-->ǽ");
    }

}
