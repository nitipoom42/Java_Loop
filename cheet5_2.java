
/*
เขียนโปรแกรมคำนวณราคาแผ่นซีดี โดยถ้าซื้อน้อยกว่า 50 แผ่นละ 10 บาท ถ้ามากกว่านั้นแผ่นละ 7 บาท โดยกำหนดตัวแปรเพื่อความเหมาะสม
*/
import java.util.Scanner;

public class cheet5_2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("จำนวนแผ่น CD");
    int UnitCd = input.nextInt();

    if (UnitCd < 50) {
      System.out.println("จำนวนแผ่นCd " + UnitCd + " แผ่น");
      System.out.println("ราคาทั้งหมด " + (UnitCd * 10) + " บาท");
    } else {
      System.out.println("จำนวนแผ่นCd " + UnitCd + " แผ่น");
      System.out.println("ราคาทั้งหมด " + (UnitCd * 7) + " บาท");
    }
    input.close();
  }
}
