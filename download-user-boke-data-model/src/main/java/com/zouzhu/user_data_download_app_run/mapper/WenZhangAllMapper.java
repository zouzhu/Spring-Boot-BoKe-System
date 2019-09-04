package com.zouzhu.user_data_download_app_run.mapper;


import com.zouzhu.user_data_download_app_run.pojo.WenZhang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Mapper
public interface WenZhangAllMapper {

    @Select("select * from wenzhang")
    public List<WenZhang> SelectByAllTenData();

}
