package Assignment4.Q1;

// JAE UNG KIM - 37007135 COSC 419L A4


class Meal {

	private String drink;
	private String mainCourse;
	private String side;

	public Meal() {
		
	}
	public Meal(String d, String m, String s) {
		this.drink = d;
		this.mainCourse = m;
		this.side = s;
		
	}
	
	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String toString() {
		return "\ndrink:" + drink + ",\nmain course:" + mainCourse + ",\nside:" + side;
	}

}

/*
 * MealBuilder
 * 
 */

interface MealBuilder {
	public void buildDrink();
	public void buildMainCourse();
	public void buildSide();
	public Meal getMeal();
}

/*
 * ItalianMealBuilder
 * 
 */
class ItalianMealBuilder implements MealBuilder {
	private Meal meal;
	public ItalianMealBuilder() {
		meal = new Meal();
	}
	@Override
	public void buildDrink() {
		meal.setDrink("red wine");
	}
	@Override
	public void buildMainCourse() {
		meal.setMainCourse("pizza");
	}
	@Override
	public void buildSide() {
		meal.setSide("bread");
	}
	@Override
	public Meal getMeal() {
		return meal;
	}
}

class JapaneseMealBuilder implements MealBuilder {
	private Meal meal;
	public JapaneseMealBuilder() {
		meal = new Meal();
	}
	@Override
	public void buildDrink() {
		meal.setDrink("sake");
	}
	@Override
	public void buildMainCourse() {
		meal.setMainCourse("chicken teriyaki");
	}
	@Override
	public void buildSide() {
		meal.setSide("miso soup");
	}
	@Override
	public Meal getMeal() {
		return meal;
	}
}

//For this question, add a Canadian Meal with your favorite drink, main course, and side to the program and update UML diagram accordingly.
class CanadianMealBuilder implements MealBuilder {
	private Meal meal;
	public CanadianMealBuilder(){ meal = new Meal(); }
	@Override
	public void buildDrink() {
		meal.setDrink("A&W Root Beer");
	}
	@Override
	public void buildMainCourse() {
		meal.setMainCourse("montreal-style smoked meat");
	}
	@Override
	public void buildSide() {
		meal.setSide("poutine");
	}
	@Override
	public Meal getMeal() {
		return meal;
	}
}

class MealDirector {

	private MealBuilder mealBuilder = null;
	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	public void constructMeal() {
		mealBuilder.buildDrink();
		mealBuilder.buildMainCourse();
	 	mealBuilder.buildSide();
	}
	public Meal getMeal() {
		return mealBuilder.getMeal();
	}
}



/*
 * 
 * The MealBuilderdemo class demonstrates the builder Pattern operation.
 * 		First, the director builds an Italian meal. 
 * 			An ItalianMealBuilder is passed to the MealDirector's constructor. 
 * 			The meal is constructed via mealDirector.constructMeal(). 
 * 			The meal is obtained from mealDirector via mealDirector.getMeal(). 
 * 			The Italian meal is displayed. 
 * 		After this, we perform the same process to build and display a Japanese meal. 
 * 
 */

public class MealBuilderdemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new ItalianMealBuilder();
		MealDirector mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		Meal meal = mealDirector.getMeal();
		System.out.println(" Italian Meal : " + meal);
//------------------	
		mealBuilder = new JapaneseMealBuilder();
		mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getMeal();
		System.out.println(" Japanese Meal: " + meal);

		//Candian
		mealBuilder = new CanadianMealBuilder();
		mealDirector = new MealDirector(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getMeal();
		System.out.println(" Candian Meal: " + meal);
	}
}
