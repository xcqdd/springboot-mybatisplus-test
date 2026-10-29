package org.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.dao.UserDao;
import org.example.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusExampleApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testUpdate(){
        user user = userDao.selectById(1L);
        user.setName("Person");
        userDao.updateById(user);
    }

    @Test
    void testSelectById() {
        user user = userDao.selectById(1L);
        System.out.println(user);
    }

    @Test
    void testGetAll() {
        List<user> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void testselect1() {
        LambdaQueryWrapper<user> qw = new LambdaQueryWrapper<user>();
        qw.lt(user::getAge, 20).gt(user::getAge, 10); // Changed from qw.lambda().lt(user::getAge, 20).gt(user::getAge, 10);
        List<user> users = userDao.selectList(qw);
        System.out.println(users);
    }

    @Test
    void testLogicDelete() {
        userDao.deleteById(1L);
    }
}
