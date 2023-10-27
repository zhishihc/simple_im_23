package com.zs.common.enums;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:30
 */
public enum IMListenerType{
    ALL(0,"全部消息"),
    PRIVATE_MESSAGE(1,"私聊消息"),
    GROUP_MESSAGE(2,"群聊消息");

    private Integer code;

    private String desc;

    IMListenerType(Integer index, String desc) {
        this.code =index;
        this.desc=desc;
    }


    public String description() {
        return desc;
    }


    public Integer code(){
        return this.code;
    }

}
