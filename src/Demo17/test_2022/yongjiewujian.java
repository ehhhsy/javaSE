package Demo17.test_2022;

public class yongjiewujian extends game{
    String name="�����޼�";
    @Override
    public void play() {
        System.out.println("playing the �����޼�");
    }

    @Override
    public void start() {
        System.out.println("ѡ�˻���");
    }

    @Override
    public void end() {
        System.out.println("ŭ�����");
    }

    public void attack(String p){
        switch (p){
            case "����":
                System.out.println("�������������");
                break;
            case "̫��":
                System.out.println("�ɻ�ն+����ʮ��");
                break;
            case "˫�ڹ�":
                System.out.println("��Х����gogogo");
                break;
            default:
                System.out.println("�㵶û��");
        }

    }
}
