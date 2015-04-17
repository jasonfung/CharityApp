package com.ebookfrenzy.charityapp;

public class MyObject {

    public String objectName;
    public String objectBn;

    // constructor for adding sample data
    public MyObject(String objectName){

        this.objectName = objectName;
    }

    public MyObject(String objectBn, String objectName) {
        this.objectBn = objectBn;
        this.objectName = objectName;
    }
}