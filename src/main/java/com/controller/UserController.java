package com.controller;

import com.pojo.Gender;
import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import javax.servlet.ServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    private Map<String, User> users = new HashMap<String, User>();

    @PostConstruct
    public void init() {
        users.put("luke", new User("Luke", "liu"));
        users.put("rain", new User("Rain", "yubao"));
    }

    @RequestMapping(value="/form")
    public ModelAndView user() {
//        创建ModelAndView将视图，模型名，模型实例做为参数传入
        ModelAndView modelAndView =
                new ModelAndView("userForm", "user", new User());
        //modelAndView.addObject("genders", Gender.values());
        //modelAndView.addObject("countries", countries);
        return modelAndView;
    }


    @RequestMapping(value="/result")
//    方法参数上设置@Valid注解触发，该注解被递归地应用到类的属性，没有此注解，则不会触发Bean验证
    public ModelAndView processUser(@Valid User user, BindingResult result) throws UserNotFoundException {
        ModelAndView modelAndView = new ModelAndView();
        String key = user.getUserName();
        User value = users.get(key);
        if(value == null) {
            throw new UserNotFoundException(key);
        }

        modelAndView.addObject("u", user);
        if(result.hasErrors()) {
            modelAndView.setViewName("userForm");
        }else{
            modelAndView.setViewName("userResult");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ModelAndView processUser2(@Valid  User user,  BindingResult result) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        if(result.hasErrors()) {
            modelAndView.setViewName("userForm");
        }else{
            modelAndView.addObject("u", user);
            modelAndView.addObject("userName", user.getUserName());
            modelAndView.addObject("fileLength", user.getFile().getBytes().length);
            modelAndView.setViewName("fileUpload");
        }

        return modelAndView;
    }


}
