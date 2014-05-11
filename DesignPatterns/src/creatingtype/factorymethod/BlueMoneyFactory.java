package creatingtype.factorymethod;

public class BlueMoneyFactory implements MoneyFactory {

    /**
     * »ñµÃMoney
     */
    public Money getMoney() {
        return new BlueMoney();
    }

}
