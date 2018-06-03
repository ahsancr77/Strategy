package factorypack;

public class TestFactory {

	public static void main(String[] args) {
	FactoryShape fac=new FactoryShape();
	Shape s1=fac.createShape("Circle");
	s1.draw();
	Shape s2=fac.createShape("Rectangle");
			s2.draw();
	}

}
