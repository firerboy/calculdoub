import java.util.Scanner;

public class Calculated
{
    public static void main(String args[])
    {
        int flag=0,ch;
        double num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Калькулятор");
        do
        {
            System.out.println("Меню опций");
            System.out.println("");
            System.out.println("1) Сумма");
            System.out.println("2) Вычитание");
            System.out.println("3) Умножение");
            System.out.println("4) Деление");
            System.out.println("5) Выход из системы");
            System.out.print("Выберите вариант: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Сумма");
                        System.out.println("Введите два числа");
                        System.out.print("Введите число 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Введите число 2: ");
                        num2 = reader.nextDouble();
                        System.out.println(num1+num2);
                        break;
                    case 2:
                        System.out.println("Вычитание");
                        System.out.println("Введите два числа");
                        System.out.print("Введите число 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Введите число 2: ");
                        num2 = reader.nextDouble();
                        System.out.println(num1-num2);
                        break;
                    case 3:
                        System.out.println("Умножение");
                        System.out.println("Введите два числа");
                        System.out.print("Введите число 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Введите число 2: ");
                        num2 = reader.nextDouble();
                        System.out.println(num1*num2);
                        break;
                    case 4:
                        System.out.println("Деление");
                        System.out.println("Введите два числа");
                        System.out.print("Введите число 1: ");
                        num1 = reader.nextDouble();
                        System.out.print("Введите число 2: ");
                        num2 = reader.nextDouble();
                        System.out.println(num1/num2);
                        break;
                    default: System.out.println("Выход из программы из-за неверного ввода\n");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
}