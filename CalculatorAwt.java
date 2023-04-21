import java.awt.*;
import java.awt.event.*;
class CalculatorAwt implements ActionListener
{
	
	int num1=0,num2=0,result=0;
	String choice_operator;
	Frame f1 = new Frame("Calculator");
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,beq,bc,bp,bm,bml,bd;
	Panel pn = new Panel();
	TextField tf1 = new TextField(20);
	public CalculatorAwt()
	{
		b0 = new Button("0"); b0.addActionListener(this);
		b1 = new Button("1"); b1.addActionListener(this);
		b2 = new Button("2"); b2.addActionListener(this);
		b3 = new Button("3"); b3.addActionListener(this);
		b4 = new Button("4"); b4.addActionListener(this);
		b5 = new Button("5"); b5.addActionListener(this);
		b6 = new Button("6"); b6.addActionListener(this);
		b7 = new Button("7"); b7.addActionListener(this);
		b8 = new Button("8"); b8.addActionListener(this);
		b9 = new Button("9"); b9.addActionListener(this);
		beq = new Button("="); beq.addActionListener(this);
		bc = new Button("Clear"); bc.addActionListener(this);
		bp = new Button("+"); bp.addActionListener(this);
		bm = new Button("-"); bm.addActionListener(this);
		bml = new Button("*"); bml.addActionListener(this);
		bd = new Button("/");bd.addActionListener(this);
		pn.add(b7); pn.add(b8); pn.add(b9); pn.add(bp);
		pn.add(b4); pn.add(b5); pn.add(b6); pn.add(bm);	
		pn.add(b1); pn.add(b2); pn.add(b3); pn.add(bml);	
		pn.add(bc); pn.add(b0); pn.add(beq); pn.add(bd);	
		f1.add(pn,"Center");
		f1.add(tf1,"North");
		pn.setLayout(new GridLayout(4,4));
		f1.setSize(700,700);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				//System.exit(0);
				f1.dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String st1 = ae.getActionCommand();
		if (st1.equals("="))
		{
				num2 = Integer.parseInt(tf1.getText());
				switch(choice_operator)
				{
					case "+": 
						result = num1 + num2;
						break;
					case "-": 
						result = num1 - num2;
						break;
					case "*": 
						result = num1 * num2;
						break;
					case "/": 
						result = num1 / num2;
						break;
				}
				tf1.setText(result+"");
		}
		else if (st1.equals("Clear"))
		{
				tf1.setText("");
		}
		else if (st1.equals("+"))
		{
				num1 = Integer.parseInt(tf1.getText());
				tf1.setText("");
				choice_operator = bp.getLabel();
		}
		else if (st1.equals("-"))
		{
				num1 = Integer.parseInt(tf1.getText());
				tf1.setText("");
				choice_operator = bm.getLabel();
		}
		else if (st1.equals("*"))
		{
				num1 = Integer.parseInt(tf1.getText());
				tf1.setText("");
				choice_operator = bml.getLabel();
		}
		else if (st1.equals("/"))
		{
				num1 = Integer.parseInt(tf1.getText());
				tf1.setText("");
				choice_operator = bd.getLabel();
		}
		else
		{
			tf1.setText(tf1.getText()+st1);
		}
	}
	public static void main(String args[])
	{
		CalculatorAwt c1 = new CalculatorAwt();
	}
}