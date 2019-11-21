package dazhi.admin.base;

import dazhi.admin.base.entity.Resource;
import dazhi.admin.base.entity.Role;
import dazhi.admin.base.repository.ResourceRepository;
import dazhi.admin.base.repository.RoleRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoleResourceTests extends BaseTests {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ResourceRepository resourceRepository;
    @Test
    public void save(){
        Set<Role> roles = new HashSet<Role>();
        Role role = new Role();
        role.setName("老大");
        roles.add(role);
        Resource resource = new Resource();
        resource.setName("首页");
        resource.setRoles(new HashSet<Role>(roles));
        resourceRepository.save(resource);
        roleRepository.save(role);
    }

//    @Test
//    public void findAll(){
//        List<Role> roles = roleRepository.findAll();
//        Assert.assertEquals(roles.size(),1);
//    }
//
//    @After
//    public void deleteAll(){
//        roleRepository.deleteAll();
//    }
}
