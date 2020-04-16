package PROJECT.M4CoffeeMaker;

import PROJECT.CoffeeMaker.CoffeeMakerAPI;

public class M4CoffeeMakerApiImplementation implements CoffeeMakerAPI {

    @Override
    public int getWarmerPlateStatus() {
        return 0;
    }

    @Override
    public int getBoilerStatus() {
        return 0;
    }

    @Override
    public int getBrewButtonStatus() {
        return 0;
    }

    @Override
    public void setBoilerState(int boilerStatus) {

    }

    @Override
    public void setWarmerState(int warmerState) {

    }

    @Override
    public void setIndicatorState(int indicatorState) {

    }

    @Override
    public void setReliefValveState(int reliefValveState) {

    }
}
