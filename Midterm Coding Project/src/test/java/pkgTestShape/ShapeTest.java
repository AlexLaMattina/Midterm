package pkgTestShape;
import static org.junit.Assert.*;
import org.junit.*;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

public class ShapeTest{
	@Test
	public void ConstructerTest(){
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);
		double length = r.getiLength();
		double width = r.getiWidth();
		assertTrue(length == 5);
		assertTrue(width == 4);
		assertFalse(length==6);
	}
	
	@Test 
	public void SetGetTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);
		r.setiLength(5);
		r.setiWidth(4);
		assertTrue(r.getiLength()==5);
		assertTrue(r.getiWidth()==4);
		
	}
	@Test
	public void Areatest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);
		assertTrue(r.area()==20);
	}
	@Test
	public void PerimTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(4,5);
		assertTrue(r.perimeter()==18);	
	}
	@Test
	public void compareToTest() {
		pkgShape.Rectangle a = new pkgShape.Rectangle(4,5);
		pkgShape.Rectangle b = new pkgShape.Rectangle(2,5);
		assertTrue(a.compareTo(b)== 1); 
		assertTrue(b.compareTo(a)== -1); 


	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ExceptionTest() {
		pkgShape.Rectangle r = new pkgShape.Rectangle(-1,-4);
		
		r.getiWidth();
		r.getiLength();
		
	}

	@Test
	public void CuboidConstructerTest(){
		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);
		double depth = c.getiDepth();
		double length = c.getiLength();
		double width = c.getiWidth();
		assertTrue(depth == 3);
		assertTrue(length == 2);
		assertTrue(width == 1);
		
	}
	@Test
	public void GetSetTest() {
		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);
		c.setiLength(1);
		c.setiWidth(2);
		c.setiDepth(3);
		assertTrue(c.getiLength()==1);
		assertTrue(c.getiWidth()==2);
		assertTrue(c.getiDepth()==3);
	}
	@Test
	public void CuboidAreatest() {
		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);
		assertTrue(c.area()==22);
		
	}
	@Test(expected = UnsupportedOperationException.class)
	public void CuboidPerimTest() {
		pkgShape.Cuboid c = new pkgShape.Cuboid(1,2,3);
		c.perimeter();
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void CuboidExceptionTest() {
		pkgShape.Cuboid c = new pkgShape.Cuboid(5,5,-7);
		c.getiDepth();
	}
	private final SortByArea SortByArea = new SortByArea();
	@Test
	public void SortByAreaTest(){
		pkgShape.Cuboid a = new pkgShape.Cuboid(5,5,7);
		pkgShape.Cuboid  b = new pkgShape.Cuboid(5,5,4);
		
		int result = SortByArea.compare(a,b);
		assertTrue(result == 1);
	}
	private final SortByVolume SortByVolume = new SortByVolume();
	@Test
	public void SortByVolumeTest() {
		pkgShape.Cuboid a = new pkgShape.Cuboid(5,5,7);
		pkgShape.Cuboid  b = new pkgShape.Cuboid(5,5,4);	
		int result = SortByVolume.compare(a,b);
		assertTrue(result == 1);
		
		
	}

	

}
	
	
