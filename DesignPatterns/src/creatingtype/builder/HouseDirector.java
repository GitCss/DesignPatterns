package creatingtype.builder;

public class HouseDirector {

    public void makeHouse(HouseBuilder builder) {
        //建造地板
        builder.makeFloor();
        //建造墙
        builder.makeWall();
        //建造屋顶
        builder.makeHousetop();
    }

}
