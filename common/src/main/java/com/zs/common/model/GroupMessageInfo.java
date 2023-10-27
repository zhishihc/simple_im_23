package com.zs.common.model;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:54
 */
import com.zs.common.serializer.DateToLongSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.Date;

@Data
public class GroupMessageInfo {

    /*
     * 消息id
     */
    private Long id;

    /*
     * 群聊id
     */
    private Long groupId;

    /*
     * 发送者id
     */
    private Long sendId;

    /*
     * 消息内容
     */
    private String content;

    /*
     * 消息内容类型 具体枚举值由应用层定义
     */
    private Integer type;

    /**
     * 发送时间
     */
    @JsonSerialize(using = DateToLongSerializer.class)
    private Date sendTime;
}
