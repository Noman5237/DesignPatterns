package decorator.starbuzz;

import decorator.starbuzz.beverage.Beverage;
import decorator.starbuzz.beverage.DarkRoast;
import decorator.starbuzz.beverage.Espresso;
import decorator.starbuzz.beverage.HouseBlend;
import decorator.starbuzz.condiment.Mocha;
import decorator.starbuzz.condiment.Soy;
import decorator.starbuzz.condiment.Whip;

public class StarBuzz {
	
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso);
		
		Beverage darkRoastedMochaWithWhip = new Whip(new Mocha(new DarkRoast()));
		System.out.println(darkRoastedMochaWithWhip);
		
		Beverage doubleMochaSoyLatteWithWhip = new Whip(new Mocha(new Mocha(new Soy(new HouseBlend()))));
		System.out.println(doubleMochaSoyLatteWithWhip);
	}
}
