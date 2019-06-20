package my;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by lx-dong on 2019/6/18.
 */

public class MyConfigBean2 {
    @Value("${auto:}")
    private String auto;
    @Value("${my.a}")
    private String a;

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyConfigBean2{" +
                "auto='" + auto + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
