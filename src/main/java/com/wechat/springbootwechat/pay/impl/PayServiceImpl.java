package com.wechat.springbootwechat.pay.impl;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.wechat.springbootwechat.pay.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: zhangqiang
 * @CreateDate: 2019/1/5 10:27
 * @Version: 1.0
 */
@Service
@Slf4j
public class PayServiceImpl implements PayService {
    private String openId="oaSNt1fRI-SDlcovHXvbfZy5-HNo";
    private String orderId="wtsud737";
    private Double orderAmount=0.01;
    private String orderName="订单名称";
    @Autowired
    private BestPayServiceImpl bestPayService;

    @Override
    public PayResponse create() {
        PayRequest payRequest = new PayRequest();
        //WXPAY_H5("wxpay_h5", "微信公众账号支付")
        payRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_H5);
        payRequest.setOrderId(orderId);
        payRequest.setOrderAmount(orderAmount);
        payRequest.setOrderName(orderName);
        payRequest.setOpenid(openId);
        PayResponse payResponse=bestPayService.pay(payRequest);
        log.info("payResponse={}",payResponse);
        return payResponse;
    }
}
