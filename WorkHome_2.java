
/*
เขียนโปรแกรมหาค่าสูงสุด จากตัวเลขที่รับเข้ามา 3 จำนวน
*/
import java.util.Scanner;

public class WorkHome_2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("จำนวนที่ 1");
    int num1 = input.nextInt();

    System.out.println("จำนวนที่ 2");
    int num2 = input.nextInt();

    System.out.println("จำนวนที่ 3");
    int num3 = input.nextInt();
    System.out.println("จำนวนที่ 1 = " + num1);
    System.out.println("จำนวนที่ 2 = " + num2);
    System.out.println("จำนวนที่ 3 = " + num3);

    int total = Math.max(num1, Math.max(num2, num3));
    System.out.println("จำนวนสูงสุด = " + total);
    input.close();
  }
}
