package org.example;

// Student.java
public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Student() {}
    public Student(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}

// StudentAdd.java
import static Main.*;
public class StudentAdd {
    public static void addStudent() {
        System.out.print("请输入学号：");
        String id = sc.next();
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                System.out.println("学号已存在！");
                return;
            }
        }
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("请输入性别：");
        String gender = sc.next();
        studentList.add(new Student(id, name, age, gender));
        System.out.println("添加成功！");
    }

    public static void showAll() {
        if (studentList.isEmpty()) {
            System.out.println("暂无学生信息！");
            return;
        }
        System.out.println("====== 学生列表 ======");
        for (Student s : studentList) {
            System.out.println("学号："+s.getId()+" 姓名："+s.getName()+" 年龄："+s.getAge()+" 性别："+s.getGender());
        }
    }
}