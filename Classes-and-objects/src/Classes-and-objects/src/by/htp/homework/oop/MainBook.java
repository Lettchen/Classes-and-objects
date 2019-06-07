package by.htp.homework.oop;

public class MainBook {
    public static void main(String[] args) {
        NewBook nb = new NewBook();
        Book buch;
        buch = new Book("Гобсек","Бальзак",1789, "ACT", 35);
        nb.fillBook(0, buch);
        buch = new Book("Отец Горио","Бальзак",1791,"ACT", 150);
        nb.fillBook(1, buch);
        buch = new Book("Токийские легенды","Мураками",2012, "Астрель", 123);
        nb.fillBook(2, buch);
        buch = new Book("Красное и чёрное","Стендаль",1765,"АзбукаКлассика", 240);
        nb.fillBook(3, buch);
        buch = new Book("Монахиня","Дидро",1750,"АзбукаКлассика", 240);
        nb.fillBook(4, buch);
        buch = new Book("Нищета и блеск куртизанок","Бальзак",1790,"АзбукаКлассика", 350);
        nb.fillBook(5, buch);
        buch = new Book("Привидение в кроссовках","Донцова",2006 ,"РОСМЭН", 153);
        nb.fillBook(6, buch);
        buch = new Book("Гарри Поттер","Роулинг",1991, "РОСМЭН", 320);
        nb.fillBook(7, buch);
        buch = new Book("Алхимик с боевым дипломом","Сыромятникова",2012, "РОСМЭН", 450);
        nb.fillBook(8, buch);
        buch = new Book("Новеллы","Моруа",1934, "АСТ", 130);
        nb.fillBook(9, buch);
        nb.sortAuthor();
        nb.sortAfterYear();
        nb.sortPublisher();

    }
}
