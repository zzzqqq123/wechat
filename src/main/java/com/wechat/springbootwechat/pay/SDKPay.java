package com.wechat.springbootwechat.pay;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 使用sdk进行微信支付
 * @Author: zhangqiang
 * @CreateDate: 2019/1/5 9:32
 * @Version: 1.0
 */
@Controller
@RequestMapping("pay")
public class SDKPay {
    @Autowired
    private PayService payService;
    @RequestMapping("/create")
    public String pay(Model model){
        PayResponse payResponse = payService.create();
        Map map=new HashMap();
        map.put("payResponse",payResponse);
        model.addAttribute("payResponse",payResponse);
        return "pay/create";


    }
}
