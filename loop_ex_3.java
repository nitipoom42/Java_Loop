
//จงเขียนโปรแกรมรับข้อมูลชื่อสินค้า ราคา Price จำนวน Unit และคำนวนส่วนลด Discount และเงินคงเหลือที่ต้องจ่าย Amount โดยมีเงื่อนไขส่วนลดดังนี้
//เงื่อนไข
// ถ้ายอดซื้อ 1-100 คิดส่วนลด 5% ของรวมเงิน
// ถ้ายอดซื้อ 501-1000 คิดส่วนลด 15% ของรวมเงิน
// ถ้ายอดซื้อ 1001 ขึ้นไป คิดส่วนลด 20% ของรวมเงิน
import java.util.Scanner;

public class loop_ex_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ชื่อสินค้า : ");
        String Name_Product = input.next();
        System.out.print("ราคมสินค้า :");
        Float Price_Product = input.nextFloat();
        System.out.print("จำนวนสินค้า : ");
        int Unit_Product = input.nextInt();
        Float Total_Product = Price_Product * Unit_Product;
        Float Discount = 0.0f;

        if (Unit_Product >= 1 && Unit_Product <= 100) {
            Discount = 0.05f;
        } else if (Unit_Product >= 501 && Unit_Product <= 1000) {
            Discount = 0.15f;
        } else if (Unit_Product >= 1001) {
            Discount = 0.20f;
        } else {
            Discount = 0f;
        }
        System.out.println("--------------");
        System.out.println("ราคารวม : " + Total_Product);
        System.out.println("ได้รับส่วนลด : " + Total_Product * Discount);
        System.out.println("--------------");
        System.out.println("ราคาสุธิ : " + (Total_Product - (Total_Product * Discount)));
    }
}