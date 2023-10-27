package com.zs.common.model;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:52
 */
import lombok.Data;

@Data
public class IMSendInfo<T> {

    /*
     * 命令
     */
    private Integer cmd;

    /*
     * 推送消息体
     */
    private T data;

}
