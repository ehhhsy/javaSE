package Demo40;
/*
�ӿ���Ϊ��Ա��������
 */
  public class DemoGanme {
    public DemoGanme() {
    }

    public static void main(String[] args) {
          Hero hero =new Hero();
          hero.setName("��ϣ");   //����Ӣ������

          //����Ӣ�۵ļ���
        hero.setSkill(new SkillImple());  //ʹ��ʵ������ʵ��
         hero.attach();

        //�����ڲ���ʵ�� ���������
        System.out.println("====================");
      Skill abc=new Skill(){   //�������ڲ���ʵ��
          @Override
          public void use() {
              System.out.println("biu-biu-biu");

          }
      };
      hero.setSkill(abc);
     hero.attach();

     //ʹ�������������������
        System.out.println("====================");
        hero.setSkill(new Skill(){
            @Override
            public void use() {
                System.out.println("beng-beng-beng");
            }
        });

        hero.attach();


}
}