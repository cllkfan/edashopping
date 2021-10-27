package eda.utils;

public class Token {
    private  String  uuid;
    private  boolean  login;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private  String  verifyCode;

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
