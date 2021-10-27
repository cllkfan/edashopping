package eda.domain;

/**
 * @author TaoMinghui
 * @create 2021-10-24 22:11
 */
public class Token {
    private int tk_id;
    private int tk_status;
    private String tk_message;
    private int u_id;
    private String test1;
    private String test2;

    public int getTk_id() {
        return tk_id;
    }

    public void setTk_id(int tk_id) {
        this.tk_id = tk_id;
    }

    public int getTk_status() {
        return tk_status;
    }

    public void setTk_status(int tk_status) {
        this.tk_status = tk_status;
    }

    public String getTk_message() {
        return tk_message;
    }

    public void setTk_message(String tk_message) {
        this.tk_message = tk_message;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
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

    public void setLogin(boolean b) {
    }

    public void setUsername(String username) {
    }
}
