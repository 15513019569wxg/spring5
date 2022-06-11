package com.capensis.spring;

/**
 * @author wxg
 * @date 2022/3/7-19:31
 * @quotes 小不忍则乱大谋
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printBookMessage(){
        System.out.println(bname + "::" + bauthor + "::" + address);
    }


}
