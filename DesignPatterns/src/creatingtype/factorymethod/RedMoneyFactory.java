package creatingtype.factorymethod;

public class RedMoneyFactory implements MoneyFactory {

    /**
     * ���Money
     */
    public Money getMoney() {
        return new RedMoney();
    }
}
