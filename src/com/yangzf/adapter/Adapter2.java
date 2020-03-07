package com.yangzf.adapter;

/**
 * @author Seven
 * @date 2020/3/5 - 16:30
 */
//适配器类   链接电脑端的usb和网线

public class Adapter2 implements NetToUsb{//组合 的方式
    //网线私有化
    private Line line;

    //通过构造器实现功能
    public Adapter2(Line line) {
        this.line = line;
    }

    @Override
    public void handleRequest() {
        line.request();//这样就能上网了
    }

}
