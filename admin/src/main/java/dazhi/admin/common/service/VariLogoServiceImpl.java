package dazhi.admin.common.service;

import dazhi.admin.common.entity.VariLogo;
import dazhi.admin.common.repository.VariLogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariLogoServiceImpl implements VariLogoService {
    @Autowired
    private VariLogoRepository variLogoRepository;
    @Override
    public void save(VariLogo variLogo) {
        variLogoRepository.save(variLogo);
    }

    @Override
    public List<VariLogo> list() {
        return variLogoRepository.findAll();
    }
}
