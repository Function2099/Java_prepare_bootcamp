package 階段專案二;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入第一個數字：");
        double num1 = scanner.nextDouble();

        System.out.print("請輸入第二個數字：");
        double num2 = scanner.nextDouble();

        System.out.print("請輸入運算符號 (+, -, *, /)：");
        String op = scanner.next();

        double result;

        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        }else if (op.equals("*")) {
            result = num1 * num2;
        }else if (op.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("不支援的運算符號");
            scanner.close();
            return;
        }

        System.out.println("結果是：" + result);
        
        scanner.close();

    }
}
