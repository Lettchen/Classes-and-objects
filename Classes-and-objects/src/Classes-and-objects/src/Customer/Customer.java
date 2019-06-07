/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/
package Customer;

public class Customer {
    int id;
    String name;
    String adress;
    String cardN;
    int bankConto;

    public Customer(){
        id =0;
        name="";
        adress="";
        cardN="";
        bankConto= 0;
    }

    public Customer(int id1, String name1, String adress1, String cardN1, int bankConto1){
        id =id1;
        name=name1;
        adress=adress1;
        cardN=cardN1;
        bankConto= bankConto1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCardN(String cardN) {
        this.cardN = cardN;
    }

    public void setBankConto(int bankConto) {
        this.bankConto = bankConto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getCardN() {
        return cardN;
    }

    public int getBankConto() {
        return bankConto;
    }

   public String toString(){
        String str;
        str = Integer.toString(id);
        str += " "+ name;
        str += " " + adress +" ";
        str += cardN;
        str += " ";
        str += Integer.toString(bankConto);
        return str;
    }
}
