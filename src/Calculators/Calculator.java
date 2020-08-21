package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
    
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");
		textField = new JTextField();
		textField.setBounds(10, 10, 253, 83);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 105, 60, 60);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(75, 105, 60, 60);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				 textField.setText(EnterNumber);
			}
		}); 
 		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 105, 60, 60);
		frame.getContentPane().add(btn9);
		
		final JButton btn4 = new JButton("4"); 
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 177, 60, 60);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5"); 
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(75, 177, 60, 60);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6"); 
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 177, 60, 60);
		frame.getContentPane().add(btn6);
		
		final JButton btn1 = new JButton("1"); 
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 249, 60, 60);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2"); 
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(75, 249, 60, 60);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3"); 
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 249, 60, 60);
		frame.getContentPane().add(btn3);
		
		final JButton btnPlus = new JButton("+"); 
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "+";
			}
		}); 
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(205, 105, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		final JButton btnMinus = new JButton("-"); 
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "-";
			}
		}); 
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(205, 177, 60, 60);
		frame.getContentPane().add(btnMinus);
		
		final JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "*";
			}
		}); 
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(205, 249, 60, 60);
		frame.getContentPane().add(btnMult);
		
		final JButton btn0 = new JButton("0"); 
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				 textField.setText(EnterNumber);
			}
		}); 
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 321, 60, 60);
		frame.getContentPane().add(btn0);
		
		final JButton btnDot = new JButton("."); 
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().contains(".")) {}
				else {
				String EnterNumber = textField.getText() + btnDot.getText();
			    textField.setText(EnterNumber);}			}
		}); 
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(75, 321, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+-"); 
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(140, 321, 60, 60);
		frame.getContentPane().add(btnPM);
		
		JButton btnEquals = new JButton("="); 
		btnEquals.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
				secondNum=Double.parseDouble(textField.getText());
			    if (operations == "+")
			    {
			    	result = firstNum + secondNum;
			    	answer = String.format("%.2f",result);
			    	textField.setText(answer);
			    }
			    else  if (operations == "-")
			    {
			    	result = firstNum - secondNum;
			    	answer = String.format("%.2f",result);
			    	textField.setText(answer);
			    }
			    else  if (operations == "*")
			    {
			    	result = firstNum * secondNum;
			    	answer = String.format("%.2f",result);
			    	textField.setText(answer);
			    }
			    else  if (operations == "/")
			    {
			    	result = firstNum / secondNum;
			    	answer = String.format("%.2f",result);
			    	textField.setText(answer);
			    }
			    else  if (operations == "%")
			    {
			    	result = firstNum % secondNum;
			    	answer = String.format("%.2f",result);
			    	textField.setText(answer);
			    }
			
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(205, 392, 60, 60);
		frame.getContentPane().add(btnEquals);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 textField.setText(null);
			}
		}); 
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(75, 392, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackSpace = new JButton("\u2190"); 
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace=strB.toString();
					textField.setText(backspace);
					
				}
			}
			
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(140, 392, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnDiv = new JButton("/"); 
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(205, 320, 60, 60);
		frame.getContentPane().add(btnDiv);
		
		JButton btnPercent = new JButton("%"); 
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(10, 392, 60, 60);
		frame.getContentPane().add(btnPercent);
	}
}
