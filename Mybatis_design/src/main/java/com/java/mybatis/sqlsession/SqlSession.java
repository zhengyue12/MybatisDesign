package com.java.mybatis.sqlsession;

public interface SqlSession {
    /**
     * 自定义mybatis中的和数据库交互的核心类
     * 它里面可以创建dao接口的代理对象
     * daoInterfaceClass，dao的接口字节码
     */

    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
