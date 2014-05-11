package creatingtype.abstractfactory;

// 抽象工厂模式
public class MainClass {

    //    抽象工厂模式是所有形态的工厂模式中最为抽
    //    象和最其一般性的。抽象工厂模式可以向客户端
    //    提供一个接口，使得客户端在不必指定产品的具
    //    体类型的情况下，能够创建多个产品族的产品对
    //    象。
    public static void main(String[] args) {
        MoneyFactory ohf = new HundredFactory();
        Money rmb100 = ohf.getRMB();
        rmb100.printMoney();
        Money usd100 = ohf.getUSD();
        usd100.printMoney();

        MoneyFactory ff = new FiftyFactory();
        Money rmb50 = ff.getRMB();
        rmb50.printMoney();
        Money usd50 = ff.getUSD();
        usd50.printMoney();

    }
}
