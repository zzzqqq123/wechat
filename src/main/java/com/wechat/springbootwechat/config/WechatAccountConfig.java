package com.wechat.springbootwechat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: zhangqiang
 * @CreateDate: 2019/1/4 15:59
 * @Version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    private String mpAppId;
    private String mpAppSecret;
    private String mchId;
    private String mchKey;
    private String keyPath;
    private String notifyUrl;

}
