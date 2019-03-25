package pkgShape;
import java.util.Comparator;
public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int depth) {
		super(iWidth, iLength);
		this.iDepth=depth;
		
	}

	public int getiDepth() {
		if (iDepth<0)
			throw new IllegalArgumentException();
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	public double volume() {
		return super.area()*iDepth;
	}
	@Override
	public double area() {
		return 2*(super.area()+super.getiLength()*iDepth+iDepth*super.getiWidth());
	}
	@Override 
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	
	public int compareTo(Object cube) {
		Cuboid c = (Cuboid) cube; 
		if(this.area()<c.area())
			return -1;	
		else if (this.area()>c.area())
			return 1; 
		else 
			return 0; 
		
	}
	public static class SortByArea implements Comparator<Cuboid> {
		public SortByArea(){
			super();
		}
		public int compare(Cuboid a, Cuboid b) {
			return a.compareTo(b);		
		}
		 
	}
	public static class SortByVolume implements Comparator<Cuboid> {	
		public SortByVolume(){
			super();
		}
		public int compare(Cuboid a, Cuboid b) {
			if(a.volume()<b.volume())
				return -1;	
			else if (a.volume()>b.volume())
				return 1; 
			else 
				return 0; 
		}
		
	}
		
}
