package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;

public class GUIController implements Initializable {
	
    @FXML
    private TextField txt_result;
    String op="";
    double number1;
    double number2;
    public void Number(ActionEvent ae) {
    	
    	String no=((Button)ae.getSource()).getText();
    	System.out.println("no"+no);
    	txt_result.setText(txt_result.getText()+no);
    }
    public void Delete(ActionEvent ae) {
    	op="";
    	txt_result.setText("");
    	System.out.println("C "+op);
        return;
    }
    
    public void Operation (ActionEvent ae){
        
        String operation = ((Button)ae.getSource()).getText();
         if (!operation.equals("=")){
        
            if(!op.equals("")){
                return;
            }
            
            op = operation;
            number1=Double.parseDouble(txt_result.getText());
           
            txt_result.setText("");
            return;
        }else {
        
            if(op.equals("") ){
                return;
            }
           
            number2=Double.parseDouble(txt_result.getText());
            calculer(number1, number2, op);
            op="";

            
        }
    }
    	
    	
    	
    
    public void calculer(double n1, double n2, String op) {
        double result = 0.0;

        switch (op) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    txt_result.setText("ERROR");
                    return;
                }
                break;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        String formattedResult = decimalFormat.format(result);

        txt_result.setText(formattedResult);
    		
    	}
    	
    	
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
