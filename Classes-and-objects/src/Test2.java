/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
*/
public class Test2 {
    private static int x;
    private static int y;
    public static void main(String[] args){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        System.out.println(Test2.getX());
        System.out.println(Test2.getY());
    }
    public Test2(){
        x=15;
        y=20;
    }
    public void setX(){
        this.x=x;
    }
    public static int getX(){
        x=x;
        return x;
    }
    public void setY(){
        this.y=y;
    }
    public static int getY(){
        y=y;
        return y;
    }
}
