// จงเขียนโปรแกรมขายสินค้า และคิดเงินทอน โดยรับจำนวนชิ้น ราคาสินค้าแต่ละชิ้น และเงินจากผู้ซื้อพร้อมคำนวนเงินทอนและแสดงเงินทอนเป็น ธนบัตรและเหรียญ เช่น 
// 500, 100, 50, 20, 10, 5, และ 1 บาท เป็นจำนวนกีรายการ

import java.util.Scanner;

public class loop_ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("จำนวนชิ้น");
        int unit_product = input.nextInt();
        int Total = 0;
        for (int i = 1; i <= unit_product; i++) {

            System.out.print("สินค้าชิ้นที่ " + i + "ราคา");
            int price_product = input.nextInt();
            Total = Total + price_product;
        }
        System.out.println(Total);
        System.out.println("รับเงินจากลูกค้า");
        int money = input.nextInt();

        int change = money - Total;
        int change_Total = money - Total;
        int bank500 = 0;
        int bank100 = 0;
        int bank50 = 0;
        int bank20 = 0;
        int bank10 = 0;
        int bank5 = 0;
        int bank1 = 0;
        while (change != 0) {
            if (change >= 500) {
                bank500++;
                change = change - 500;
            } else if (change >= 100) {
                bank100++;
                change = change - 100;
            } else if (change >= 50) {
                bank50++;
                change = change - 50;
            } else if (change >= 20) {
                bank20++;
                change = change - 20;
            } else if (change >= 10) {
                bank10++;
                change = change - 10;
            } else if (change >= 5) {
                bank5++;
                change = change - 5;
            } else {
                bank1++;
                change = change - 1;
            }

        }
        System.out.println("เงินทอน " + change_Total);
        if (bank500 != 0) {
            System.out.println("แบงค์500 " + bank500 + " ใบ");
        }
        if (bank100 != 0) {
            System.out.println("แบงค์100 " + bank100 + " ใบ");
        }
        if (bank50 != 0) {
            System.out.println("แบงค์50 " + bank50 + " ใบ");
        }
        if (bank20 != 0) {
            System.out.println("แบงค์20 " + bank20 + " ใบ");
        }
        if (bank10 != 0) {
            System.out.println("เหรียญ10 " + bank10 + " เหรียญ");
        }
        if (bank5 != 0) {
            System.out.println("เหรียญ5 " + bank5 + " เหรียญ");
        }
        if (bank1 != 0) {
            System.out.println("เหรียญบาท " + bank1 + " เหรียญ");
        }
        input.close();
    }

}
