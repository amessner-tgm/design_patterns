package path.design.test;

import path.design.decorator.BasicCar;
import path.design.decorator.Car;
import path.design.decorator.LuxuryCar;
import path.design.decorator.SportsCar;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
