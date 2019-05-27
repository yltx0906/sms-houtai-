package com.briup.apps.tb_app01.web.controller;

import com.briup.apps.tb_app01.bean.Phone;
import com.briup.apps.tb_app01.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: tb_app01
 * @description: 测试控制器
 * @author: charles
 * @create: 2019-04-29 10:59
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private IPhoneService phoneService;

    @GetMapping("findAll")
    public List<Phone> findAll(){
        return phoneService.findAll();
    }
    @GetMapping("findById")
    public Phone findById(long id){
        return phoneService.findById(id);
    }
    @PostMapping("saveOrUpdate")
    public String saveOrUpdate( Phone phone){
        phoneService.saveOrUpdate(phone);
        return "sucess";
    }

}
