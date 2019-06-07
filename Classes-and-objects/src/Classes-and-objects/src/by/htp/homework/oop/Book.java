/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

package by.htp.homework.oop;

import javax.security.sasl.AuthorizeCallback;

public class Book {
    String name;
    String author;
    int year;
    String publisher;
    int page;

    public Book(String name, String author, int year, String publisher, int page){
        this.name=name;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.page=page;
    }

    public Book(){ //конструктор созданный для конструктора NewBook
        name="";
        author="";
        year=0;
        publisher="";
        page=0;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    public void setPage(int page){
        this.page=page;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getPage(){
        return page;
    }

    public String toString(){
        String str= name + " " + author + " " + Integer.toString(year)+ " " + publisher + " " + Integer.toString(page);
        return str;
    }

}
