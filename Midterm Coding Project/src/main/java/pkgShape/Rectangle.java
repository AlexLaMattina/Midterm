package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		this.iWidth=iWidth;
		this.iLength=iLength;
	}
	
	public int getiWidth(){
		if (iWidth<0)
			throw new IllegalArgumentException();
		return iWidth;
	}


	public void setiWidth(int width) {
		this.iWidth = width;
	}

	public int getiLength() {
		if (iLength<0)
			throw new IllegalArgumentException();
		return iLength;
	}

	public void setiLength(int length) {
		this.iLength = length;
	}


	
	public double area() {
		return iWidth*iLength; 
	}
	 
	public double perimeter() {
		return 2*(iWidth+iLength);
	}
	
	public int compareTo(Object rec) {
		Rectangle r = (Rectangle) rec; 
		if(this.area()<r.area())
			return -1;	
		else if (this.area()>r.area())
			return 1; 
		else 
			return 0; 
		 
	}
	
	
	
}
