package com.zs.common.model;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:50
 */

import com.zs.common.enums.IMSendCode;
import lombok.Data;
public class SendResult<T> {
    /*
     * 接收者id
     */
    private Long recvId;

    /*
     * 发送状态
     */
    private IMSendCode code;

    /*
     * 消息体(透传)
     */
    private T messageInfo;

}
