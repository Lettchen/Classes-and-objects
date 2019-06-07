package Customer;

public class SecCust {
    Customer[] cust = new Customer[3];

    public SecCust() {
        for (int i = 0; i < 3; i++) {
            cust[i] = new Customer();
        }

    }

    public SecCust(Customer c) {
        for (int i = 0; i < 3; i++) {
            cust[i] = new Customer(c.getId(), c.getName(), c.getAdress(), c.getCardN(), c.getBankConto());
        }
    }

    public void fillCust(int i, Customer c){
        if(i<0 || i>=3){
            return;
        }
        cust[i] = new Customer(c.getId(), c.getName(), c.getAdress(), c.getCardN(), c.getBankConto());
    }
    public String toString(int i){
        return cust[i].toString();
    }

    public void sortName(){
        Customer c;
        for (int i = cust.length - 1; i > 0; i--){
            for (int j = i; j < cust.length; j++){
                if ( cust[j-1].name.compareTo(cust[j].name) > 0 ) {
                    c = cust[j-1];
                    cust[j-1] = cust[j];
                    cust[j] = c;
                } else break;
            }
        }
    }

    public Customer getCustomer(int i){
        if(i<0 || i>=3){
            return null;
        }
        return cust[i];
    }

}
