package icu.lijiaqi.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author:LeeGaki
 * @date:2022/5/12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg {
    private String from;
    private String to;
    private String content;
    private LocalDateTime date;
    private String formNickName;
}