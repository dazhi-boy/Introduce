package dazhi.admin.base;

import dazhi.admin.base.entity.User;
import dazhi.admin.base.repository.UserRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTests extends BaseTests {
    @Autowired
    private UserRepository userRepository;
    @Before
    public void save(){
        User user = new User();
        user.setUsername("1111");
        user.setPassword("1111");

        userRepository.save(user);
    }
    @Test
    public void findAll() {
        Assert.assertEquals(userRepository.findAll().size(),1);
    }
    @After
    public void deleteAll(){
        userRepository.deleteAll();
    }
}
