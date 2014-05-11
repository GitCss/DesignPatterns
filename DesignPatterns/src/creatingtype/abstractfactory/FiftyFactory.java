package creatingtype.abstractfactory;

/**
 * 50元工厂
 */
public class FiftyFactory implements MoneyFactory {

    /**
     * 50元人民币
     */
    public Money getRMB() {
        return new RMB50();
    }

    /**
     * 50元美元
     */
    public Money getUSD() {
        return new USD50();
    }

}
