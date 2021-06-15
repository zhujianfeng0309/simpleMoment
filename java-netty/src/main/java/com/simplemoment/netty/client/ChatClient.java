package com.simplemoment.netty.client;

import com.simplemoment.netty.dto.ChatMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author heng
 */
@Slf4j
@Component
public abstract class ChatClient {

    /**
     * 发送聊天消息
     *
     * @param dto
     */
    protected abstract void sendMsg(ChatMessageDto dto);

}