package dazhi.admin.common.controller;

import dazhi.admin.common.entity.VariLogo;
import dazhi.admin.common.service.VariLogoService;
import dazhi.admin.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("logo")
public class VariLogoController {
    @Autowired
    private VariLogoService variLogoService;

    @RequestMapping("save")
    public String save(VariLogo variLogo){
        variLogoService.save(variLogo);
        return "SUCCESS";
    }
    @RequestMapping("list")
    public Result list(){
        List<VariLogo> list =  variLogoService.list();
        Result result = Result.build();
        result.setData(list);
        return result;
    }
}
