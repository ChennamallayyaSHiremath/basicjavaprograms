package com.chenna.basic.serializationdeserialization;

import java.io.Serializable;

public class Team implements Serializable{
	
	String teamName;
	int points;
	
	public Team(String teamName,int points) {
		this.teamName=teamName;
		this.points=points;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public int getPoints() {
		return points;
	}

}
