package creatingtype.factorymethod;

/** 
 * 蓝色毛爷爷工厂
 */
public class BlueMoneyFactory implements MoneyFactory {

    /**
     * 获得Money
     */
    public Money getMoney() {
        return new BlueMoney();
    }

}
