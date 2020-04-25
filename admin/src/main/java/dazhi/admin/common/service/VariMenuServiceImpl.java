package dazhi.admin.common.service;

import dazhi.admin.common.entity.VariMenu;
import dazhi.admin.common.repository.VariMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VariMenuServiceImpl implements VariMenuService {
    @Autowired
    VariMenuRepository variMenuRepository;
    @Override
    public void save(VariMenu variMenu) {
        variMenuRepository.save(variMenu);
    }
}
