package com.zouzhu.user_view_display_model.povo;

import lombok.Data;

@Data
public class MessagePovo<T> {


    private int code;

    private String msg;

    private T data;

    /**  getter and setter **/


    public MessagePovo(){
        // 无参构造
    }

    @Override
    public String toString() {
        return "MessagePovo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
