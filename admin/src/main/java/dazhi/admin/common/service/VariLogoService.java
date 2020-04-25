package dazhi.admin.common.service;


import dazhi.admin.common.entity.VariLogo;

import java.util.List;

public interface VariLogoService {
    void save(VariLogo variLogo);

    List<VariLogo> list();
}
