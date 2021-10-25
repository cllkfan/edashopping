package eda.domain;

import java.util.Date;

/**
 * @author TaoMinghui
 * @create 2021-10-24 21:43
 */
public class Goods {
    private int gid;
    private String g_name;
    private String g_describe;
    private String g_price;
    private int g_num;
    private int g_status;
    private String g_score;
    private int d_id;
    private Date created;
    private Date updated;
    private String test1;
    private String test2;
    private String test3;
    private String test4;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public String getG_describe() {
        return g_describe;
    }

    public void setG_describe(String g_describe) {
        this.g_describe = g_describe;
    }

    public String getG_price() {
        return g_price;
    }

    public void setG_price(String g_price) {
        this.g_price = g_price;
    }

    public int getG_num() {
        return g_num;
    }

    public void setG_num(int g_num) {
        this.g_num = g_num;
    }

    public int getG_status() {
        return g_status;
    }

    public void setG_status(int g_status) {
        this.g_status = g_status;
    }

    public String getG_score() {
        return g_score;
    }

    public void setG_score(String g_score) {
        this.g_score = g_score;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
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

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4;
    }
}
