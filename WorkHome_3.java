
/* 
เขียนโปรแกรมแสดงเลขหนังสือที่อยู่ของหนังสือในห้องสมุด เมื้อกำหนดชั้น ดังนี้
เลขหนังสือ                        ชั้น
100-200 และตั้งแต่ 900 เป็นตั้นไป       3
201-300 และ451-500              4
301-450 และ 600-700             5
501-599 และ 701-799             1
801-899                         2

*/
import java.util.Scanner;

public class WorkHome_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("เลขที่หนังสือ");
        int numberbook = input.nextInt();
        System.out.println("เลขที่หนังสือ " + numberbook);

        if (numberbook >= 100 && numberbook <= 200 || numberbook >= 900) {
            System.out.println("อยู่ชั้นที่ 3"); // ตั้งแต่เลขหนังสือ 100-200 และตั้งแต่ 900 เป็นตั้นไป ชั้น 3
        } else if (numberbook >= 201 && numberbook <= 300 || (numberbook >= 451 && numberbook <= 500)) {
            System.out.println("อยู่ชั้นที่ 4"); // ตั้งแต่เลขหนังสือ 201-300 และ451-500 ชั้น 4
        } else if (numberbook >= 301 && numberbook <= 450 || (numberbook >= 600 && numberbook <= 700)) {
            System.out.println("อยู่ชั้นที่ 5"); // ตั้งแต่เลขหนังสือ301-450 และ 600-700 ชั้น5
        } else if (numberbook >= 501 && numberbook <= 599 || (numberbook >= 701 && numberbook <= 799)) {
            System.out.println("อยู่ชั้นที่ 1"); // ตั้งแต่เลขหนังสือ501-599 และ 701-799 ชั้น1
        } else if (numberbook >= 801 && numberbook <= 899) {
            System.out.println("อยู่ชั้นที่ 2"); // ตั้งแต่เลขหนังสือ801-899 ชั้น 2
        } else {
            System.out.println("เลขหนังสือไม่ถุกต้อง");
        }
        input.close();
    }
}
