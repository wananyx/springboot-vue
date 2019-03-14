package com.yx.adx.controller;

import com.yx.adx.domian.AdvCust;
import com.yx.adx.service.AdvCustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adv")
public class AdvCustController {

    @Autowired
    private AdvCustService advCustService;

    @GetMapping("/getList")
    public List<AdvCust> getList(){
        return advCustService.getList();
    }


}
