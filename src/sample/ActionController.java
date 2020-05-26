package sample;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ActionController {
    public void CountVariant(TextField kFld_1,TextField kFld_2,TextField kFld_3,TextField kFld_4,
                             TextField kFld_5,TextField m1,TextField m2,TextField tCh,double []arr){
        kFld_1.setOnAction(event1 -> {
            double text1 = Double.parseDouble(kFld_1.getText());
            arr[0] = text1;
        });
        kFld_2.setOnAction(event1 -> {
            double text2 = Double.parseDouble(kFld_2.getText());
            arr[1] = text2;
        });
        kFld_3.setOnAction(event1 -> {
            double text3 = Double.parseDouble(kFld_3.getText());
            arr[2] = text3;
        });
        kFld_4.setOnAction(event1 -> {
            double text4 = Double.parseDouble(kFld_4.getText());
            arr[3] = text4;
        });
        kFld_5.setOnAction(event1 -> {
            double text5 = Double.parseDouble(kFld_5.getText());
            arr[4] = text5;
        });
        m1.setOnAction(event1 ->{
            double text1 = Double.parseDouble(m1.getText());
            arr[5] = text1;
        });
        m2.setOnAction(event1 ->{
            double text1 =Double.parseDouble(m2.getText());
            arr[6] = text1;
        });
        tCh.setOnAction(event1 ->{
            double text1 = 0;
            String str2 = tCh.getText();
            text1 = Double.parseDouble(str2);
            arr[7] = text1;
        });
    }
}
