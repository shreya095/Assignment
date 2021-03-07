class geometryshapes
{
	private String name;
	geometryshapes()
	{
		
		
	}
	void draw()
	{
		System.out.println("Geometry Shapes");
		System.out.println("Draw a Shape");
	}
	void shapename(String name) {
		this.name=name;
		System.out.println("Name of the shape is:"+name);
	}
	
	
}
class Square extends geometryshapes 
{
	 int side;

	int area=0;
	void area(int side)
	{
		area = side*side;
		System.out.println("area of the shape is :"+area+" metre sq.");
				
	}
	
}
class Triangle extends geometryshapes
{
	 int height;
	
	 int length;
	
	int breadth;

	
	
	int area=0;
	void area(int height,int breadth)
	{
		area = (1*height*breadth)/2;
		System.out.println("area of the shape is :"+area+" metre sq.");
	}
	
	
	
	
}
class circle extends geometryshapes{
	int r;
	
		
	int area=0;
	void area(int r)
	{
		area = (22*(r*r))/7;
		System.out.println("area of the shape is :"+area+" metre sq.");
	}
	
	
}
public class problemstatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s = new Square();
		s.draw();
		s.shapename("Square");
		s.area(34);
		System.out.println("******************");
		Triangle t = new Triangle();
		
		t.shapename("Triangle");
		t.area(12,57);
		System.out.println("******************");
		circle c = new circle();
		c.shapename("Circle");
		c.area(12);
		
		

	}

}
