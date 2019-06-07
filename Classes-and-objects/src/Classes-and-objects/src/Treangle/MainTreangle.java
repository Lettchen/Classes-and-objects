package Treangle;

public class MainTreangle {
    public static void main (String[] args){
        Treangle tre = new Treangle(5, 10, 15, 20, 25, 20);
        System.out.println(tre.Squire());
        System.out.println(tre.perimetr());
        tre.point();
        System.out.println("Координаты медианы " + tre.getX() + " " + tre.getY());


    }
}
