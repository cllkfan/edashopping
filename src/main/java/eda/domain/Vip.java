package eda.domain;

import java.util.Date;

/**
 * @author TaoMinghui
 * @create 2021-10-24 22:18
 */
public class Vip {
    private int v_id;
    private int v_status;
    private String v_price;
    private String v_discount;
    private Date v_createtime;
    private Date v_endtime;
    private String test1;
    private String test2;

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getV_status() {
        return v_status;
    }

    public void setV_status(int v_status) {
        this.v_status = v_status;
    }

    public String getV_price() {
        return v_price;
    }

    public void setV_price(String v_price) {
        this.v_price = v_price;
    }

    public String getV_discount() {
        return v_discount;
    }

    public void setV_discount(String v_discount) {
        this.v_discount = v_discount;
    }

    public Date getV_createtime() {
        return v_createtime;
    }

    public void setV_createtime(Date v_createtime) {
        this.v_createtime = v_createtime;
    }

    public Date getV_endtime() {
        return v_endtime;
    }

    public void setV_endtime(Date v_endtime) {
        this.v_endtime = v_endtime;
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
