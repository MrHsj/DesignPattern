package com.hsj.principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {

    }

}

// 接口1
interface Interface1 {
    void operation1();

}

// 接口2
interface Interface2 {
    void operation2();

    void operation3();
}

// 接口3
interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

}

class D implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

/**
 * A类通过接口Interface1,Interface2 依赖(使用) B类，但是只会用到1,2,3方法
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

/**
 * C类通过接口Interface1,Interface3 依赖(使用) D类，但是只会用到1,4,5方法
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}