package com.wechat.springbootwechat.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: zhangqiang
 * @CreateDate: 2019/1/4 15:50
 * @Version: 1.0
 */
@Component
public class WeixinConfig {
    @Autowired
    private WechatAccountConfig wechatAccountConfig;
    @Bean
    public WxMpService wxMpService(WxMpConfigStorage wxMpConfigStorage){
        WxMpService wxMpService=new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
        return wxMpService;
    }
    @Bean(name = "wxMpConfigStorage")
    public WxMpConfigStorage wxMpConfigStorage(){
        WxMpInMemoryConfigStorage wxMpConfig=new WxMpInMemoryConfigStorage();
        wxMpConfig.setAppId("wx50c651ace3e7e64c");
        wxMpConfig.setSecret("07bf8e625cfa9f081e66c847059210b8");
        return  wxMpConfig;
    }

}
