package cn.xulei.test;

import cn.xulei.dao.UserDao;
import cn.xulei.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User user = new User();
        user.setUsername("superbaby");
        user.setPassword("123");

        UserDao dao = new UserDao();
        User login = dao.login(user);
        System.out.println(login);
    }
}
