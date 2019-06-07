package Customer;

public class MainCustomer {
    public static void main(String[] args) {
        SecCust s = new SecCust();
        Customer c;
        c=new Customer(12145, "Фролов Павел Григорьевич", "Минск, Киселева 15", "3535 1452 2354 1234", 4356);
        s.fillCust(0, c);
        c=new Customer(12876, "Иванов Василий Иванович", "Минск, Кирова 20", "1234 5678 9013 3456", 4324);
        s.fillCust(1, c);
        c=new Customer(19837, "Петрова Мария Осиповна", "Минск, Варвашени 44", "0987 6543 0987 1234", 1265);
        s.fillCust(2, c);
        s.sortName();
        for(int i=0; i<3; i++){
            c = s.getCustomer(i);
            if (c.getId() >= 12200 && c.getId() <= 15000) {
                System.out.println(c.toString());
            }
        }
    }
}
