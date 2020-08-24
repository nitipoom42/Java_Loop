
// ให้หาผลรวมของตัวเลข 5 จำนวน ที่อยู่ระหว่าง 100-500 ถ้าไม่อยู่ในช่วงดังกล่าวมให้แสดงข้อความว่าตัวเลขไม่อยู่ในช่วงที่กำหนด และกลับไปรับตัวเลขใหม่
import java.util.Scanner;

public class loop_ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int Total = 0;
        while (i <= 5) {
            System.out.print("ตัวเลขที่" + i + ":");
            int number = input.nextInt();
            if (number >= 100 && number <= 500) {
                Total = Total + number;
                i++;
            } else {
                System.out.println("ตัวเลขไม่อยู่ในช่วงที่กำหนด");
            }

        }
        System.out.println("ผลรวม" + Total);
    }
}