package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class Controller {
    float data = 0f;
    float data1 = 0f;
    float wynik = 0f;
    int operation = -1;
    String a;


    @FXML
    Button one;

    @FXML
    Button two;

    @FXML
    Button three;

    @FXML
    Button plus;

    @FXML
    Button four;

    @FXML
    Button five;

    @FXML
    Button six;

    @FXML
    Button minus;

    @FXML
    Button seven;

    @FXML
    Button eight;

    @FXML
    Button nine;

    @FXML
    Button multiply;

    @FXML
    Button zero;

    @FXML
    Button equals;

    @FXML
    Button cl;

    @FXML
    Button division;


    @FXML
    TextField display;

    @FXML
    Pane pane;

    @FXML
    TextField display2;


    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
            display2.setText(display2.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
            display2.setText(display2.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
            display2.setText(display2.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
            display2.setText(display2.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
            display2.setText(display2.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
            display2.setText(display2.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
            display2.setText(display2.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
            display2.setText(display2.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
            display2.setText(display2.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
            display2.setText(display2.getText() + "0");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
            display2.setText(display2.getText() + "+");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
            display2.setText(display2.getText() + "-");
        } else if (event.getSource() == multiply) {
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
            display2.setText(display2.getText() + "x");
        } else if (event.getSource() == division) {
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
            display2.setText(display2.getText() + "/");
        } else if (event.getSource() == equals) {

            data1 = Float.parseFloat(display.getText());

            switch (operation) {
                case 1:
                    wynik = data + data1;
                    display.setText(String.valueOf(wynik));
                    display2.setText(display2.getText() + "=" + wynik);
                    break;
                case 2:
                    wynik = data - data1;
                    display.setText(String.valueOf(wynik));
                    display2.setText(display2.getText() + "=" + wynik);
                    break;
                case 3:
                    wynik = data * data1;
                    display.setText(String.valueOf(wynik));
                    display2.setText(display2.getText() + "=" + wynik);
                    break;
                case 4:
                    wynik = data / data1;
                    display.setText(String.valueOf(wynik));
                    a = display2.getText();
                    if(a.length()<20)
                        display2.setText(display2.getText() + "=" + wynik);
                    else
                        display2.setText("=" + wynik);

//                    a = display2.getText();
//                    if(a.length()>2){
//                        display2.setText("");
//                        System.out.println("ttt");
//                    }
                    break;



            }


        } else if (event.getSource() == cl) {
            display.setText("");
            display2.setText("");

        }


//

    }
}
