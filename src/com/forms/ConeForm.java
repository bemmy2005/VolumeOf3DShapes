package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.entities.Sphere;

public class ConeForm implements ActionListener{
	JFrame frame;
	JButton backbtn=new JButton("Back");
	JButton calculate=new JButton("Calculate");
	private JLabel  radiuslb=new JLabel("radius");;
	private JLabel diameterlb=new JLabel("diameter");;
	private JLabel circumferencelb=new JLabel("circumference");;
	private JLabel volumelb=new JLabel("volume");;
	private JLabel surfaceArealb=new JLabel("surface Area");
	private JTextField  radiustxf=new JTextField();;

	public  ConeForm() {
		createwindow();
		SetLocationAndSize();
		AddcomponentToFrame();
		AddEventAction();
	}

	private void createwindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 550, 200);
		frame.setTitle("Sphere");		
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void AddcomponentToFrame() {
		frame.add(calculate);
		frame.add(backbtn);
		frame.add(radiuslb);
		frame.add(diameterlb);
		frame.add(circumferencelb);
		frame.add(volumelb);
		frame.add(surfaceArealb);
		frame.add(radiustxf);
	}
	private void SetLocationAndSize() {
		radiustxf.setBounds(50,20,80,20);
		//radiuslb.setBounds(50,70,80,20);
		//radiustxf
		diameterlb.setBounds(125,70,80,20);
		circumferencelb.setBounds(200,70,80,20);
		volumelb.setBounds(275,70,80,20);
		surfaceArealb.setBounds(350,70,80,20);
		calculate.setBounds(350,100,80,20);
		backbtn.setBounds(450,120,80,20);
	}

	private void AddEventAction() {
		backbtn.addActionListener(this);
		calculate.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Sphere sph=new Sphere();
		if(e.getSource()==calculate) {
			sph.setRadius(Double.parseDouble(radiustxf.getText()));
			diameterlb.setText(Double.toString(sph.calculateDiameter()));
			circumferencelb.setText(Double.toString(sph.calculateCircumference()));
			volumelb.setText(Double.toString(sph.calculateVolume()));
			surfaceArealb.setText(Double.toString(sph.calculatesurfaceArea()));
		}else if(e.getSource()==backbtn) {
			ThreeDchapesMain shapes=new ThreeDchapesMain();
			frame.dispose();
			//SphereForm sprn=new SphereForm();

		}

	}
	public static void main(String[] args) {
		ConeForm sprn=new ConeForm();
	}
}

