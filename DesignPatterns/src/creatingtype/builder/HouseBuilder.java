package creatingtype.builder;

/*
 * 工程队
 */
public interface HouseBuilder {

    //建造地板
    public void makeFloor();

    //建造墙
    public void makeWall();

    //建造屋顶
    public void makeHousetop();

    public House getHouse();
}
