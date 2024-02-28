/* Câu hỏi ---------------------------------------------------------------------------------------
  Tạo một lớp 'Calculator' bao gồm các phương thức cho phép cộng và trừ.
  Các phương thức phải được đặt tên là 'add' và 'subtract', và mỗi phương thức nhận hai tham số kiểu số nguyên.
  Khởi tạo một đối tượng Calculator trong phương thức chính và sử dụng nó để thực hiện các phép toán sau đây: 
  - Cộng 10 và 5
  - Trừ 5 từ 10
  Truy xuất kết quả của các phép toán này.
 
  Kết quả mong đợi: Vui lòng điền giá trị thích hợp tại vị trí {value} và không truy xuất dấu ngoặc ({}).
  Addition Result: {value}
  Subtraction Result: {value}
=================================================================================================*/
 
public class App {
    public static void main(String[] args) {
      // Khởi tạo một đối tượng 'Calculator'
    Calculator calculator = new Calculator();
      // Thực hiện phép cộng 10 và 5 và lưu kết quả
   int cong = calculator.add(10, 5);
      // Thực hiện phép trừ 5 từ 10 và lưu kết quả
   int tru = calculator.subtract(10, 5);
      // Truy xuất kết quả của các phép toán
   System.out.println("Addition Result:"+cong);
   System.out.println("Subtraction Result:"+tru);
    }
  }
   
  class Calculator {
    // Phương thức cộng
      public int add(int a, int b){
          return a+b;
      }
    // Phương thức trừ
      public int subtract(int a, int b){
          return a-b;
      }
  }