package Treangle;
/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
        площади, периметра и точки пересечения медиан.*/

public class Treangle {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double x;
    double y;


    public Treangle(double nx1, double ny1, double nx2, double ny2, double nx3, double ny3){
        x1 = nx1;
        y1 = ny1;
        x2 = nx2;
        y2 = ny2;
        x3 = ny3;
        y3 = ny3;
    }

    double Squire() {
         double s= 0.5 * Math.abs((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1));
         return s;
    }

    double perimetr(){
        double p;
        p = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        p += Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        p += Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        return p;
    }

    void point(){
        x=(x1+x2+x3)/3;
        y=(y1+y2+y3)/3;

    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }




}
