package com.zouzhu.user_view_display_model.povo;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class TextContextPojo {

    private Integer id;

    private String title;

    private String miaoshu;

    private String context;

    private String img;

    private LocalDateTime create_time;

    private LocalDateTime update_time;

    private String username;

}
