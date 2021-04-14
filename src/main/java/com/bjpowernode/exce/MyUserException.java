package com.bjpowernode.exce;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyUserException {
    @ExceptionHandler
    public ModelAndView doUserException(Exception exception){
        ModelAndView mv=new ModelAndView();
        mv.addObject("ex",exception);
        mv.addObject("cuowu","异常异常异常异常异常异常异常异常异常异常异常异常异常");


        mv.setViewName("defaultError");
        return mv;

    }
}
