package com.wechat.springbootwechat.openid;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wechat.springbootwechat.common.HttpUtil;
import com.wechat.springbootwechat.common.RequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

/**
 * @Description: 使用wechatApi获取openid（手动获取）
 * @Author: zhangqiang
 * @CreateDate: 2019/1/4 11:25
 * @Version: 1.0
 * 连接地地址
 * https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx50c651ace3e7e64c&redirect_uri=http://www.yueyenongye.com/wechat/auth&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect
 * 将地址发送到微信在微信中访问
 */
/*
@Slf4j
@Controller
@RequestMapping("wechat")
public class Api2Openid {
    @RequestMapping("/auth")
    public String wechatAuth(@RequestParam("code") String code) throws UnsupportedEncodingException {
        log.info("code={}", code);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx50c651ace3e7e64c&secret=07bf8e625cfa9f081e66c847059210b8&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        JSONObject jsonObject = JSON.parseObject(response);
        String REFRESH_TOKEN = jsonObject.getString("refresh_token");
        String userInfo = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=wx50c651ace3e7e64c&grant_type=refresh_token&refresh_token=" + REFRESH_TOKEN;
        String response2 = restTemplate.getForObject(userInfo, String.class);
        JSONObject jsonObject2 = JSON.parseObject(response2);
        String OPENID=jsonObject.getString("openid");
        String ACCESS_TOKEN=jsonObject.getString("access_token");
        String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo?access_token="+ACCESS_TOKEN+"&openid="+OPENID+"&lang=zh_CN";
        String response4=HttpUtil.getHttp(userInfoUrl);
        String json4 = new String(response4.getBytes("ISO-8859-1"), "UTF-8");
        JSONObject response3= RequestUtil.httpsRequest(userInfoUrl,"GET",null);
        log.info("response={}", response);
        log.info("response2={}", response2);
        log.info("response3={}", response3);

        log.info("json4={}", response4);
        return code;

    }

}
*/
