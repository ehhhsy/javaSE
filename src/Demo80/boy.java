package Demo80;

/**
 * @Author: hsy
 * @Date: 2022/11/16/18:30
 * @Description:
 */
public class boy {
    private girl girl;

    public boy(Demo80.girl girl) {
        this.girl = girl;
    }

    public boy() {
    }

    @Override
    public String toString() {
        return "boy{" +
                "girl=" + girl +
                '}';
    }

    public Demo80.girl getGirl() {
        return girl;
    }

    public void setGirl(Demo80.girl girl) {
        this.girl = girl;
    }
}
