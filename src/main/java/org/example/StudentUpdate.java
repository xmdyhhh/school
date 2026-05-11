import static Main.*;
public class StudentUpdate {
    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的学生学号：");
        String id = sc.next();
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                System.out.print("新姓名：");
                s.setName(sc.next());
                System.out.print("新年龄：");
                s.setAge(sc.nextInt());
                System.out.print("新性别：");
                s.setGender(sc.next());
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("学号不存在！");
    }
}
