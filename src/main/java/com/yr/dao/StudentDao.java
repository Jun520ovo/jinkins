package com.yr.dao;

import com.yr.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author weizijun
 * @date 2021/4/16 9:58
 */
@Repository
public class StudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void findByName() {
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
        String querySQL = "select * from student";
        List<Student> list = jdbcTemplate.query(querySQL,rowMapper);
        for (Student student : list) {
            System.out.printf(student.toString());
        }
    }


}
