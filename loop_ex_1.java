/// Ex_1 ฝากเงิน 50,000 บาท ดอกเบี้ยปีละ 4% รับดอกเปี้ยทุกสิ้นปีโดยไม่ถอนออก สิ้นปีใดจะมีเงิน 100,000 บาท
public class loop_ex_1 {
    public static void main(String[] args) {
        System.out.println("เงินฝาก");

        Float Deposit = 50000f;

        int Year = 0;

        while (Deposit <= 100000) {
            System.out.println("เงินฝากปีที่ " + Year + "\nจำนวนเงิน " + Deposit + " บาท");
            Float Calculate = Deposit * 0.04f;
            Deposit = Deposit + Calculate;
            Year++;
        }
        System.out.println("---------------------");
        System.out.println("ปีที่ " + Year + " จะมีเงินมากกว่า 100,000 บาท");
    }
}