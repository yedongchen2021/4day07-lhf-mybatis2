package org.asset.model;

public class Account {
    private Integer id;
    private String account;
    private String passwd;
    //  0.关闭，1.启用
    private Integer staff_state;

    public Account() {
    }
    public Account(Integer id, String account, String passwd, Integer staff_state) {
        this.id = id;
        this.account = account;
        this.passwd = passwd;
        this.staff_state = staff_state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public Integer getStaff_state() {
        return staff_state;
    }

    public void setStaff_state(Integer staff_state) {
        this.staff_state = staff_state;
    }
    @Override
    public String toString(){
        return "Account{"+
                "id="+id+
                ",account='"+account+'\''+
                ",passwd='"+passwd+'\''+
                ", staff_state=" + staff_state +
                '}';
    }
}
