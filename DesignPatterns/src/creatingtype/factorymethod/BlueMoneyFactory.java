package creatingtype.factorymethod;

/** 
 * ��ɫëүү����
 */
public class BlueMoneyFactory implements MoneyFactory {

    /**
     * ���Money
     */
    public Money getMoney() {
        return new BlueMoney();
    }

}
