package com.forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.entities.Sphere;
/*
public class SphereForm implements ActionListener{
	JFrame frame;
	JButton backbtn=new JButton("Back");
	JButton calculate=new JButton("Calculate");
	private JLabel  radiuslb=new JLabel("radius");;
	private JLabel diameterlb=new JLabel("diameter");;
	private JLabel circumferencelb=new JLabel("circumference");;
	private JLabel volumelb=new JLabel("volume");;
	private JLabel surfaceArealb=new JLabel("surface Area");
	private JTextField  radiustxf=new JTextField();;

	public  SphereForm() {
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
		SphereForm sprn=new SphereForm();
	}
}
*/
//Import the necessary packages
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.entities.Sphere;

public class SphereForm implements ActionListener {
 JFrame frame;
 JButton backbtn = new JButton("Back");
 private JLabel radiuslb = new JLabel("Radius");
 private JLabel diameterlb = new JLabel("Diameter");
 private JLabel circumferencelb = new JLabel("Circumference");
 private JLabel volumelb = new JLabel("Volume");
 private JLabel surfaceArealb = new JLabel("Surface Area");
 private JTextField radiustxf = new JTextField();

 public SphereForm() {
     createwindow();
     SetLocationAndSize();
     AddcomponentToFrame();
     AddEventAction();
     AddDocumentListener();
 }

 private void createwindow() {
     frame = new JFrame();
     frame.setBounds(10, 10, 550, 200);
     frame.setTitle("Sphere");
     frame.getContentPane().setBackground(Color.gray);
     frame.getContentPane().setLayout(null);
     frame.setResizable(false);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }

 private void AddcomponentToFrame() {
     frame.add(backbtn);
     frame.add(radiuslb);
     frame.add(diameterlb);
     frame.add(circumferencelb);
     frame.add(volumelb);
     frame.add(surfaceArealb);
     frame.add(radiustxf);
 }

 private void SetLocationAndSize() {
     radiustxf.setBounds(50, 20, 80, 20);
     radiuslb.setBounds(50, 50, 150, 20);
     diameterlb.setBounds(50, 70, 150, 20);
     circumferencelb.setBounds(50, 90, 150, 20);
     volumelb.setBounds(50, 110, 150, 20);
     surfaceArealb.setBounds(50, 130, 150, 20);
     backbtn.setBounds(450, 120, 80, 20);
 }

 private void AddEventAction() {
     backbtn.addActionListener(this);
 }

 private void AddDocumentListener() {
     radiustxf.getDocument().addDocumentListener(new DocumentListener() {
         @Override
         public void insertUpdate(DocumentEvent e) {
             updateLabels();
         }

         @Override
         public void removeUpdate(DocumentEvent e) {
             updateLabels();
         }

         @Override
         public void changedUpdate(DocumentEvent e) {
             // Plain text components do not fire these events
         }
     });
 }

 private void updateLabels() {
     Sphere sph = new Sphere();
     try {
         sph.setRadius(Double.parseDouble(radiustxf.getText()));
         radiuslb.setText("Radius: " + sph.getRadius());
         diameterlb.setText("Diameter: " + sph.calculateDiameter());
         circumferencelb.setText("Circumference: " + sph.calculateCircumference());
         volumelb.setText("Volume: " + sph.calculateVolume());
         surfaceArealb.setText("Surface Area: " + sph.calculatesurfaceArea());
     } catch (NumberFormatException ex) {
         // Handle the case when the user enters non-numeric values
         radiuslb.setText("Radius:");
         diameterlb.setText("Diameter:");
         circumferencelb.setText("Circumference:");
         volumelb.setText("Volume:");
         surfaceArealb.setText("Surface Area:");
     }
 }

 @Override
 public void actionPerformed(ActionEvent e) {
     if (e.getSource() == backbtn) {
         // Add the logic to go back to the previous form (ThreeDchapesMain)
         frame.dispose(); // Close the current form
     }
 }

 public static void main(String[] args) {
     SphereForm sprn = new SphereForm();
 }
}

