package com.zs.common.model;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:52
 */
import lombok.Data;

import java.util.List;

@Data
public class IMRecvInfo<T> {

    /*
     * 命令类型
     */
    private Integer cmd;

    /*
     * 接收者id列表
     */
    private List<Long> recvIds;

    /*
     * 推送消息体
     */
    private T data;
}


