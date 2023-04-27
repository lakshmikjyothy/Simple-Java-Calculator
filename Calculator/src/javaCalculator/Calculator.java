package javaCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	
	
	//Creating Frame, text field, number as well as function buttons, and a panel
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons=new JButton[10];
	JButton[] functionButtons=new JButton[18];
	JButton addButton,subButton,mulButton,divButton,modButton,rootButton,sqrButton,cubrButton,dZeroButton;
	JButton decButton,equButton,delButton,clrButton,negButton,mPlusButton,mMinusButton,mrButton,mcButton;
	JPanel panel;
	
	
	//Adding different fonts
	Font textFieldFont=new Font("monospace", Font.PLAIN, 30);
	Font bigPlainFont=new Font("monospace", Font.PLAIN, 20);
	Font smallPlainFont=new Font("monospace", Font.PLAIN, 19);
	
	Font boldFont1=new Font("monospace", Font.BOLD, 13);
	Font boldFont2=new Font("monospace", Font.BOLD, 14);
	Font boldFont3=new Font("monospace", Font.BOLD, 16);
	Font boldFont4=new Font("monospace", Font.BOLD, 19);
    Font boldFont5=new Font("monospace", Font.BOLD, 20);
	
    
    //Variable declaration to aid the action listener operations
	double num1,num2,result;
	char operator;
	
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		
		
		//Styling frame object
		frame=new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 545);
		frame.setLocation(800, 90);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);                                   //Position the contents absolutely
		
	
		//Creating and adding elements to the frame
		
		//Styling text field object
		textField=new JTextField();                              //Creates a display for the calculator                                       
		//textField.setBorder(BorderFactory.createEmptyBorder());  //Removes the default border
		textField.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.GRAY)); // set left & right borders
		textField.setBounds(0, 0, 324, 170);
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.WHITE);
		textField.setHorizontalAlignment(JTextField.RIGHT);      //Aligns the text in the text field to the right
		textField.setEditable(false);                            //Makes the text area display non-editable
		textField.setFont(textFieldFont);

		
		//Creating objects for function buttons
		addButton=new JButton("+");
		subButton=new JButton("-");
		mulButton=new JButton("x");
		divButton=new JButton("/");
		modButton=new JButton("%");
		rootButton=new JButton("√");  //ALT+251 for root.
		sqrButton=new JButton("x²");  //ALT+253 for power.
		cubrButton=new JButton("∛");  //ALT+0179 for cube. 
		dZeroButton=new JButton("00");
		decButton=new JButton(".");
		equButton=new JButton("=");
		clrButton=new JButton("AC");
		negButton=new JButton("+/-");
		mPlusButton=new JButton("M+");
		mMinusButton=new JButton("M-");
		mrButton=new JButton("MR");
		mcButton=new JButton("MC");
		
		ImageIcon delIcon=new ImageIcon("C:\\Users\\User\\Desktop\\GitHub Projects\\JAVA\\delicon.png");
		delButton=new JButton(delIcon);
		
		
		//Adding function buttons to the array
		functionButtons[0]=addButton;
		functionButtons[1]=subButton;
		functionButtons[2]=mulButton;
		functionButtons[3]=divButton;	
		functionButtons[4]=modButton;
		functionButtons[5]=rootButton;
		functionButtons[6]=sqrButton;
		functionButtons[7]=cubrButton;
		functionButtons[8]=dZeroButton;
		functionButtons[9]=decButton;
		functionButtons[10]=equButton;
		functionButtons[11]=delButton;
		functionButtons[12]=clrButton;
		functionButtons[13]=negButton;
		functionButtons[14]=mPlusButton;
		functionButtons[15]=mMinusButton;
		functionButtons[16]=mrButton;
		functionButtons[17]=mcButton;
		
		
		//Styling function buttons
		for(int i=0; i<18; i++) {
			functionButtons[i].addActionListener(this);     //To recognize the action performed by user on function buttons
			functionButtons[i].setBackground(Color.BLACK);	
		    functionButtons[i].setForeground(Color.WHITE);
		    functionButtons[i].setFocusable(false); 
			functionButtons[i].setFont(boldFont2);

		}
		
		
		//Styling number buttons
		for(int i=0; i<10; i++) {
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);        //To recognize the action performed by user on number buttons
			numberButtons[i].setBackground(Color.BLACK);	
		    numberButtons[i].setForeground(Color.WHITE);
		    numberButtons[i].setFocusable(false);
			numberButtons[i].setFont(boldFont2);

		}
		
		
		//Styling panel object
		panel = new JPanel();
		panel.setBounds(0,170,325,337);
		panel.setBackground(Color.BLACK);
		panel.setLayout(new GridLayout(7, 4, 0, 0));
		
		
		//Adding buttons to the panel
		panel.add(mrButton);
		panel.add(mPlusButton);
		panel.add(mMinusButton);
		panel.add(mcButton);
		panel.add(modButton);
		panel.add(negButton);
		panel.add(clrButton);
		panel.add(delButton);
		panel.add(cubrButton);
		panel.add(sqrButton);
		panel.add(rootButton);
		panel.add(divButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[0]);
		panel.add(dZeroButton);
		panel.add(decButton);
		panel.add(equButton);
		
		
		//Adding special styles to selected buttons
		addButton.setBackground(Color.decode("#323232"));
		addButton.setForeground(Color.BLACK);
		addButton.setFont(bigPlainFont);
		
		subButton.setBackground(Color.decode("#323232"));
		subButton.setForeground(Color.BLACK);
		subButton.setFont(bigPlainFont);
		
		mulButton.setBackground(Color.decode("#323232"));
		mulButton.setForeground(Color.BLACK);
		mulButton.setFont(smallPlainFont);

		divButton.setBackground(Color.decode("#323232"));
		divButton.setForeground(Color.BLACK);
		divButton.setFont(boldFont5);

		equButton.setBackground(Color.decode("#323232"));
		equButton.setForeground(Color.BLACK);
		equButton.setFont(bigPlainFont);

		modButton.setBackground(Color.decode("#323232"));
		modButton.setForeground(Color.BLACK);
		modButton.setFont(boldFont3);

		negButton.setBackground(Color.decode("#323232"));
		negButton.setForeground(Color.BLACK);
		negButton.setFont(smallPlainFont);

		rootButton.setBackground(Color.decode("#323232"));
		rootButton.setForeground(Color.BLACK);
		rootButton.setFont(boldFont4);

		sqrButton.setBackground(Color.decode("#323232"));
		sqrButton.setForeground(Color.BLACK);
		sqrButton.setFont(smallPlainFont);		

		cubrButton.setBackground(Color.decode("#323232"));
		cubrButton.setForeground(Color.BLACK);
		cubrButton.setFont(boldFont4);

		clrButton.setBackground(Color.decode("#323232"));
		clrButton.setForeground(Color.BLACK);
		clrButton.setFont(boldFont1);

		rootButton.setBackground(Color.decode("#323232"));
		delButton.setBackground(Color.decode("#323232"));
		
		
		
		//Adding elements to the frame and making it visible
		frame.add(panel);
		frame.add(textField);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {   //Not having main function cause Null Pointer Exception in Eclipse Java
		
		Calculator calc = new Calculator();    //Created an object of the class Calculator
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	    //Action on number buttons
		for( int i=0; i<10; i++) {
			
			if(e.getSource()==numberButtons[i]) {
				
				textField.setText(textField.getText().concat(String.valueOf(i)));
				
			}
			
		}
        
        
        //Action on double zero and decimal button
        if(e.getSource()==dZeroButton) {
        	
        	textField.setText(textField.getText().concat("00"));
        	
        }else if(e.getSource()==decButton) {
        	
        	textField.setText(textField.getText().concat("."));
        	
        }
        	
        
		//Action on clear and delete buttons
		if(e.getSource()==clrButton) {
			
			textField.setText("");
			
		}else if(e.getSource()==delButton) {
			
			String value = textField.getText();  //Value in the textField is assigned to a variable named value     
			textField.setText("");
			
			for(int i=1; i<value.length(); i++) {
				
				textField.setText(textField.getText()+(value.charAt(i)));
			}
			
		}

		
	}

}
