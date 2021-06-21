public abstract class GeometricObject {
	protected String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	protected void GeomtetricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected void GeomtectricObject (String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
		public String getColor() {
			return color;
		}
		
		
		public String setColor(String color) {
			return this.color = color;
		}
		
		public boolean isFilled() {
			return filled;
		}
	
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		
		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color + 
					" and filled: " + filled;
		}
		
		public abstract double getArea();
		
		public abstract double getPerimiter();
}
