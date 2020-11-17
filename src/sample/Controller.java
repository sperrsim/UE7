package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author Simon Sperr
 * @version 2020.1.1, 17.11.2020
 */
public class Controller {

    public Button convert_btn;
    public TextField euro_txt;
    public TextField yen_txt;

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
        yen_txt.setText(String.valueOf(new CurrencyConverter().euroToYen(euro)));

    }
}
