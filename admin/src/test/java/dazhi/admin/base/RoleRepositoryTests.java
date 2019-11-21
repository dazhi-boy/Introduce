package dazhi.admin.base;

import dazhi.admin.base.entity.Role;
import dazhi.admin.base.repository.RoleRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class RoleRepositoryTests extends BaseTests {
    @Autowired
    private RoleRepository roleRepository;
    @Before
    public void save(){
        Role role = new Role();
        role.setName("老大");
        roleRepository.save(role);
    }

    @Test
    public void findAll(){
        List<Role> roles = roleRepository.findAll();
        Assert.assertEquals(roles.size(),1);
    }

    @After
    public void deleteAll(){
        roleRepository.deleteAll();
    }
}
