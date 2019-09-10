package com.zouzhu.user_view_display_model.controller;


import com.zouzhu.user_view_display_model.povo.MessagePovo;
import org.springframework.stereotype.Controller;

@Controller
public class RequestDataController {
    /**
     *        描述 : 当前端页面初始化的时候负责加载数据用于合成前端模板展示给用户, 主要用来收集数据
     *
     *        Auther : zouzhu
     *
     *        time : 2019/9/10  15.05
     * **/

    public MessagePovo getMessagePovo(){
        /**
         *
         *    描述 : MesssagePovo 是整个消息体, 包括状态, 时间, 博客内容消息体, 在首页加载的时候显示近 10 天发布的博客内容
         *
         *    Auther : 邹柱
         *
         *    time : 2019/9/10   15:11
         * */
        return null;
    }






}
