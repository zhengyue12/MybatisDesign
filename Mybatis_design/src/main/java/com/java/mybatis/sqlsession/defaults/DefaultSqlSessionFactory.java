package com.java.mybatis.sqlsession.defaults;

import com.java.mybatis.cfg.Configuration;
import com.java.mybatis.sqlsession.SqlSession;
import com.java.mybatis.sqlsession.SqlSessionFactory;
import sun.security.krb5.Config;


/**
 * SqlSessionFactory接口的实现类
 * @author ASUSSS
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }


}
