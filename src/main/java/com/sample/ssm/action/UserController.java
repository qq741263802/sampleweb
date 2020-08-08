package com.sample.ssm.action;

import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
/**
 * @author lhm
 * @date 2020/8/8 23:13
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    private String toUser(Model model,Integer userId){
        UserInfo userInfo = userService.getUserInfoByUserId(userId);
        model.addAttribute("user", userInfo);
        return "user";
    }

}
