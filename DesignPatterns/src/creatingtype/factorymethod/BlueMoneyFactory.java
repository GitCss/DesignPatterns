package creatingtype.factorymethod;

public class BlueMoneyFactory implements MoneyFactory {

    /**
     * ���Money
     */
    public Money getMoney() {
        return new BlueMoney();
    }

}
