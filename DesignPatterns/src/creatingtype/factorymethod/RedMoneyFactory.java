package creatingtype.factorymethod;

/** 
 * 红色毛爷爷工厂
 */
public class RedMoneyFactory implements MoneyFactory {

    /**
     * 获得Money
     */
    public Money getMoney() {
        return new RedMoney();
    }
}
