/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/
package counter;

public class Counter {
    int max = 148;
    int min = 1;
    int count;

    public Counter(){
        count = 15;
    }

    public Counter(int cnt){
        count = cnt;
        if(count>max){
            count = max;
        }
        else if(count< min){
            count = min;
        }
    }

    public void incr(){
        if(count <max ){
            count++;
        }
    }

    public void decr (){
        if(count> min){
            count--;
        }
    }

    public int getCount(){
        return count;
    }

}
