package creatingtype.factorymethod;

public class RedMoneyFactory implements MoneyFactory {

    /**
     * »ñµÃMoney
     */
    public Money getMoney() {
        return new RedMoney();
    }
}
