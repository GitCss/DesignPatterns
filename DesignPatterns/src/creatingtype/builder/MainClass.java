package creatingtype.builder;

// 建造者模式
public class MainClass {

    //    Builder模式也叫建造者模式或者生成器模式，
    //    是由GoF提出的23种设计模式中的一种。Builder模式是一种对象创建型模式之一，用来
    //    隐藏复合对象的创建过程，它把复合对象的创建
    //    过程加以抽象，通过子类继承和重载的方式，动
    //    态地创建具有复合属性的对象。

    public static void main(String[] args) {
        //工程队
        HouseBuilder builder = new HaoZhaiBuilder();
        //设计者
        HouseDirector director = new HouseDirector();
        director.makeHouse(builder);

        House house = builder.getHouse();
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());
    }

}
