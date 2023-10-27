package com.zs.common.contant;

/**
 * @author zhishi
 * @version 1.0
 * @date 2023/10/22 16:28
 */
public class RedisKey {

    // im-server最大id,从0开始递增
    public final static String  IM_MAX_SERVER_ID = "im:max_server_id";
    // 用户ID所连接的IM-server的ID
    public final static String  IM_USER_SERVER_ID = "im:user:server_id:";
    // 未读私聊消息队列
    public final static String IM_UNREAD_PRIVATE_QUEUE = "im:unread:private:";
    // 未读群聊消息队列
    public final static String IM_UNREAD_GROUP_QUEUE = "im:unread:group:";
    // 私聊消息发送结果队列
    public final static String IM_RESULT_PRIVATE_QUEUE = "im:result:private";
    // 群聊消息发送结果队列
    public final static String IM_RESULT_GROUP_QUEUE = "im:result:group";

}
