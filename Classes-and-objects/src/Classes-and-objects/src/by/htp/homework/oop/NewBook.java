package by.htp.homework.oop;

import java.util.Scanner;

public class NewBook {
    Book [] bk = new Book[10]; //создали массив объектов Book

    public NewBook(){ //заполняем массив объектами
        for (int i=0; i<bk.length; i++){
            bk[i]= new Book();
        }
    }

    public NewBook(Book buch){//задаём значения каждому объекту
        for(int i=0; i<bk.length;i++){
            bk[i]= new Book(buch.getName(), buch.getAuthor(), buch.getYear(), buch.getPublisher(), buch.getPage());
        }
    }

    public void fillBook(int i, Book buch){
        if(i<0 || i>=10){
            return;
        }
        bk[i]= new Book(buch.getName(), buch.getAuthor(), buch.getYear(), buch.getPublisher(), buch.getPage());
    }

    public String toString(int i){//стринг, тянущий значение массива
        return bk[i].toString();
    }

    public void sortAuthor(){ //вывод книг по автору
        Book buch;
        System.out.println("Введите автора");
        Scanner scanner = new Scanner(System.in);
        String auth = scanner.next();
        for(int i=0; i<bk.length;i++){
            if (auth.compareTo(bk[i].author) == 0){
                System.out.println(bk[i]);
            }
        }
    }

    public void sortAfterYear(){ //сортировка по году
        Book buch;
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int ye = scanner.nextInt();
        for(int i=0; i<bk.length;i++){
            if(ye<bk[i].year){
                System.out.println(bk[i]);
            }
        }
    }

    public void sortPublisher(){ //сортировка по издательсту
        Book buch;
        System.out.println("Введите издательство");
        Scanner scanner = new Scanner(System.in);
        String publ = scanner.next();
        for(int i=0; i<bk.length;i++){
            if(publ.compareTo(bk[i].publisher) == 0){
                System.out.println(bk[i]);
            }
        }
    }





}
