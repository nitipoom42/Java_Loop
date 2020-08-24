
/* 
เขียนโปรแกรมคำนวณราคาซีรอกซ์ ถ้าซีรอกซ์น้อยกว่า 50 แผ่น คิดแผ่นละ 50สตางค์ ตั้งแต่แผ่นที่ 51 เป็นต้นไปคิด 35 สตางค์
*/
import java.util.Scanner;

public class WorkHome_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("จำนวนแผ่น");
    int number = input.nextInt();

    Float price50 = 0.50f;
    Float price35 = 0.35f;

    if (number <= 50) {
      System.out.println("จำนวนแผ่น" + number);
      System.out.println("ราคา " + (number * price50) + " บาท");
    } else {
      System.out.println("จำนวนแผ่น" + number);
      System.out.println("ราคา " + (number * price35) + " บาท");
    }
    input.close();
  }
}
