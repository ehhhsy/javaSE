package Demo30.test_practical_2022;

public class MysqlDAO extends AbstractDAO{
    @Override
    public void connect() {
        System.out.println("mysql连接实现");
    }
}
