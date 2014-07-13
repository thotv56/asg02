package oop.examples;

public class Vector {
	int x;
	int y;
	
	public Vector(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	public String toString() {
		String result = "(" + x + "," + y + ")";
		return result;
	}
	
	public Vector add(Vector other) {
		Vector sum = new Vector(x + other.x , 
								y + other.y );
		return sum;
	}
	
	public boolean equals(Object other) {
		Vector v = (Vector)other;
		return (x == v.x && y == v.y);
	}
}