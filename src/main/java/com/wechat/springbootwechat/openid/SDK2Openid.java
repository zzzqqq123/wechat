package com.wechat.springbootwechat.openid;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLEncoder;

/**
 * @Description: java类作用描述
 * @Author: zhangqiang
 * @CreateDate: 2019/1/4 14:49
 * @Version: 1.0
 */
@Slf4j
@Controller
@RequestMapping("/wechat")
public class SDK2Openid {
    @Autowired
    private WxMpService wxMpService;

    @RequestMapping("/auth")
    public String getOpenIdBySDK(@RequestParam("returnUrl") String returnUrl) {
        String redirectURI = "http://www.yueyenongye.com/wechat/userinfo";
        String result = wxMpService.oauth2buildAuthorizationUrl(redirectURI, WxConsts.OAuth2Scope.SNSAPI_USERINFO, URLEncoder.encode(returnUrl));
        log.info("result={}", result);
        return "redirect:" + result;
    }

    @RequestMapping("/userinfo")
    public String userInfo(@RequestParam("code") String code, @RequestParam("state") String state) {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = null;

        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        String openId = wxMpOAuth2AccessToken.getOpenId();
        log.info("openId={}",openId);
        return "redirect:"+state+"?openid"+openId;

    }
}
