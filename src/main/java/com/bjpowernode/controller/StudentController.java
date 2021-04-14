package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService service;
    @RequestMapping(value = "/insert.do")
    public ModelAndView doInsert(Student student){
        System.out.println(student.getName()+student.getAge());
        ModelAndView mv=new ModelAndView();
        int nums=service.addStudent(student);
        System.out.println(nums);
        if(nums>0){
            mv.addObject("student","注册成功"+student.getName());
        }
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping(value = "/queryStudent.do")
    @ResponseBody
    public List<Student> selectStudent(){
        List<Student> student=service.findStudent();
        return student;
    }

}
