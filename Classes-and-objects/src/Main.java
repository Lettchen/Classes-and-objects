/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
        пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Student[] st = new Student[10];
        for (int i = 0; i < 10; i++){
            st[i] = new Student();
        }

        st[0].name = "Иванов Василий";
        st[0].grN = 15;
        st[0].achievement = new int [] {5, 6, 5, 4, 6};

        st[1].name = "Петрова Мария";
        st[1].grN = 15;
        st[1].achievement = new int [] {8, 6, 9, 4, 6};

        st[2].name = "Соколов Иннокентий";
        st[2].grN = 15;
        st[2].achievement = new int [] {10, 9, 9, 9, 10};

        st[3].name = " Карасева Алиса";
        st[3].grN = 15;
        st[3].achievement = new int [] {8, 6, 7, 9, 6};

        st[4].name = "Панкова Ирина";
        st[4].grN = 15;
        st[4].achievement = new int [] {5, 6, 5, 4, 6};

        st[5].name = "Самойленко Надежда";
        st[5].grN = 15;
        st[5].achievement = new int [] {9, 10, 10, 10, 10};

        st[6].name = "Марчук Григорий";
        st[6].grN = 15;
        st[6].achievement = new int [] {5, 6, 5, 4, 6};

        st[7].name = "Лорсон Штефан";
        st[7].grN = 15;
        st[7].achievement = new int [] {5, 8, 5, 4, 6};

        st[8].name = "Пупкин Петр";
        st[8].grN = 15;
        st[8].achievement = new int [] {5, 1, 5, 4, 2};

        st[9].name = "Алдохин Денис";
        st[9].grN = 15;
        st[9].achievement = new int [] {5, 6, 5, 4, 6};

        int j;
        for (int i = 0; i < 10; i++){
            for (j = 0; j<5; j++){
                if(st[i].achievement[j] < 9 ){
                    break;
                }

            }
            if(j==5){
                System.out.println("Студент " + st[i].name + " группа " + st[i].grN);
            }

        }



    }
}
