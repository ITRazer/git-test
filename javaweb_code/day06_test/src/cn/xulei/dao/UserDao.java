package cn.xulei.dao;

import cn.xulei.domain.User;
import cn.xulei.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库中user的类
 */
public class UserDao {
    //声明JDBCTemplate对象共享用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        public User login(User loginUser){
            try {
                String sql = "select * from user where username = ? and password = ?";
                User user = template.queryForObject(sql,
                        new BeanPropertyRowMapper<>(User.class),
                        loginUser.getUsername(), loginUser.getPassword());
                return user;
            }catch (DataAccessException e){
                e.printStackTrace();
                return null;
            }
    }

}
