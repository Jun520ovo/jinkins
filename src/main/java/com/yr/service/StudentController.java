package com.yr.service;

import com.yr.dao.StudentDao;
import com.yr.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author weizijun
 * @date 2021/4/16 10:06
 */
@Controller
public class StudentController {
    @Autowired
    private StudentDao StudentDao;

    @ResponseBody
    @RequestMapping("/list")
    public String query(){
        StudentDao.findByName();
        return "111";
    }
}
