package creatingtype.builder;

// ������ģʽ
public class MainClass {

    //    BuilderģʽҲ�н�����ģʽ����������ģʽ��
    //    ����GoF�����23�����ģʽ�е�һ�֡�Builderģʽ��һ�ֶ��󴴽���ģʽ֮һ������
    //    ���ظ��϶���Ĵ������̣����Ѹ��϶���Ĵ���
    //    ���̼��Գ���ͨ������̳к����صķ�ʽ����
    //    ̬�ش������и������ԵĶ���

    public static void main(String[] args) {
        //���̶�
        HouseBuilder builder = new HaoZhaiBuilder();
        //�����
        HouseDirector director = new HouseDirector();
        director.makeHouse(builder);

        House house = builder.getHouse();
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());
    }

}
