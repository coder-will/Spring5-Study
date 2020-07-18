package com.will.mapper;

import com.will.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{




    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        return null;
    }
}
