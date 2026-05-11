package org.example;

import static Main.*;
public class StudentQuery {
    public static void queryStudent() {
        System.out.println("1. 按学号查询 2. 按姓名查询");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("请输入学号：");
            String id = sc.next();
            for (Student s : studentList) {
                if (s.getId().equals(id)) {
                    System.out.println("找到："+s.getName()+" "+s.getAge()+"岁 "+s.getGender());
                    return;
                }
            }
            System.out.println("未找到！");
        } else if (c == 2) {
            System.out.print("请输入姓名：");
            String name = sc.next();
            boolean flag = false;
            for (Student s : studentList) {
                if (s.getName().equals(name)) {
                    System.out.println("学号："+s.getId()+" 姓名："+s.getName());
                    flag = true;
                }
            }
            if (!flag) System.out.println("未找到！");
        }
    }
}