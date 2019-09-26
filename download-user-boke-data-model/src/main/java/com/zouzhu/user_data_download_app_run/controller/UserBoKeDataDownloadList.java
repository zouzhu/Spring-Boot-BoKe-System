package com.zouzhu.user_data_download_app_run.controller;


import com.zouzhu.user_data_download_app_run.pojo.WenZhang;
import com.zouzhu.user_data_download_app_run.povo.WenZhangVO;
import com.zouzhu.user_data_download_app_run.service.WenZhangService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserBoKeDataDownloadList {


    @Autowired private WenZhangService wenZhangService;

    @GetMapping("/all/boke-data")
    public List<WenZhangVO> ResultVODataList(){

        /*      当前端打开页面会加载最近10天的博客数据，返回给用户界面
        *       负责人 : zouzhu
        *       修改时间 ：2019年9月4日 9点38分
        * */
        List<WenZhang> wenZhangByTenDayAllData = wenZhangService.SelectByAllTenData();
        List<WenZhangVO> wenzhangVOList = new ArrayList<>();

        wenZhangByTenDayAllData.stream().forEach(e -> {
            WenZhangVO wenZhangVO = new WenZhangVO();
            BeanUtils.copyProperties(e, wenZhangVO);
            wenzhangVOList.add(wenZhangVO);
        });
        return wenzhangVOList;

    }


    @GetMapping("/user-view/oneRequestDataDownload")
    public List<String> oneDownloadAllData(){
        /*
        *      描述 : 用来加载用户第一次请求的数据，包括用户信息，文章分类，文章正文，封装成一个 pojo， 作为服务的提供者
        *
        *      auther : zouzhu
        *
        *       time : 2019.9.23  20:53
        * */
        return null;
    }


    @GetMapping("/user-request-class-data/{class-name}")
    public List<WenZhang> getOnlyRequestClassTextMessageList(){
        /*
        *       描述 ： 用于加载指定用户点击的文章分类文章，包括指定分类的所有文章，按时间排序
        *
        *       auther : zouzhu
        *
        *       time : 2019.9.23  20:58
        * */

        return null;
    }

    


}
