package com.java.mybatis.sqlsession;

import com.java.mybatis.cfg.Configuration;
import com.java.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.java.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    /**
     * 用于创建一个sqlsession对象
     * 根据参数的字节输入流来构建一个SqlSession对象
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
