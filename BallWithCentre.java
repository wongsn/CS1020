import java.awt.*;

class BallWithCentre {
	private static int quantity=0;
	private Point centre;
	private double radius;
	private String colour;

	//Constructors

	public BallWithCentre() {

		this("yellow", 10.0, 0, 0); 
	}

	public BallWithCentre(String colour, double radius, int x, int y){
		setCol(colour);
		setRad(radius);
		centre = new Point(x, y);
		quantity++;
	}

	//Accessors
	public static int getQuantity(){
		return quantity;
	}

	public double getRad() {
		return radius;
	}

	public String getCol(){
		return colour;
	}

	public Point getCentre(){
		return centre;
	}
	
	//Mutators
	public void setCol(String nextCol) {
		this.colour = nextCol;
	}

	public void setRad(double nextRad) {
		this.radius = nextRad;
	}


	//Overriding Methods
	public String toString(){
		return "[colour=" + getCol() + ", radius=" + 
			getRad() + ", centre=" + "(" + (int) getCentre().getX() + "," + (int) getCentre().getY() + ")" + "]";

	}

	public boolean equals(Object that) {
		if(that instanceof BallWithCentre){
			BallWithCentre ball = (BallWithCentre) that;
			return this.getCol().equals(ball.getCol()) && this.getRad() == ball.getRad() && this.getCentre().equals(ball.getCentre());
		} else 
			return false;
	}

}
