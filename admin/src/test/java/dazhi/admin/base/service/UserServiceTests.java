package dazhi.admin.base.service;

import dazhi.admin.base.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTests extends BaseServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void findAll(){
        List<User> users = userService.getUserList();
        System.out.println(users.toString());
    }
}
