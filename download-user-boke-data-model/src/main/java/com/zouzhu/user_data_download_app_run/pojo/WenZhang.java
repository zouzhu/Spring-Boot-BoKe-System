package com.zouzhu.user_data_download_app_run.pojo;

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
public class WenZhang {

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


    public WenZhang(){}
}


/**
    文章表
    CREATE TABLE wenzhang
    (
        id INTEGER PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
        title VARCHAR(300) NOT NULL COMMENT '标题',
        miaoshu VARCHAR(600) NOT NULL COMMENT '描述',
        content TEXT NOT NULL COMMENT '正文',
        img VARCHAR(512) COMMENT '图片',
        create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
        update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
        u_id INTEGER COMMENT '作者',
        CONSTRAINT user_id FOREIGN KEY(u_id) REFERENCES USER(id)
    );
 **/


