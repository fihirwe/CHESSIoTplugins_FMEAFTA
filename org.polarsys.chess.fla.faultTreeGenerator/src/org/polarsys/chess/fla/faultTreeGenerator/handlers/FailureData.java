package org.polarsys.chess.fla.faultTreeGenerator.handlers;

public class FailureData {

	private String name;
	private double probability;
	private String description;
	public FailureData(String name, double probability, String description) {
		super();
		this.name = name;
		this.probability = probability;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(double probability) {
		this.probability = probability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "FailureData [name=" + name + ", probability=" + probability + ", description=" + description + "]";
	}
	
}
