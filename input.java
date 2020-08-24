import java.util.Scanner; //เพิ่ม Fn พิมพ์โดนใช้ keybrod

public class input {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in); // กำหนดตัวแปรของ keybrod โดยชื่อตัวแปรคือ sn
    System.out.println("Hello"); // ข้อความต้อนรับ
    String name; // กำหนดค้าตัวแปรให้เป็นข้อมูลแบบ String โดยมีชื่อว่า name
    name = sn.next(); // ค่าจากkeybrodมาเก็บไว้ใน name
    System.out.println(name); // แสดงค่าที่ได้รับมาจากkeybrod
    sn.close();
  }
}