package main;
import java.io.*;
import java.util.ArrayList;

import dataclasses.*;


/*
 * Ask user to enter entities.  Give user a form to fill, in which he can add entity name and 
 * attributes associated with the entry name
 * start with command line
 */

public class AlphaLite {

	//this is the main class to drive the program
	
	public static ArrayList<Attribute> attributes;
	
	
	public static void main(String[] args) {
		
		receiveUserFeedback();
	
		
	}
	
	private static void receiveUserFeedback() {
		
		//get the entity name
		
		Entity theEntity = new Entity();
		
		System.out.print("Enter the entity name: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		String line = null;
		
		try {
			line = br.readLine();
			theEntity.setName(line);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("Enter attribute name: ");
			
			try {
				br = new BufferedReader(new InputStreamReader(System.in) );
				line = br.readLine();
				System.out.println(line);
				if (line.startsWith("no"))
					break;
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
