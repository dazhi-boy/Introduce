package dazhi.admin.base;

import dazhi.admin.base.entity.Resource;
import dazhi.admin.base.entity.Role;
import dazhi.admin.base.repository.ResourceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResourceRepositoryTests  extends BaseTests {
    @Autowired
    private ResourceRepository resourceRepository;
    @Before
    public void save(){
        Resource resource = new Resource();
        resource.setName("首页");
        resourceRepository.save(resource);
    }

    @Test
    public void findAll(){
        List<Resource> roles = resourceRepository.findAll();
        Assert.assertEquals(roles.size(),1);
    }

    @After
    public void deleteAll(){
        resourceRepository.deleteAll();
    }
}
