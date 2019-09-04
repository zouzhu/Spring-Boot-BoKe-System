package com.zouzhu.user_data_download_app_run.service;


import com.zouzhu.user_data_download_app_run.pojo.WenZhang;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface WenZhangService {

    default List<WenZhang> SelectByAllTenData(){
        return null;
    }

}
