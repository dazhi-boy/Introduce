package dazhi.admin.base.repository;

import dazhi.admin.base.entity.Resource;
import dazhi.admin.base.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleResourceTests extends BaseTests {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ResourceRepository resourceRepository;
    @Test
    public void save(){
        Resource resource = new Resource();
        resource.setName("首页");
        Role role = new Role();
        role.setName("老大");
        role.getResources().add(resource);
        roleRepository.save(role);
    }
}
