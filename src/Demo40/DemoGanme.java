package Demo40;
/*
接口作为成员变量类型
 */
  public class DemoGanme {
    public DemoGanme() {
    }

    public static void main(String[] args) {
          Hero hero =new Hero();
          hero.setName("艾希");   //设置英雄名称

          //设置英雄的技能
        hero.setSkill(new SkillImple());  //使用实现类来实现
         hero.attach();

        //匿名内部类实现 定义个技能
        System.out.println("====================");
      Skill abc=new Skill(){   //用匿名内部类实现
          @Override
          public void use() {
              System.out.println("biu-biu-biu");

          }
      };
      hero.setSkill(abc);
     hero.attach();

     //使用匿名对象和匿名对象
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