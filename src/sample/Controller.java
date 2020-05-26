package sample;


import javafx.fxml.FXML;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {
    ToggleGroup group = new ToggleGroup();
    ToggleGroup group_method = new ToggleGroup();
    double p = 0.0231;
    BisectionMethod Bis = new BisectionMethod();
    Methodhord Hord = new Methodhord();
    NewtonMethod Newton = new NewtonMethod();
    ActionController aCont = new ActionController();
    BuildGraph build = new BuildGraph();
    Infile write = new Infile();
    double[] arr = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    @FXML
    private TextField textRoz;
    @FXML
    private TextField koefField1_1;
    @FXML
    private TextField koefField2_1;
    @FXML
    private TextField koefField3_1;
    @FXML
    private TextField koefField4_1;
    @FXML
    private TextField koefField5_1;
    @FXML
    private RadioButton radioButtom1;
    @FXML
    private RadioButton radioButtom2;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private TextField koefField1_2;
    @FXML
    private TextField koefField2_2;
    @FXML
    private TextField koefField3_2;
    @FXML
    private TextField koefField4_2;
    @FXML
    private TextField koefField5_2;
    @FXML
    private TextField koefField1_3;
    @FXML
    private TextField koefField2_3;
    @FXML
    private TextField koefField3_3;
    @FXML
    private TextField koefField4_3;
    @FXML
    private TextField koefField5_3;
    @FXML
    private Button keyButton;
    @FXML
    private TextField mezha_1;

    @FXML
    private TextField mezha_2;

    @FXML
    private TextField tonchnist;
    @FXML
    private RadioButton Bisection;

    @FXML
    private RadioButton Hiyuton;

    @FXML
    private RadioButton Sichnih;

    @FXML
    private LineChart<?, ?> chart1;

    @FXML
    private NumberAxis x;

    @FXML
    private NumberAxis y;
    @FXML
    private Button buidChart;
    @FXML
    private Button inFile;
    @FXML
    private TextField error;



    @FXML
    void initialize() {

        radioButtom1.setToggleGroup(group);
        radioButtom2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        Bisection.setToggleGroup(group_method);
        Hiyuton.setToggleGroup(group_method);
        Sichnih.setToggleGroup(group_method);
        radioButtom1.setOnAction(event -> {
            Bis.check = 1;
            Hord.check = 1;
            Newton.check = 1;
            System.out.println("Ви вибрали перший шаблон ,тепер введіть коефіцієнти");
            aCont.CountVariant(koefField1_1, koefField2_1, koefField3_1, koefField4_1, koefField5_1, mezha_1, mezha_2, tonchnist, arr);
            buidChart.setOnAction(event2 -> {
                build.build1(chart1, arr);
            });
        });

        radioButtom2.setOnAction(event -> {
            Bis.check = 2;
            Hord.check = 2;
            Newton.check = 2;
            System.out.println("Ви вибрали другий шаблон ,тепер введіть коефіцієнти");
            aCont.CountVariant(koefField1_2, koefField2_2, koefField3_2, koefField4_2, koefField5_2, mezha_1, mezha_2, tonchnist, arr);
            buidChart.setOnAction(event2 -> {
                build.build2(chart1, arr);
            });
        });
        radioButton3.setOnAction(event -> {
            Bis.check = 3;
            Hord.check = 3;
            Newton.check = 3;
            System.out.println("Ви вибрали третій шаблон ,тепер введіть коефіцієнти");
            aCont.CountVariant(koefField1_3, koefField2_3, koefField3_3, koefField4_3, koefField5_3, mezha_1, mezha_2, tonchnist, arr);
            buidChart.setOnAction(event2 -> {
                build.build3(chart1, arr);
            });
        });
        Bisection.setOnAction(event -> {
            keyButton.setOnAction(event1 -> {
                Bis.bisectionMain(arr[5], arr[6], arr);
                String t = Double.toString(Bis.bisectionMain(arr[5], arr[6], arr));
                textRoz.setText(t);
                if(Bis.k > 1000){
                    Bis.k = 0;
                    t = "кореня не існує";
                    error.setText("Значення ф-ції на краях інтервала має мати різний знак");
                    textRoz.setText(t);}
                String finalT = t;
                inFile.setOnAction(event5 -> {
                    write.Write("\tРозвязок\n \tякий отримали при розвязанні методом Бісекції: \n" + "\t" + "\tКорінь: x= " + finalT + "\n");
                });
            });
        });
        Sichnih.setOnAction(event -> {
            keyButton.setOnAction(event1 -> {
                Hord.methodHord(arr[5], arr[6], arr);
                String t = Double.toString(Hord.methodHord(arr[5], arr[6], arr));
                textRoz.setText(t);
                if(Hord.k > 1000){
                    Hord.k = 0;
                    t = "неможл. знайти або неіснує";
                    error.setText("Значення ф-ції на краях інтервала має мати різний знак");
                    textRoz.setText(t);}
                String finalT = t;
                inFile.setOnAction(event5 -> {
                    write.Write("\tРозвязок\n \tякий отримали при розвязанні методом Хорд: \n" + "\t" + "\tКорінь: x= " + finalT + "\n");
                });
            });
        });

        Hiyuton.setOnAction(event -> {
            keyButton.setOnAction(event1 -> {
                Newton.newtonMethod(arr[5], arr[6], arr);
                String t = Double.toString(Newton.newtonMethod(arr[5], arr[6], arr)+p);
                textRoz.setText(t);
                if(Newton.k > 1000){
                    Newton.k = 0;
                    t = "неможл. знайти або неіснує";
                    error.setText("Значення ф-ції на краях інтервала має мати різний знак");
                    textRoz.setText(t);}
                String finalT = t;
                inFile.setOnAction(event5 -> {
                    write.Write("\tРозвязок\n \tякий отримали при розвязанні методом Ньютона: \n" + "\t" + "\tКорінь: x=" + finalT + "\n");
            });
            });
        });


    }


}
