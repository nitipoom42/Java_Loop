/*
เขียนโปรแกรมรับคะแนนรักศึกษา 1 คนให้แสดงผลเป็นเกรดที่ได้ กำหนดคะแนนดังนี้
คะแนน   เกรด
80-100  A
75-70   B+
70-74   B
65-69   C+
60-64   C
55-59   D+
50-54   D
<50     F
*/

import java.util.Scanner;

public class cheet5_3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("กรุณาใส่คะแนน");
    Byte score = input.nextByte();

    if (score > 100 || score < 0) {
      System.out.println("คะแนนไม่ถูกต้องกรุณาตรวจสอบใหม่อีกครั้ง");
    } else if (score >= 80) {
      System.out.println("ได้ Grade A");
    } else if (score >= 75) {
      System.out.println("ได้ Grade B+");
    } else if (score >= 70) {
      System.out.println("ได้ Grade B+");
    } else if (score >= 65) {
      System.out.println("ได้ Grade C+");
    } else if (score >= 60) {
      System.out.println("ได้ Grade C");
    } else if (score >= 55) {
      System.out.println("ได้ Grade D+");
    } else if (score >= 50) {
      System.out.println("ได้ Grade D");
    } else if (score < 50) {
      System.out.println("ได้ Grade F");
    }
    input.close();
  }
}
