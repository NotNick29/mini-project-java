import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.*;
import java.awt.event.*;

import java.awt.*;

import javax.sql.rowset.serial.SerialRef;
import javax.swing.*;
import javax.swing.Timer;

import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the difficulty \n 1.EASY \n 2.difficult \n 3.very difficult");
	    int x = src.nextInt();
		switch(x){
		case 1:
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600);

		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
        obj.setVisible(true);
		break;
		case 2:
		Gameplay1 gamePlay1 = new Gameplay1();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay1);
        obj.setVisible(true);
        case 3:
		Gameplay2 gamePlay2 = new Gameplay2();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay2);
        obj.setVisible(true);
		break;
		}
	}

}
