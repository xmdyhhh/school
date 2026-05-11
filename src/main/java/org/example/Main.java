import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("====== 学生信息管理系统 ======");
            System.out.println("1. 添加学生");
            System.out.println("2. 查询学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 删除学生");
            System.out.println("5. 显示所有学生");
            System.out.println("0. 退出系统");
            System.out.print("请输入操作序号：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: StudentAdd.addStudent(); break;
                case 2: StudentQuery.queryStudent(); break;
                case 3: StudentUpdate.updateStudent(); break;
                case 4: StudentDelete.deleteStudent(); break;
                case 5: StudentAdd.showAll(); break;
                case 0: System.out.println("退出成功！"); return;
                default: System.out.println("输入错误！");
            }
        }
    }
}