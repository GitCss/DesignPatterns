package creatingtype.abstractfactory;

// ���󹤳�ģʽ
public class MainClass {

    //    ���󹤳�ģʽ��������̬�Ĺ���ģʽ����Ϊ��
    //    �������һ���Եġ����󹤳�ģʽ������ͻ���
    //    �ṩһ���ӿڣ�ʹ�ÿͻ����ڲ���ָ����Ʒ�ľ�
    //    �����͵�����£��ܹ����������Ʒ��Ĳ�Ʒ��
    //    ��
    public static void main(String[] args) {
        MoneyFactory ohf = new HundredFactory();
        Money rmb100 = ohf.getRMB();
        rmb100.printMoney();
        Money usd100 = ohf.getUSD();
        usd100.printMoney();

        MoneyFactory ff = new FiftyFactory();
        Money rmb50 = ff.getRMB();
        rmb50.printMoney();
        Money usd50 = ff.getUSD();
        usd50.printMoney();

    }
}
