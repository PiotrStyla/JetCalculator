package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    float data = 0f;
    float data1 = 0f;
    float wynik = 0f;
    int operation = -1;

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
    Button clear;

    @FXML
    Button division;

    @FXML
    TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == one){
            display.setText(display.getText() + "1");
        }
        else if(event.getSource() == two){
            display.setText(display.getText() + "2");
        }
        else if(event.getSource() == three){
            display.setText(display.getText() + "3");
        }
        else if(event.getSource() == four){
            display.setText(display.getText() + "4");
        }
        else if(event.getSource() == five){
            display.setText(display.getText() + "5");
        }
        else if(event.getSource() == six){
            display.setText(display.getText() + "6");
        }
        else if(event.getSource() == seven){
            display.setText(display.getText() + "7");
        }
        else if(event.getSource() == two){
            display.setText(display.getText() + "8");
        }
        else if(event.getSource() == nine){
            display.setText(display.getText() + "9");
        }
        else if(event.getSource() == zero){
            display.setText(display.getText() + "0");
        }
        else if(event.getSource() == plus){
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        }
        else if(event.getSource() == minus){
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        }
        else if(event.getSource() == multiply){
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        }
        else if(event.getSource() == division){
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        }
        else if(event.getSource() == equals){

            data1 = Float.parseFloat(display.getText());

            switch (operation){
                case 1:
                    wynik = data+data1;
                    display.setText(String.valueOf(wynik));
                    break;
                case 2:
                    wynik = data-data1;
                    display.setText(String.valueOf(wynik));
                    break;
                case 3:
                    wynik = data*data1;
                    display.setText(String.valueOf(wynik));
                    break;
                case 4:
                    wynik = data/data1;
                    display.setText(String.valueOf(wynik));
                    break;

            }
        }

    }
}
