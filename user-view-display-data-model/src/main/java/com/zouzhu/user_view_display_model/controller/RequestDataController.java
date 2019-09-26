package com.zouzhu.user_view_display_model.controller;


import com.zouzhu.user_view_display_model.povo.MessagePovo;
import com.zouzhu.user_view_display_model.povo.TextClassPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class RequestDataController {
    /**
     *        描述 : 当前端页面初始化的时候负责加载数据用于合成前端模板展示给用户, 主要用来收集数据
     *
     *        Auther : zouzhu
     *
     *        time : 2019/9/10  15.05
     * **/

    @ResponseBody
    @GetMapping("/user-view/oneRequestDataDownload")
    public MessagePovo oneRequestDataDownload(){
        /**
         *
         *    描述 : MesssagePovo 是整个消息体, 包括状态, 时间, 博客内容消息体, 在首页加载的时候显示近 10 天发布的博客内容
         *
         *    Auther : 邹柱
         *
         *    time : 2019/9/10   15:11
         * */
        MessagePovo messagePovo = new MessagePovo();
        messagePovo.setCode(200);
        messagePovo.setMsg("请求成功 !");
        messagePovo.setData(null);
        return messagePovo;
    }


    @RequestMapping(method = RequestMethod.GET, value = {"/test"})
    @ResponseBody
    public String webTest(){
        return "测试成功 !";
    }



}
