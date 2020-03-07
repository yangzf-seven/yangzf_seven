package com.yangzf.adapter;

/**
 * @author Seven
 * @date 2020/3/5 - 16:32
 */
//客户端电脑类:要上网 但是不能直接插上网线
public class Computer {

    //需要链接上我们的转接器才可以进行上网
    public void net(NetToUsb netToUsb){

        //上网的具体实现 ,需要找一个转接器
        netToUsb.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();//电脑
        Line line = new Line();//网线
        Adapter2 adapter = new Adapter2(line);//转接器

        computer.net(adapter);
    }
}
