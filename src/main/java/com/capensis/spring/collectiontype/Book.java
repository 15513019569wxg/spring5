package com.capensis.spring.collectiontype;

import java.util.List;

/**
 * @author wxg
 * @date 2022/3/7-23:42
 * @quotes 小不忍则乱大谋
 */
public class Book {
    private List<String> bookList;

    public void setList(List<String> bookList) {
        this.bookList =bookList;
    }

    public void printMessage(){
        System.out.println(bookList);
    }
}
