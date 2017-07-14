package com.tourismcoachbd.kuakatatravelguide;
public class Person {
	private int id;
	private String visited;
	private String cost;
	private String comment;

	public Person() {

	}

	public Person(String visited, String cost, String comment) {
		this.visited = visited;
		this.cost = cost;
		this.comment = comment;
	}

	public Person(int id, String visited, String cost, String comment) {
		this.id = id;
		this.visited = visited;
		this.cost = cost;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVisited() {
		return visited;
	}

	public void setVisited(String visited) {
		this.visited = visited;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String toString() {
		return "Visited: " + visited + "\nCost: " + cost + "\nComment: " + comment;
	}

}