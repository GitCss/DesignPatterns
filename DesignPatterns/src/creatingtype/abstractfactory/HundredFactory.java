package creatingtype.abstractfactory;

/**
 * 100Ԫ����
 */
public class HundredFactory implements MoneyFactory {

    /**
     * 100Ԫ�����
     */
    public Money getRMB() {
        return new RMB100();
    }

    /**
     * 100Ԫ��Ԫ
     */
    public Money getUSD() {
        return new USD100();
    }

}
