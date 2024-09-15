package Singleton;

import java.util.ArrayList;

public enum EnumSingleton {

    INSTANCE("mathematical","chemistry","physics"); //Name of the single instance
    //enum has a single instance named INSTANCE. This is a common pattern for implementing the Singleton design pattern in Java.

    private String course1;
    private String course2;
    private String course3;

    private EnumSingleton(String course1,String course2,String course3) {
        this.course1 =course1;
        this.course2=course2;
        this.course3=course3;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getCourse3() {
        return course3;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    //getters and setters


}