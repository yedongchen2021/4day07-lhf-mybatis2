package org.asset.dto;

import org.asset.model.Account;
import org.asset.model.Money;

//该类用于数据的传输，继承原始的表，添加连表的字段即可
public class AccountDto extends Account {

    private Money mo;

    public AccountDto() {
    }

    public AccountDto(Money mo) {
        this.mo = mo;
    }

    public Money getMo() {
        return mo;
    }

    public void setMo(Money mo) {
        this.mo = mo;
    }
//  super.toString（）直接调用父类Account类中的toString方法，打印值拼接
    @Override
    public String toString() {
        return "AccountDto{" +
                super.toString()+
                ",mo=" + mo +
                '}';
    }
}
