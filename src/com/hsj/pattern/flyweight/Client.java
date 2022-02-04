package com.hsj.pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        // 创建一个工厂类
        WebsiteFactory factory = new WebsiteFactory();

        // 客户要一个以新闻形式发布的网站
        Website webSite1 = factory.getWebsiteCategory("新闻");


        webSite1.use(new User("tom"));

        // 客户要一个以博客形式发布的网站
        Website webSite2 = factory.getWebsiteCategory("博客");

        webSite2.use(new User("jack"));

        // 客户要一个以博客形式发布的网站
        Website webSite3 = factory.getWebsiteCategory("博客");

        webSite3.use(new User("smith"));

        // 客户要一个以博客形式发布的网站
        Website webSite4 = factory.getWebsiteCategory("博客");

        webSite4.use(new User("king"));

        System.out.println("网站的分类共=" + factory.getWebsiteCount());
    }

}
