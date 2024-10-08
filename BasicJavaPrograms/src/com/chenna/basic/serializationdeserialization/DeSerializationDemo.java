package com.chenna.basic.serializationdeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team team = null;
		try (FileInputStream fis=new FileInputStream("team.ser"); 
				ObjectInputStream ous=new ObjectInputStream(fis)){
			
			team=(Team) ous.readObject();
			//System.out.println(ous.readAllBytes());
			System.out.println("Team Name: " + team.teamName);
	        System.out.println("Team Points: " + team.points);
		} catch (Exception e) {
			// TODO: handle exception
			e.getLocalizedMessage();
		}

//		 Team team = null;
//
//	        try (FileInputStream fileIn = new FileInputStream("team2.ser");
//	             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//
//	            // Deserialize the object
//	            team = (Team) in.readObject();
//	            System.out.println("Team Name: " + team.teamName);
//	            System.out.println("Team Points: " + team.points);
//
//	        } catch (IOException | ClassNotFoundException i) {
//	            i.printStackTrace();
//	        }
		
	}

}
