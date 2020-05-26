package sample;



public class NewtonMethod {
    int k = 0;
    int check;
    int check1;
    double cor;
    double x0,xn;
    double x;
    public double function(double x, double a, double b, double c, double d, double t) {
        if (check == 1) {
            k++;
            cor = a * Math.pow(x,4) + b * Math.sin(x) + c * Math.exp(x) + d * x + t;
        } else if (check == 2) {
            k++;
            cor = a * Math.pow(x,5) + b * Math.pow(x,4) + c * Math.sin(x) + d * x + t;
            ;
        } else if (check == 3) {
            k++;
            cor = a * Math.cos(x) + b * Math.pow(2,x) + Math.pow(x,6) + x + t;
        }
        return cor;
    }

    public double newtonMethod(double x1, double x2, double[] arr) {
        double temp;
        if (function(arr[5], arr[0], arr[1], arr[2], arr[3], arr[4]) * function(arr[6], arr[0], arr[1], arr[2], arr[3], arr[4]) > 0) {
            k += 10000;
        }
            while (Math.abs(x1-x2) > arr[7] & k<1000) {
                k++;
                temp =  x1 -function(x1, arr[0], arr[1], arr[2], arr[3], arr[4])/d1(x1, arr[0], arr[1], arr[2], arr[3]);
                x = temp;
                x = (x1 +x2)/2;
                if (function(x1, arr[0], arr[1], arr[2], arr[3], arr[4]) == 0) {
                    return x1;
                } else if (function(x2, arr[0], arr[1], arr[2], arr[3], arr[4]) == 0) {
                    return x2;
                } else if (function(x1, arr[0], arr[1], arr[2], arr[3], arr[4]) * function(x, arr[0], arr[1], arr[2], arr[3], arr[4]) < 0) {
                    x2 = x;
                    k++;
                } else  {
                    x1 = x;
                    k++;
                }


            }return x;}


    public double d1(double x,double a,double b,double c,double d) {
        if (check == 1){
            return a * 4*Math.pow(x,3) + b * Math.cos(x) + c * Math.exp(x) + d * 1;}
        else if (check == 2){
            return a * 5 * Math.pow(x,4) + b * 4*Math.pow(x,3) + c * Math.cos(x) + d * 1;}
        return -a * Math.sin(x) + b * Math.pow(2,x)*Math.log1p(2) + c * 6*Math.pow(x,5) + d * 1;
    }
    public double d2(double x,double a,double b,double c,double d) {
        if (check == 1){
            return a * 12*Math.pow(x,2) - b * Math.sin(x) + c * Math.exp(x);}
        else if (check == 2){
            return a * 20 * Math.pow(x,3) + b * 12*Math.pow(x,2) - c * Math.sin(x) ;}
        return -a * Math.cos(x) + b * Math.pow(2,x)*Math.log1p(2)*Math.log1p(2) + c * 30*Math.pow(x,4);
    }

}
