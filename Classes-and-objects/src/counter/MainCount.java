package counter;

public class MainCount {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter(23);
        Counter c3 = new Counter (156);
        c1.incr();
        System.out.println(c1.getCount());
        c1.decr();
        c3.incr();
        System.out.println(c3.getCount());

    }
}
