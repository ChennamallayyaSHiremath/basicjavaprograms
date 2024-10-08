package com.chenna.basic.serializationdeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationDemo implements Serializable {

	public static void main(String[] args) {
		
		Team team=new Team("Tejashwini", 90);
		//Team team2=new Team("Viraj", 99);
		
		try (FileOutputStream fileOut = new FileOutputStream("team.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

	            // Serialize the object
	            out.writeObject(team);
	            System.out.println("Team object serialized and saved as team.ser");

	        } catch (IOException i) {
	            i.printStackTrace();
	        }

	}

}
