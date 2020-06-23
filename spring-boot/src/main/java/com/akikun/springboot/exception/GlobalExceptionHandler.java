package com.akikun.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(NotFoundException.class)
//    public ModelAndView notFound(HttpServletRequest request, Exception e) {
//        ModelAndView model = new ModelAndView();
//        model.addObject("exception", e);
//        model.setViewName("404");
//        return model;
//    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public String notFoundJson(HttpServletRequest request, Exception e) {
        return "TODO 404";
    }

    @ExceptionHandler(UnKnownException.class)
    @ResponseBody
    public String unKnownJson(HttpServletRequest request, Exception e) {
        return "TODO un known";
    }
}
