package com.example.taskone;

public class DataTypes {
    public static  void main(String[] args){
        double result = pointOne();
        System.out.println("Пункт 1 - "+result);

        pointTwo();

        pointThree();
    }

    /**
    * Сумма трёх значений int, double, char
    * @return возвращает значение типа double
    * */
    private static double pointOne(){
        int a = 5;
        double b = 4;
        char c = 'c';
        return a + b + c;
    }

    /**
     * Проверка двух переменных
     * */
    private static void pointTwo(){
        byte a = 5;
        byte b = 12;
        boolean check = a == b;
        System.out.println("Пункт 2 - "+check);
    }


    /**
     * Последовательность операций переменной
     * */
    private static void pointThree(){
        byte a = 6;
        a+=6;
        a-=2;
        a/=5;
        a*=7;
        System.out.println("Пункт 3 - "+a);
    }
}
