package org.asset.main;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.asset.dao.AccountMapper;
import org.asset.dto.AccountDto;
import org.asset.model.Account;
import org.asset.utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.List;

public class MyBatisDemo {
//  所有mybatis的测试实现类
    public static void main(String[] args) {
//        add();
//        change();
//        del();
//        getById();
//        getAll();
//        getByLimit();
//        getByWhere();
//        delMore();
//        getAccountAndMoney();
        getAccountAndMoneyAll();
    }
//<!--建立连表，查询所有数据-->
    public static void getAccountAndMoneyAll(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        List<AccountDto> getAccountAndMoneyAll=mapper.getAccountAndMoneyAll(3);
        for (AccountDto dto:getAccountAndMoneyAll){
            System.out.println(dto.toString());
        }
        //关闭
        session.close();
    }
//    <!--建立连表，按条件查询-->
    public static void getAccountAndMoney(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        AccountDto AccountAndMoney=mapper.getAccountAndMoney(3);
            System.out.println(AccountAndMoney.toString());
        //关闭
        session.close();
    }
//    <!--删除多项 -->
    public static void delMore(){
        List<Integer> ids=new ArrayList<>();
        ids.add(9);
        ids.add(15);

        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        Integer delMore=mapper.delMore(ids);
        System.out.println(delMore);
        //(mybatis默认对【写】操作开启事务）提交
        session.commit();
        //关闭
        session.close();
    }
//    <!--多条件查询-->
    public static void getByWhere(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        List<Account> Where=mapper.getByWhere(null,1);
        for (Account ac:Where){
            System.out.println(ac.toString());
        }
        //关闭
        session.close();
    }
//    <!--分页-->
    public static void getByLimit(){
//      构造方法设置页数：offset跳过几行；limit偏移几行，例如：跳过第1行，分页显示第2、第3行
        RowBounds rb=new RowBounds(1,2);

        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        List<Account> getByLimit=mapper.getByLimit(rb);
        for (Account ac:getByLimit){
            System.out.println(ac.toString());
        }
        //关闭
        session.close();
    }
//    <!--单表查询所有数据-->
    public static void getAll(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);

        List<Account> getAll=mapper.getAll();
        for (Account ac:getAll){
            System.out.println(ac.toString());
        }
        //关闭
        session.close();
    }
//    <!--按条件单表查询-->
    public static void getById(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);

        Account ById=mapper.getById(10);
        System.out.println(ById.toString());
        //关闭
        session.close();
    }
//    <!--按条件删除-->
    public static void del(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);

        Integer del=mapper.del(14);
        System.out.println(del);
        //(mybatis默认对【写】操作开启事务）提交
        session.commit();
        //关闭
        session.close();
    }
//    <!--按条件修改-->
    public static void change(){
        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);

        Integer oooo=mapper.change(14,"oooo");
        System.out.println(oooo);
        //(mybatis默认对【写】操作开启事务）提交
        session.commit();
        //关闭
        session.close();
    }
//    <!--按条件新增-->
    public static void add(){
        Account ac=new Account(null,"xxxx","666",0);

        SqlSession session= MyBatisUtils.get();
        AccountMapper mapper=session.getMapper(AccountMapper.class);
        Integer add=mapper.add(ac);
        System.out.println(add);
        //(mybatis默认对【写】操作开启事务）提交
        session.commit();
        //关闭
        session.close();
    }
}
