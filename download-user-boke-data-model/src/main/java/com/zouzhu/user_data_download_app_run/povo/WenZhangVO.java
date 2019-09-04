package com.zouzhu.user_data_download_app_run.povo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 *      Java PoJo class ---> WenZhang
 *
 *      Author : zouzhu
 *
 *      time : 2019/9/4     12:21  星期三
 *
 * **/

@Data
public class WenZhangVO {

    private int id;                         // 主键 ID
    private String title;                   // 标题
    private String miaoshu;                 // 描述
    private String content;                 // 正文
    private LocalDateTime createTime;       // 创建时间
    private LocalDateTime updateTime;       // 更新时间


    @Override
    public String toString() {
        return "WenZhang{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", miaoshu='" + miaoshu + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }


    public WenZhangVO(){}
}


