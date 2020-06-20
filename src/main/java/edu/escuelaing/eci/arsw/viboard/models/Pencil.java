package edu.escuelaing.eci.arsw.viboard.models;

import java.awt.Color;

import javax.persistence.Entity;

@Entity
public class Pencil {
	
	private int size;
	private Color color;
	private int widht;
	private int height;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
