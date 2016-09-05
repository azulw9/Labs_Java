package ua.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //-------------task 1.1
        /*int temp = 12*4/3 + 158*2;
        System.out.println(temp);*/
        System.out.println("1.1 -------------------\n result is: " + (12*4/3 + 158*2));

        //-------------task 1.2
        double a = 14;
        //double h = n/20*9+n*(29-n*2+n/3);
        System.out.println("1.2 ------------------ \n result is: " + (a/20*9+a*(29-a*2+a/3)));

        //-------------task 1.3
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("1.3 ------------------ ");
        System.out.println("Введите первое натуральное число:");
        /*int q = Integer.parseInt(br.readLine());
        System.out.println("Введите второе натуральное число:");
        int w = Integer.parseInt(br.readLine());
        System.out.println(q + " / " + w + " = " + q/w + " и " + q%w + " в остатке");*/

        //-------------task 2.1
        /*System.out.println("2.1 ------------------ \nВведите натуральное двузначное число:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Cумма цифр числа "+ n + " равна " + (n/10 + n%10));*/

        //-------------task 2.2
        /*System.out.println("2.2 ------------------ \nВведите натуральное трехзначное число:");
        int n1 = Integer.parseInt(br.readLine());
        //System.out.println(n1/100 +"  " + (n1-(n1/100)*100)/10 + "  " + n1%10);
        System.out.println("Cумма цифр числа "+ n1 + " равна " + (n1/100 + (n1-(n1/100)*100)/10 + n1%10));*/

        //--------------task 2.4
        /*System.out.println("2.4 ------------------ \nВведите вещественное число с ненулевой частью после запятой:");
        double d = Double.parseDouble(br.readLine());
        int res = (int) d;
        double res2 = d - res;
        if (res2 >= 0.5)
        {
            System.out.println("Округляем: " + (res+1));
        }
        else
        {
            System.out.println("Округляем: " + res);
        }*/

        //--------------task 3.1
        /*System.out.println("3.1 ------------------ \nВведите натуральное число:");
        int nn = Integer.parseInt(br.readLine());
        if (nn%2 == 0)
        {
            System.out.println("Число " + nn + " четное");
        }
        else
        {
            System.out.println("Число " + nn + " нечетное");
        }*/

        //---------task 3.2
        /*System.out.println("3.2 ------------------ \nВведите первое вещественное число:");
        double m1 = Double.parseDouble(br.readLine());
        System.out.println("Введите второе вещественное число:");
        double m2 = Double.parseDouble(br.readLine());
        if (Math.abs(m1-10) > Math.abs(m2-10))
        {
            System.out.println(m2);
        }
        else
        {
            System.out.println(m1);
        }*/

        //-----------task 3.3
        System.out.println("3.3 ------------------ \nВведите натуральное трехзначное число:");
        int s = Integer.parseInt(br.readLine());
        if (s/100 > (s-(s/100)*100)/10)
        {
            if (s/100 > s%10)
            {
                System.out.println("В числе " + s + " наибольшая цифра " + (s/100));
            }
            else
            {
                System.out.println("В числе " + s + " наибольшая цифра " + (s%10));
            }
        }
        else
        {
            if ((s-(s/100)*100)/10 > s%10)
            {
                System.out.println("В числе " + s + " наибольшая цифра " + ((s-(s/100)*100)/10));
            }
            else
            {
                System.out.println("В числе " + s + " наибольшая цифра " +  (s%10));
            }
        }
    }
}
