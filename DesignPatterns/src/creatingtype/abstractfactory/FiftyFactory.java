package creatingtype.abstractfactory;

/**
 * 50Ԫ����
 */
public class FiftyFactory implements MoneyFactory {

    /**
     * 50Ԫ�����
     */
    public Money getRMB() {
        return new RMB50();
    }

    /**
     * 50Ԫ��Ԫ
     */
    public Money getUSD() {
        return new USD50();
    }

}
