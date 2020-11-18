package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Simon Sperr
 * @version 2020.1.1, 17.11.2020
 */
public class Controller implements Initializable {


    @FXML private Button convert_btn;
    @FXML private TextField euro_txt;
    @FXML private TextField yen_txt;

    private CurrencyConverter converter;

    public void doConversion()
    {
        double euro = 0;

        try{
            euro = Double.parseDouble(euro_txt.getText());
        }
        catch (Exception e)
        {
            System.out.println("Fehlerhafter Wert");
        }
        yen_txt.setText(String.valueOf(this.converter.euroToYen(euro)));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        converter = new CurrencyConverter();
    }
}
