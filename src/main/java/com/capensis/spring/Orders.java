package com.capensis.spring;

/**
 * @author wxg
 * @date 2022/3/7-20:34
 * @quotes 小不忍则乱大谋
 */
public class Orders {
    //属性
    private final String oname;

    private final String address;

    //有参数构造
    public Orders(String oname,String address) {
        this.oname = oname;
        this.address = address;
    }

    public void printBookMessage(){
        System.out.println(oname + "::" + address);
    }
}
