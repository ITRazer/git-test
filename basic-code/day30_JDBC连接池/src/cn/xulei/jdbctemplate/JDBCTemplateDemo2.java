package cn.xulei.jdbctemplate;

import cn.xulei.domain.Stu;
import cn.xulei.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo2 {

    //获取JdbcTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     *  修改 liuye 的年龄为 100
     */
    @Test
    public void test1(){
        String sql = "update t_stu set age = 100 where id = ?";
        int count = template.update(sql,2);
        System.out.println(count);
    }

    /**
     * 添加一条纪录
     */
    @Test
    public void test2(){
        String sql = "insert into t_stu(name,age) values(?,?)";
        int count = template.update(sql, "xuqin", 99);
        System.out.println(count);
        //{id=1, name=奥巴马, age=20, gender=男, address=美国}
    }

    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3(){
        String sql = "delete from t_stu where id = ?";
        int count = template.update(sql, 4);
        System.out.println(count);
    }

    /**
     * 查询id为1的纪录，并封装为Map集合,查询的结果集长度只能是1
     */
    @Test
    public void test4(){
        String sql = "select * from t_stu where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    /**
     * 查询所有的纪录，将其封装成List
     */
    @Test
    public void test5(){
        String sql = "select * from t_stu";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     * 自己实现接口
     */
    @Test
    public void test6(){
        String sql = "select * from t_stu";
        List<Stu> list = template.query(sql, new RowMapper<Stu>() {
            @Override
            public Stu mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String address = resultSet.getString("address");

                Stu stu = new Stu(id, name, age, gender, address);

                return stu;
            }
        });
        for (Stu stu : list) {
            System.out.println(stu);
        }
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6_2(){
        String sql = "select * from t_stu";
        List<Stu> list = template.query(sql, new BeanPropertyRowMapper<Stu>(Stu.class));
        for (Stu stu : list) {
            System.out.println(stu);
        }
    }

    /**
     * 查询总记录数
     */
    @Test
    public void test7(){
        String sql = "select count(id) from t_stu";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
