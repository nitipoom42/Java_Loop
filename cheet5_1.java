
/* เขียนคำสั่งแสดงราคาที่ต้องจ่ายค่าสินค้าเมื้อซื้อสินค้่า 1 ชิ้น โดยกำหนกเงื่อนไขราคาตั้งแต่ 2000 ขึ้นไป
ลด 15 % โดยกำหนดตัวแปรเพื่อความเหมาะสม
*/
import java.util.Scanner;

public class cheet5_1 {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    System.out.print("ราคาสินค้า");
    final float price = input.nextFloat();

    final float discount = price * 15 / 100;

    if (price >= 2000) {
      System.out.println("ส่วนลด " + discount + " ");
      System.out.println("ราคาสุธิ =" + (price - discount));
    } else {
      System.out.println("ไม่ได้รับส่วนลด");
    }
    input.close();
  }
}
