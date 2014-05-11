package creatingtype.abstractfactory;

/**
 * 100元工厂
 */
public class HundredFactory implements MoneyFactory {

    /**
     * 100元人民币
     */
    public Money getRMB() {
        return new RMB100();
    }

    /**
     * 100元美元
     */
    public Money getUSD() {
        return new USD100();
    }

}
