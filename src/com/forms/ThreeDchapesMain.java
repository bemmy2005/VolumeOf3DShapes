package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class ThreeDchapesMain implements ActionListener{
	JFrame frame;
	JButton spherebtn=new JButton("Sphere");
	JButton cubebtn=new JButton("Cube");
	JButton cuboidbtn=new JButton("Cuboid");
	JButton cylinderbnt=new JButton("Cylinder");
	JButton conebtn=new JButton("Cone");

	public  ThreeDchapesMain() {
		createwindow();
		SetLocationAndSize();
		AddcomponentToFrame();
		AddEventAction();
	}

	private void createwindow() {
		frame=new JFrame();
		frame.setBounds(10, 10, 550, 150);
		frame.setTitle("Volume of 3D shapes");		
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void AddcomponentToFrame() {
		frame.add(spherebtn);
		frame.add(cubebtn);
		frame.add(cuboidbtn);
		frame.add(cylinderbnt);
		frame.add(conebtn);
	}
	private void SetLocationAndSize() {

		spherebtn.setBounds(50,70,80,20);
		cubebtn.setBounds(125,70,80,20);
		cuboidbtn.setBounds(200,70,80,20);
		cylinderbnt.setBounds(275,70,80,20);
		conebtn.setBounds(350,70,80,20);

	}







	private void AddEventAction() {
		spherebtn.addActionListener(this);
		cubebtn.addActionListener(this);
		cuboidbtn.addActionListener(this);
		cylinderbnt.addActionListener(this);
		conebtn.addActionListener(this);

	}







	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==spherebtn) {
			SphereForm spfrm=new SphereForm();
			frame.dispose();
		}else if(e.getSource()==cubebtn) {
			CubeForm cbfrm =new CubeForm();
			frame.dispose();
		}
		else if(e.getSource()==cuboidbtn) {
			CuboidForm cbfrm=new CuboidForm();
			frame.dispose();
		}else if(e.getSource()==cylinderbnt) {
			CylnderForm cylFrm=new CylnderForm();
			frame.dispose();
		}else if(e.getSource()==conebtn) {
			ConeForm cnfrm=new ConeForm();
			frame.dispose();
		}

	}
	public static void main(String[] args) {
		ThreeDchapesMain shapes=new ThreeDchapesMain();
	}
}
