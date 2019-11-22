package dazhi.admin.base.repository;

import dazhi.admin.base.entity.Role;
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
    }

    @After
    public void deleteAll(){
        roleRepository.deleteAll();
    }
}
