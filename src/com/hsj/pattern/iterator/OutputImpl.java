package com.hsj.pattern.iterator;

import java.util.Iterator;
import java.util.List;

// 输出类
public class OutputImpl {

    // 学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {

        // 从collegeList 取出所有学院, Java 中的 List 已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            // 得到对应迭代器
            printDepartment(college.createIterator());
        }
    }

    // 学院输出系
    public void printDepartment(Iterator iterator) {
        while(iterator.hasNext()) {
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }

}