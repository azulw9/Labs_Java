package ua.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException
    {
        boolean check = false;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //-------------task 1.1
        System.out.println("1.1 -------------------\n result is: " + (12*4/3 + 158*2));

        //-------------task 1.2
        double a = 14;
        System.out.println("1.2 ------------------ \n result is: " + (a/20*9+a*(29-a*2+a/3)));

        //-------------task 1.3
        check = false;
        while (check == false)
        {
            try {
                System.out.println("1.3 ------------------ \nВведите первое натуральное число:");
                int q = Integer.parseInt(br.readLine());
                System.out.println("Введите второе натуральное число(не 0)!:");
                int w = Integer.parseInt(br.readLine());
                System.out.println(q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");
                check = true;
            } catch (NumberFormatException new_exc) {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
            catch (ArithmeticException r)
            {
                System.out.println(ANSI_RED + "division by zero!!! Try again! " + ANSI_RESET);
            }
        }

        //-------------task 2.1 and 2.3 the same
        check=false;
        while (check == false)
        {
            try {
                System.out.println("2.1 ------------------ \nВведите натуральное двузначное число:");
                int n = Integer.parseInt(br.readLine());
                if ((n/100 != 0) || (n/10 == 0))
                {
                    throw new NumberFormatException();
                }
                System.out.println("Cумма цифр числа " + n + " равна " + (n / 10 + n % 10));
                check = true;
            } catch (NumberFormatException new_exc) {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }

        //-------------task 2.2
        int n1;
        check = false;
        while (check == false) {
            try {
                System.out.println("2.2 ------------------ \nВведите натуральное трехзначное число:");
                n1 = Integer.parseInt(br.readLine());
                if ((n1/1000 != 0) || (n1/100 == 0))
                {
                    throw new NumberFormatException();
                }
                System.out.println("Cумма цифр числа " + n1 + " равна " + (n1 / 100 + (n1 - (n1 / 100) * 100) / 10 + n1 % 10));
                check = true;
            } catch (NumberFormatException new_exc)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }

        //--------------task 2.4 and 2.5 the same
         double d, res2;
         int res;
         check = false;
        while (check==false)
        {
            try
            {
                System.out.println("2.4 ------------------ \nВведите вещественное число с ненулевой частью после запятой:");
                d = Double.parseDouble(br.readLine());
                res = (int) d;
                res2 = d - res;
                if (res2 == 0)
                {
                    throw new NumberFormatException();
                }
                if (res2 >= 0.5)
                {
                    System.out.println("Округляем: " + (res+1));
                    check = true;
                }
                else
                {
                    System.out.println("Округляем: " + res);
                    check = true;
                }
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }


        //--------------task 3.1
        check = false;
        int nn;
        while (check == false)
        {
            try
            {
                System.out.println("3.1 ------------------ \nВведите натуральное число:");
                nn = Integer.parseInt(br.readLine());
                if (nn%2 == 0)
                {
                    System.out.println("Число " + nn + " четное");
                    check = true;
                }
                else
                {
                    System.out.println("Число " + nn + " нечетное");
                    check = true;
                }

                }
            catch (NumberFormatException ex)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }

        //---------task 3.2
        check = false;
        while (check == false)
        {
            try
            {
                System.out.println("3.2 ------------------ \nВведите первое вещественное число:");
                double m1 = Double.parseDouble(br.readLine());
                System.out.println("Введите второе вещественное число:");
                double m2 = Double.parseDouble(br.readLine());
                if (Math.abs(m1-10) > Math.abs(m2-10))
                {
                    System.out.println("Число " + m2 + " ближе к 10");
                    check = true;
                }
                else
                {
                    System.out.println("Число " + m1 + " ближе к 10");
                    check = true;
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }


        //-----------task 3.3
        check = false;
        while (check==false)
        {
            try
            {
                System.out.println("3.3 ------------------ \nВведите натуральное трехзначное число:");
                int s = Integer.parseInt(br.readLine());
                if ((s/1000 != 0) || (s/100 == 0))
                {
                    throw new NumberFormatException();
                }
                if (s/100 > (s-(s/100)*100)/10)
                {
                    if (s/100 > s%10)
                    {
                        System.out.println("В числе " + s + " наибольшая цифра " + (s/100));
                        check = true;
                    }
                    else
                    {
                        System.out.println("В числе " + s + " наибольшая цифра " + (s%10));
                        check = true;
                    }
                }
                else
                {
                    if ((s-(s/100)*100)/10 > s%10)
                    {
                        System.out.println("В числе " + s + " наибольшая цифра " + ((s-(s/100)*100)/10));
                        check = true;
                    }
                    else
                    {
                        System.out.println("В числе " + s + " наибольшая цифра " +  (s%10));
                        check = true;
                    }
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }

        //---------task 3.4
        check = false;
        while (check == false)
        {
            try
            {
                System.out.println("3.4 ------------------ \nВведите целое число из интервала [5;155]:");
                int z = Integer.parseInt(br.readLine());
                if ((z < 5) || (z> 155))
                {
                    System.out.println("Please type the number from the interval: [5;155]");
                    throw new NumberFormatException();
                }
                if ((z > 25) && (z < 100))
                {
                    System.out.println("Число " + z + " содержится в интервале (25,100)");
                    check = true;
                }
                else
                {
                    System.out.println("Число " + z + " не содержится в интервале (25,100)");
                    check = true;
                }

            }
            catch (NumberFormatException ex)
            {
                System.out.println(ANSI_RED + "Wrong input format! Try again!" + ANSI_RESET);
            }
        }

       // ------------ task 3.5
       System.out.println("\n3.5 ------------------");
        int e = 5, b = 7, c = -9;
        System.out.println("Числа в переменных a, b, c: " + e + " " + b + " " + c);
        if ((e>b) && (e>c))
        {
            if (b>c)
            {
                System.out.println("Возрастающая последовательность: " + c + " " + b + " " + e);
            }
            else
            {
                System.out.println("Возрастающая последовательность: " + b + " " + c + " " + e);
            }
        }
        else if ((b>e) && (b>c))
        {
            if (e>c)
            {
                System.out.println("Возрастающая последовательность: " + c + " " + e + " " + b);
            }
            else
            {
                System.out.println("Возрастающая последовательность: " + e + " " + c + " " + b);
            }
        }
        else
        {
            if (b>e)
            {
                System.out.println("Возрастающая последовательность: " + e + " " + b + " " + c);
            }
            else
            {
                System.out.println("Возрастающая последовательность: " + b + " " + e + " " + c);
            }
        }

        //---------------task 3.6
        System.out.println("\n3.6 ------------------");
        Random generator = new Random();
        int rand_int = generator.nextInt(28800) + 1;
        System.out.println(rand_int);
        int hours = rand_int/3600;
        switch(hours)
        {
            case 8:
            case 7:
            case 6:
            case 5:
                System.out.println("До конца рабочего дня осталось " + hours + " часов:-)");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("До конца рабочего дня осталось " + hours + " часa:-)");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + hours + " час:-)");
                break;
            case 0:
                System.out.println("До конца рабочего дня осталось менее часа:-)");
                break;
        }
    }
}
