package dazhi.admin.common.controller;

import dazhi.admin.common.entity.VariMenu;
import dazhi.admin.common.service.VariLogoService;
import dazhi.admin.common.service.VariMenuService;
import dazhi.admin.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class VariMenuController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    VariMenuService variMenuService;

//    @PostMapping("/add")
    @PostMapping
    public Result add(VariMenu variMenu){
        System.out.println(variMenu);
        variMenuService.save(variMenu);
        return Result.ok("成功");
    }
}
