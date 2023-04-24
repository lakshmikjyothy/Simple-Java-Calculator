import java.awt.Color;
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
	JTextField textfield;
	JButton[] numberButtons=new JButton[10];
	JButton[] functionButtons=new JButton[18];
	JButton addButton,subButton,mulButton,divButton,modButton,rootButton,sqrButton,cubrButton,dZeroButton;
	JButton decButton,equButton,delButton,clrButton,negButton,mPlusButton,mMinusButton,mrButton,mcButton;
	JPanel panel;
	
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
		textfield=new JTextField();                              //Creates a display for the calculator                                       
		textfield.setBorder(BorderFactory.createEmptyBorder());  //Removes the default border
		textfield.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.GRAY)); // set left & right borders
		textfield.setBounds(0, 0, 324, 170);
		textfield.setBackground(Color.BLACK);
		textfield.setForeground(Color.WHITE);
		textfield.setHorizontalAlignment(JTextField.RIGHT);      //Aligns the text in the text field to the right
		textfield.setEditable(false);                            //Makes the text area display non-editable
		
		
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
			functionButtons[i].setBackground(Color.BLACK);	
		    functionButtons[i].setForeground(Color.WHITE);
		    functionButtons[i].setFocusable(false); 
		}
		
		
		//Styling number buttons
		for(int i=0; i<10; i++) {
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].setBackground(Color.BLACK);	
		    numberButtons[i].setForeground(Color.WHITE);
		    numberButtons[i].setFocusable(false);
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
		addButton.setBackground(Color.DARK_GRAY);
		addButton.setForeground(Color.BLACK);
		
		subButton.setBackground(Color.DARK_GRAY);
		subButton.setForeground(Color.BLACK);
		
		mulButton.setBackground(Color.DARK_GRAY);
		mulButton.setForeground(Color.BLACK);
		
		divButton.setBackground(Color.DARK_GRAY);
		divButton.setForeground(Color.BLACK);
		
		equButton.setBackground(Color.DARK_GRAY);
		equButton.setForeground(Color.BLACK);
		
		modButton.setBackground(Color.DARK_GRAY);
		modButton.setForeground(Color.BLACK);
		
		negButton.setBackground(Color.DARK_GRAY);
		negButton.setForeground(Color.BLACK);
		
		rootButton.setBackground(Color.DARK_GRAY);
		rootButton.setForeground(Color.BLACK);
	
		sqrButton.setBackground(Color.DARK_GRAY);
		sqrButton.setForeground(Color.BLACK);
		
		cubrButton.setBackground(Color.DARK_GRAY);
		cubrButton.setForeground(Color.BLACK);
		
		clrButton.setBackground(Color.DARK_GRAY);
		clrButton.setForeground(Color.BLACK);
		
		rootButton.setBackground(Color.DARK_GRAY);
		delButton.setBackground(Color.DARK_GRAY);
		
		
		
		//Adding elements to the frame and making it visible
		frame.add(panel);
		frame.add(textfield);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
