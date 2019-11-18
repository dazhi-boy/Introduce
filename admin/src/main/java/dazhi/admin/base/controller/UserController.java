package dazhi.admin.base.controller;

import dazhi.admin.base.entity.User;
import dazhi.admin.base.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractController<UserService> {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "userService")
    protected void setService(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "getUserList")
    @ResponseBody
    public List<User> getUserList() {
        return service.getUserList();
    }

}
