/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.*/

public class Test1 {

    public static void main(String[] args) {
        int x;
        int y;
        printX(5);
        printY(8);
        change(x=15, y=20);
        sum(x=135, y=1231);
        max(x=123, y = 145);
    }

    private static void sum(int x, int y) {
        Object s = x + y;
        System.out.println(s);
    }

    public static void printX(int x){
        System.out.println("x= "+ x);
    }
    public static void printY(int y){
        System.out.println("y= "+ y);
    }
    public static void change(int x, int y){
        System.out.println("x= "+ x + ", y= "+ y);

    }


    public static void max(int x, int y){
        if(x>y) System.out.println(x);
        else if (x == y) System.out.println("Переменные равны");
        else System.out.println(y);
    }


}

