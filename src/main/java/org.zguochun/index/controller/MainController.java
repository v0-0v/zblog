package org.zguochun.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * project:zsblog
 * author:zhengguocchun
 * date:2017/8/16
 */
@Controller
@RequestMapping(path = "/index")
public class MainController {
    @RequestMapping(path = "/main")
    public String index(){

        return "jsp/admin/html/index";
    }
}
