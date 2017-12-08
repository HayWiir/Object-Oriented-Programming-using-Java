package com.course.buildings;

import java.util.*;

class Building {

	float sqft;
	int stories;

	public void setFeet (float sqft) {
		this.sqft = sqft;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}

	public int getStories() {
		return stories;
	}

	public float getFeet() {
		return sqft;
	}

}

class House extends Building {

	int nBeds;
	int nBaths;
	
	public void setBed (int nBeds) {
		this.nBeds = nBeds;
	}

	public void setBath (int nBaths) {
		this.nBaths = nBaths;
	}	
	
	public int getBed () {
		return nBeds;
	}

	public int getBath () {
		return nBaths;
	}

}

class School extends Building {

	int nClass;
	String grade;
	
	void setClass (int nClass) {
		this.nClass = nClass;
	}

	void setGrade (String grade) {
		this.grade = new String(grade);
	}

	int getnClass () {
		return nClass;
	}

	String getGrade () {
		return grade;
	}
}

