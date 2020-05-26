package sample;



public class BisectionMethod {
    int k;
    int check;
    int check1;
    double x;
    double cor;

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

    public double bisectionMain(double x1, double x2, double[] arr) {

        while (Math.abs(x1 - x2) > arr[7] & k<1000) {
            k++;
            x = (x1 + x2) / 2;
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
            if (function(arr[5], arr[0], arr[1], arr[2], arr[3], arr[4]) * function(arr[6], arr[0], arr[1], arr[2], arr[3], arr[4]) > 0) {
                k += 10000;
            }




        }
        return x;
    }
}
