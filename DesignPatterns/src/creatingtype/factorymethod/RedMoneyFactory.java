package creatingtype.factorymethod;

/** 
 * ��ɫëүү����
 */
public class RedMoneyFactory implements MoneyFactory {

    /**
     * ���Money
     */
    public Money getMoney() {
        return new RedMoney();
    }
}
