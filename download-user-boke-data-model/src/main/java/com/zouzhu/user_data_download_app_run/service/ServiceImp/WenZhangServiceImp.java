package com.zouzhu.user_data_download_app_run.service.ServiceImp;

import com.zouzhu.user_data_download_app_run.mapper.WenZhangAllMapper;
import com.zouzhu.user_data_download_app_run.pojo.WenZhang;
import com.zouzhu.user_data_download_app_run.service.WenZhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WenZhangServiceImp implements WenZhangService {


    @Autowired
    private WenZhangAllMapper wenZhangAllMapper;


    @Override
    public List<WenZhang> SelectByAllTenData() {

        List<WenZhang> wenZhangByTenDayAllDayList = wenZhangAllMapper.SelectByAllTenData();

        return wenZhangByTenDayAllDayList;

    }
}
