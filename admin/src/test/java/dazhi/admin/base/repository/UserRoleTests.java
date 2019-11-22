package dazhi.admin.base.repository;

import dazhi.admin.base.entity.Role;
import dazhi.admin.base.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRoleTests extends BaseTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void save(){
        Role role = new Role();
        role.setName("老大");

        User user = new User();
        user.setUsername("1111");
        user.setPassword("1111");
        user.setRole(role);

        roleRepository.save(role);
        userRepository.save(user);
    }
    @Test
    public void findAll() {
        List<User> users =  userRepository.findAll();
//        User user = users.get(0);
//        System.out.println(user.getRole().getName());
    }
    /*
    @After
    public void deleteAll(){
        userRepository.deleteAll();
    }*/
}
