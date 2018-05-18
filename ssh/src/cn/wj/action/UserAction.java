package cn.wj.action;

import cn.wj.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute(){
        System.out.println("action.......");
        userService.add();
        return NONE;
    }
}
