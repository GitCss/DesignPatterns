package creatingtype.factorymethod;

// ��������ģʽ
public class MainClass {

    //    ��������ģʽͬ��������Ĵ�����ģʽ�ֱ���
    //    Ϊ��̬����ģʽ ����������ģʽ�������Ƕ���һ������
    //    ��Ʒ����Ĺ����ӿڣ���ʵ�ʴ��������Ƴٵ����൱�С�
    //    ���Ĺ����಻�ٸ����Ʒ�Ĵ����������������Ϊһ��
    //    ���󹤳���ɫ����������幤���������ʵ�ֵĽӿڣ�
    //    ������һ�����󻯵ĺô���ʹ�ù�������ģʽ����ʹϵ
    //    ͳ�ڲ��޸ľ��幤����ɫ������������µĲ�Ʒ��
    public static void main(String[] args) {
        //���BlueMoneyFactory
        MoneyFactory bmf = new BlueMoneyFactory();
        //ͨ��BlueMoneyFactory�����BlueMoneyʵ������
        Money bm = bmf.getMoney();
        bm.printMoney();

        //���RedMoneyFactory
        MoneyFactory rmf = new RedMoneyFactory();
        //ͨ��RedMoneyFactory�����RedMoneyʵ������
        Money rm = rmf.getMoney();
        rm.printMoney();

    }
}
