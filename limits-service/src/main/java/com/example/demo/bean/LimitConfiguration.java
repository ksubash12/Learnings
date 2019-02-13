package com.example.demo.bean;

public class LimitConfiguration {
 private int maximum;
 private int minimim;
 
 
protected LimitConfiguration() {

}
public LimitConfiguration(int maximum, int minimim) {
	super();
	this.maximum = maximum;
	this.minimim = minimim;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public int getMinimim() {
	return minimim;
}
public void setMinimim(int minimim) {
	this.minimim = minimim;
}
 
}
