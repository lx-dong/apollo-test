package my;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lx-dong on 2019/6/3.
 */
@ConfigurationProperties("my")
public class MyConfigBean {
    private String a;
    private String b;
    private Integer c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MyConfigBean{" +
                "a='" + getA() + '\'' +
                ", b='" + getB() + '\'' +
                ", c=" + getC() +
                '}';
    }
}
