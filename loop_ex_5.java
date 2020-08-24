import java.time.Year;

//เงินฝาก 50,000 บาท ดอกเบี้ยปีละ 4% รับดอกเบี้ยทุกสิ้นปีโดยไม่ถอนออกสิ้นปีที่ 10 จะมีเงินรวมเท่ามใด
public class loop_ex_5 {
    public static void main(String[] args) {
        float Deposit = 50000f;

        int Year = 0;
        while (Year != 10) {
            float Interest = Deposit * 0.04f;
            Deposit = Deposit + Interest;
            Year++;

        }
        System.out.println("ปีที่ " + Year + "จะมีเงิน " + Deposit);
    }
}