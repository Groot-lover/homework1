package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


public class MyBatisUtil {
    private static SqlSessionFactory factory = null;
    public static SqlSession getSqlSession() throws IOException {
        if (factory == null){
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        }
        return factory.openSession();
    }
}
