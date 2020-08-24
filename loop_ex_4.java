
//จงเขียนโปรแกรมรับข้อมูล ชื่อพนักงาน name  เงินเดือน salary แล้วคำนวน ภาษีหัก ณ ที่จ่าย Tax 5% ของเงินเดือนพร้อมคำนวนเงินรายได้ ของพนักงาน 10 คน
import java.util.Scanner;

public class loop_ex_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Staff : " + i);
            System.out.print("Enter Name : ");
            String name_Staff = input.next();
            System.out.print("Enter Salary : ");
            float Salary_Staff = input.nextFloat();
            float Tax = 0.05f;
            System.out.println("Tax is : " + (Salary_Staff * Tax));
            float Total = Salary_Staff - (Salary_Staff * Tax);
            System.out.println("Total " + Total);
            System.out.println("------------");

        }
    }
}