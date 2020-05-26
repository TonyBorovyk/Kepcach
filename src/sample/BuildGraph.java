package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.io.IOException;


public class BuildGraph {
    int counter = 0;
    ObservableList<XYChart.Data> datas = FXCollections.observableArrayList();
    ObservableList<XYChart.Data> datas1 = FXCollections.observableArrayList();
    ObservableList<XYChart.Data> datas2 = FXCollections.observableArrayList();
    ObservableList<XYChart.Data> datas3 = FXCollections.observableArrayList();
    XYChart.Series series = new XYChart.Series<>();
    XYChart.Series series1 = new XYChart.Series<>();
    XYChart.Series series2 = new XYChart.Series<>();
    XYChart.Series series3 = new XYChart.Series<>();
    public void build1(LineChart<?, ?> chart1,double []arr) {
        counter += 1;
        for(double i= -15; i<15; i+=0.2d){
            if(counter  == 1)
                datas.add(new XYChart.Data(i, arr[0] * Math.pow(i,4) +arr[1] *Math.sin(i)+ arr[2]*Math.exp(i)+ arr[3]*i+ arr[4]));
            else if (counter==2){
                datas1.add(new XYChart.Data(i, arr[0] * Math.pow(i,4) +arr[1] *Math.sin(i)+ arr[2]*Math.exp(i)+ arr[3]*i+ arr[4]));
            }else if (counter==3){
                datas2.add(new XYChart.Data(i, arr[0] * Math.pow(i,4) +arr[1] *Math.sin(i)+ arr[2]*Math.exp(i)+ arr[3]*i+ arr[4]));
            }
            else if (counter==4){
                datas3.add(new XYChart.Data(i, arr[0] * Math.pow(i,4) +arr[1] *Math.sin(i)+ arr[2]*Math.exp(i)+ arr[3]*i+ arr[4]));
            }
        }
        if (counter==1){
            series.setData(datas);
            chart1.getData().addAll(series);
        }else if(counter==2){
            series1.setData(datas1);
            chart1.getData().addAll(series1);
        }else if(counter==3){
            series2.setData(datas2);
            chart1.getData().addAll(series2);
        }else if(counter==4){
            series3.setData(datas3);
            chart1.getData().addAll(series3);
        }

    }
    public void build2(LineChart<?, ?> chart1,double []arr){
        counter += 1;
        for(double i= -15; i<15; i+=0.1d){
            if(counter==1)
                datas.add(new XYChart.Data(i, arr[0] * Math.pow(i,5) +arr[1] *Math.pow(i,4)+ arr[2]* Math.sin(i)+ arr[3]*i+ arr[4]));
            else if (counter==2){
                datas1.add(new XYChart.Data(i, arr[0] * Math.pow(i,5) +arr[1] *Math.pow(i,4)+ arr[2]* Math.sin(i)+ arr[3]*i+ arr[4]));
            }else if (counter==3){
                datas2.add(new XYChart.Data(i, arr[0] * Math.pow(i,5) +arr[1] *Math.pow(i,4)+ arr[2]* Math.sin(i)+ arr[3]*i+ arr[4]));
            }
            else if (counter==4){
                datas3.add(new XYChart.Data(i, arr[0] * Math.pow(i,5) +arr[1] *Math.pow(i,4)+ arr[2]* Math.sin(i)+ arr[3]*i+ arr[4]));
            }
        }
        if (counter==1){
            series.setData(datas);
            chart1.getData().addAll(series);
        }else if(counter==2){
            series1.setData(datas1);
            chart1.getData().addAll(series1);
        }else if(counter==3){
            series2.setData(datas2);
            chart1.getData().addAll(series2);
        }else if(counter==4){
            series3.setData(datas3);
            chart1.getData().addAll(series3);
        }

    }
    public void build3(LineChart<?, ?> chart1,double []arr){
        counter += 1;
        for(double i= -15; i<15; i+=0.2d){
            if(counter==1)
                datas.add(new XYChart.Data(i, arr[0] * Math.cos(i) +arr[1] *Math.pow(2,i)+ arr[2]* Math.pow(i,6)+ arr[3]*i+ arr[4]));
            else if (counter==2){
                datas1.add(new XYChart.Data(i, arr[0] * Math.cos(i) +arr[1] *Math.pow(2,i)+ arr[2]* Math.pow(i,6)+ arr[3]*i+ arr[4]));
            }else if (counter==3){
                datas2.add(new XYChart.Data(i, arr[0] * Math.cos(i) +arr[1] *Math.pow(2,i)+ arr[2]* Math.pow(i,6)+ arr[3]*i+ arr[4]));
            }
            else if (counter==4){
                datas3.add(new XYChart.Data(i, arr[0] * Math.cos(i) +arr[1] *Math.pow(2,i)+ arr[2]* Math.pow(i,6)+ arr[3]*i+ arr[4]));
            }
        }
        if (counter==1){
        series.setData(datas);
        chart1.getData().addAll(series);
        }else if(counter==2){
            series1.setData(datas1);
            chart1.getData().addAll(series1);
        }else if(counter==3){
            series2.setData(datas2);
            chart1.getData().addAll(series2);
        }else if(counter==4){
            series3.setData(datas3);
            chart1.getData().addAll(series3);
        }


    }
}
