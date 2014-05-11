package creatingtype.builder;

public class HouseDirector {

    public void makeHouse(HouseBuilder builder) {
        //����ذ�
        builder.makeFloor();
        //����ǽ
        builder.makeWall();
        //�����ݶ�
        builder.makeHousetop();
    }

}
