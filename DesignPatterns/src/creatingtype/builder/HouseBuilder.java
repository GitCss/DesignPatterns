package creatingtype.builder;

/*
 * ���̶�
 */
public interface HouseBuilder {

    //����ذ�
    public void makeFloor();

    //����ǽ
    public void makeWall();

    //�����ݶ�
    public void makeHousetop();

    public House getHouse();
}