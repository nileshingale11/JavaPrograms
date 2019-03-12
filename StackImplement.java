//Stack implementation using UI Interface.
import java.awt.*;
import java.awt.event.*;	//package for event handling
import javax.swing.*;

class Stack{
	int[] stack;
	static int index = 0;
	JFrame f1;
	JTextField t;
	JButton ss, b1, b2, b3;
	Stack(){
		f1 = new JFrame("Stack Implementation");	//addition of frame
		ss = new JButton("Stack Size");		//addition of button
		ss.setBounds(180, 20, 120, 30);
		t = new JTextField(5);
		t.setBounds(120, 20, 50, 30);
		b1 = new JButton("Push");
		b2 = new JButton("Pop");
		b3 = new JButton("Peek");
		b1.setBounds(120, 60, 70, 30);
		b2.setBounds(120, 100, 70, 30);
		b3.setBounds(120, 140, 70, 30);
		f1.add(t); f1.add(b1); f1.add(ss);
		f1.add(b2);	f1.add(b3);
		f1.setLayout(null);
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				stack = new int[Integer.parseInt(t.getText())];
				JOptionPane.showMessageDialog(f1, "Stack size is " + stack.length);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (stack.length != 0) {
					if (index < stack.length) {
						JFrame f2 = new JFrame();
						JTextField num = new JTextField(10);
						f2.add(num);
						JButton push = new JButton("Push");
						f2.add(push);
						f2.setLayout(new FlowLayout());
						f2.setSize(200, 200);
						f2.setLocation(100, 100);
						f2.setVisible(true);
						push.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								stack[index] = Integer.parseInt(num.getText());
								JOptionPane.showMessageDialog(f2, "Pushed number is " + stack[index]);
								index++;
								f2.dispose();
							}
						});
					} else {
						JOptionPane.showMessageDialog(f1, "Stack is full.");
					}
				} else {
					JOptionPane.showMessageDialog(f1, "Stack is of 0 size.");
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (index == 0) {
					JOptionPane.showMessageDialog(f1, "Stack is empty.");
				} else {
					JOptionPane.showMessageDialog(f1, "Number popped is " + stack[index - 1]);
					stack[index - 1] = 0;
					if (index > 0)
						index--;
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (index != 0)
					JOptionPane.showMessageDialog(f1, "Number at peak is " + stack[index - 1]);
				else
					JOptionPane.showMessageDialog(f1, "Stack is empty.");
			}
		});
	}
}

public class StackImplement {

	public static void main(String[] args) {
		
		new Stack();
		
	}

}

