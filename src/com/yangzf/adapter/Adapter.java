package com.yangzf.adapter;

/**
 * @author Seven
 * @date 2020/3/5 - 16:30
 */
//适配器类   链接电脑端的usb和网线
public class Adapter extends Line implements NetToUsb{//继承的方式

    @Override
    public void handleRequest() {
        super.request();//这样就能上网了
    }

}
