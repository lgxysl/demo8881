package com.example.demo.n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019-08-27.
 */
@Controller
public class aa {
    @ResponseBody
    @RequestMapping("/youIs")
    public String youIs() {
        return "你好,我是SP";
    }
}

