package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups ="student")
public class GroupsOnClass1 {


    public void stu1(){
        System.out.println("GroupsOnClass111111中的stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass111111中的stu2运行");
    }
}
