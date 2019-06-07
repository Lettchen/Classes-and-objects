package Train;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;

public class MainTrain {
    public static void main(String[] args){
        Train[] tr = new Train[5];
        Train ctr = new Train(); //переменная для хранения текущего поезда
        Scanner scanner = new Scanner(System.in);
        int userTrainN;
        DateFormat tm = new SimpleDateFormat("HH:mm");
        for (int i = 0; i < 5; i++){
            tr[i] = new Train();
        }
        try{
            tr[0].destination ="Минск";
            tr[0].trainN = 25;
            tr[0].schedule = tm.parse("15:45");

            tr[1].destination ="Брест";
            tr[1].trainN = 38;
            tr[1].schedule = tm.parse("11:30");

            tr[2].destination ="Барановичи";
            tr[2].trainN = 17;
            tr[2].schedule = tm.parse("22:25");

            tr[3].destination ="Минск";
            tr[3].trainN = 26;
            tr[3].schedule = tm.parse("13:45");

            tr[4].destination ="Гомель";
            tr[4].trainN = 55;
            tr[4].schedule = tm.parse("15:55");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = tr.length - 1; i > 0; i--){
            for (int j = i; j < tr.length; j++){
                if ( tr[j-1].trainN > tr[j].trainN ) {
                    ctr = tr[j-1];
                    tr[j-1] = tr[j];
                    tr[j] = ctr;
                } else break;
            }
        }

        System.out.println("Введите номер поезда");
        userTrainN = scanner.nextInt();
        int i;
        for(i = 0; i < tr.length;i++){
            if(userTrainN == tr[i].trainN){

                    System.out.println(tr[i].destination + " " + tr[i].trainN + " " + tm.format(tr[i].schedule));

                break;
            }

        }
        if(i==tr.length){
            System.out.println("Такого поезда нет");
        }

        for (i = tr.length - 1; i > 0; i--){
            for (int j = i; j < tr.length; j++){
                if ( tr[j-1].destination.compareTo(tr[j].destination) > 0 ) {
                    ctr = tr[j-1];
                    tr[j-1] = tr[j];
                    tr[j] = ctr;
                }
                else if(tr[j-1].destination.compareTo(tr[j].destination) == 0){
                    if ( tr[j-1].schedule.compareTo(tr[j].schedule) > 0 ) {
                        ctr = tr[j-1];
                        tr[j-1] = tr[j];
                        tr[j] = ctr;
                    }
                }
            }
        }
        for (i = 0; i <tr.length; i++){
            System.out.println(tr[i].destination + " " + tr[i].trainN + " " + tm.format(tr[i].schedule));
        }


    }
}
