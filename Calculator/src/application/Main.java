package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	private GridPane grid;
	private Scene scene; 
	Text formTitle; 
	TextField numbers; 
	Button button0;
	Button button1; 
	Button button2; 
	Button button3; 
	Button button4; 
	Button button5; 
	Button button6; 
	Button button7;
	Button button8;
	Button button9; 
	Button buttonDivide;
	String arithmetic;
	String first;
	String second;
	Double total;
	String equal; 
	
	
	public void settingScene() {
		 grid = new GridPane();
	     grid.setAlignment(Pos.TOP_LEFT);
	     grid.setHgap(10);
	     grid.setVgap(10);
	     grid.setPadding(new Insets(25, 25, 25, 25));
	     scene = new Scene(grid, 280, 370);
	     grid.setStyle("-fx-background-color: LIGHTSLATEGRAY");
	     addControls();
	}
	
	public void erase(String parameter) {
		if(parameter == "=") {
			numbers.setText("");
			equal = "";
		}
	}
	
	private void addControls() {
		numbers = new TextField();
	    numbers.setFont(new Font("Ariel", 25));
	    numbers.setAlignment(Pos.CENTER_RIGHT);
	    numbers.setText("");
	    grid.add(numbers, 0, 0, 4, 1);
	    
	    button7 = new Button("7");
	    button7.setFont(new Font("Arial", 25));
	    grid.add(button7, 0, 1);

	    button8 = new Button("8");
	    button8.setFont(new Font("Arial", 25));
	    grid.add(button8, 1, 1);

	    button9 = new Button("9");
	    button9.setFont(new Font("Arial", 25));
	    grid.add(button9, 2, 1);

	    buttonDivide = new Button("/");
	    buttonDivide.setFont(new Font("Arial", 29));
	    grid.add(buttonDivide, 3, 1);

	    button4 = new Button("4");
	    button4.setFont(new Font("Arial", 25));
	    grid.add(button4, 0, 2);
	    

	    button5 = new Button("5");
	    button5.setFont(new Font("Arial", 25));
	    grid.add(button5, 1, 2);

	    button6 = new Button("6");
	    button6.setFont(new Font("Arial", 25));
	    grid.add(button6, 2, 2);

	    Button buttonMultiply = new Button("*");
	    buttonMultiply.setFont(new Font("Arial", 28));
	    grid.add(buttonMultiply, 3, 2);

	    button1 = new Button("1");
	    button1.setFont(new Font("Arial", 25));
	    grid.add(button1, 0, 3);

	    button2 = new Button("2");
	    button2.setFont(new Font("Arial", 25));
	    grid.add(button2, 1, 3);

	    button3 = new Button("3");
	    button3.setFont(new Font("Arial", 25));
	    grid.add(button3, 2, 3);

	    Button buttonMinus = new Button("-");
	    buttonMinus.setFont(new Font("Arial", 29));
	    grid.add(buttonMinus, 3, 3);

	    Button buttonClear = new Button("C");
	    buttonClear.setFont(new Font("Arial", 25));
	    grid.add(buttonClear, 0, 4);

	    button0 = new Button("0");
	    button0.setFont(new Font("Arial", 25));
	    grid.add(button0, 1, 4);

	    Button buttonEquals = new Button("=");
	    buttonEquals.setFont(new Font("Arial", 25));
	    grid.add(buttonEquals, 2, 4);

	    Button buttonPlus = new Button("+");
	    buttonPlus.setFont(new Font("Arial", 25));
	    grid.add(buttonPlus, 3, 4);

	    
	    // add event handlers after creating the buttons
	    button0.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "0";
	        numbers.setText(num);
	    });
	    
	    button1.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "1";
	        numbers.setText(num);
	    });
	    
	    button2.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "2";
	        numbers.setText(num);
	    });
	    
	    button3.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "3";
	        numbers.setText(num);
	    });
	    
	    button4.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "4";
	        numbers.setText(num);
	    });
	    
	    button5.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "5";
	        numbers.setText(num);
	    });
	    
	   button6.setOnAction(e -> {
		   erase(equal);
	        String num = numbers.getText();
	        num += "6";
	        numbers.setText(num);
	    });
	    
	    button7.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "7";
	        numbers.setText(num);
	    });
	    
	    button8.setOnAction(e -> {
	    	erase(equal);
	        String num = numbers.getText();
	        num += "8";
	        numbers.setText(num);
	    });
	    
	   button9.setOnAction(e -> {
		   erase(equal);
	        String num = numbers.getText();
	        num += "9";
	        numbers.setText(num);
	    });
	   
	   buttonClear.setOnAction(e->{
		   numbers.setText("");
	   });
	   
	   buttonMinus.setOnAction(e->{
		   first = numbers.getText();
		   arithmetic = "-";
		   numbers.setText("");
	   });
	   
	   buttonMultiply.setOnAction(e->{
		   first = numbers.getText();
		   arithmetic = "*";
		   numbers.setText("");
	   });
	   
	   buttonPlus.setOnAction(e->{
		   first = numbers.getText();
		   arithmetic = "+";
		   numbers.setText("");
	   });
	   
	   buttonDivide.setOnAction(e->{
		   first = numbers.getText();
		   arithmetic = "/";
		   numbers.setText("");
	   });
	   
	   buttonEquals.setOnAction(e->{
		   second = numbers.getText();
		   Double first1 = Double.parseDouble(first);
		   Double second2 = Double.parseDouble(second);
		   
		   if (arithmetic == "+") {
			   total = first1+second2;
		   } else if (arithmetic == "-") {
			   total = first1-second2;
		   } else if (arithmetic == "*") {
			   total = first1*second2;
		   } else if (arithmetic == "/") {
			   total = first1/second2;
		   }
		   
		   equal = "=";
		   numbers.setText(Double.toString(total));
	   });
	}





	@Override
	public void start(Stage primaryStage) {
		try {
			settingScene();
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.show();
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
