package decorator.starbuzz;

import decorator.starbuzz.beverage.*;
import decorator.starbuzz.condiment.Mocha;
import decorator.starbuzz.condiment.Soy;
import decorator.starbuzz.condiment.Whip;

public class StarBuzz {
	
	public static void main(String[] args) {
		Beverage espresso = new Espresso(Size.MEDIUM);
		System.out.println(espresso);
		
		Beverage darkRoastedMochaWithWhip = new Whip(new Mocha(new DarkRoast(Size.SMALL)));
		System.out.println(darkRoastedMochaWithWhip);
		
		Beverage doubleMochaSoyLatteWithWhip = new Whip(new Mocha(new Mocha(new Soy(new HouseBlend(Size.LARGE)))));
		System.out.println(doubleMochaSoyLatteWithWhip);
	}
}
