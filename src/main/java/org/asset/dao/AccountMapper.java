package org.asset.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.asset.dto.AccountDto;
import org.asset.model.Account;
import org.asset.model.Money;

import java.util.List;

public interface AccountMapper {
//  新增
    Integer add(Account ac);
//  修改
    Integer change(@Param("id") Integer id,@Param("account") String account);
//  删除
    Integer del(@Param("id") Integer id);
//  查询单行
    Account getById(@Param("id") Integer id);
//  查询整个表
    List<Account> getAll();
//  分页
    List<Account> getByLimit(RowBounds rb);
//  多条件查询
    List<Account> getByWhere(@Param("account") String account,@Param("staff_state") Integer staff_state);
//  删除多项
    Integer delMore(@Param("ids") List<Integer>ids);
//  建立连表,按条件查询
    AccountDto getAccountAndMoney(@Param("id") Integer id);
//  建立连表，查询所有
    List<AccountDto> getAccountAndMoneyAll(@Param("id") Integer id);
}
