package creatingtype.abstractfactory;

public interface MoneyFactory {

    //实例化RMB
    public Money getRMB();

    //实例化USD
    public Money getUSD();
}
