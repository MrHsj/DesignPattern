package com.hsj.pattern.flyweight;

// 具体网站
public class ConcreteWebsite extends Website {

    // 共享的部分，内部状态
    // 网站发布的形式(类型)
    private String type = "";


    // 构造器
    public ConcreteWebsite(String type) {

        this.type = type;
    }


    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}

