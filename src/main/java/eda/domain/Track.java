package eda.domain;

/**
 * @author TaoMinghui
 * @create 2021-10-24 22:13
 */
public class Track {
    private int t_id;
    private String t_name;
    private String t_code;
    private int s_id;
    private int r_id;
    private String test1;
    private String test2;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_code() {
        return t_code;
    }

    public void setT_code(String t_code) {
        this.t_code = t_code;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
