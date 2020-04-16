package PROJECT.UseCaseScenarios;

import PROJECT.M4CoffeeMaker.M4Boiler;
import PROJECT.M4CoffeeMaker.M4WarmerPlate;
import PROJECT.M4CoffeeMaker.M4UserInterface;
import org.junit.Before;
import org.junit.Test;

public class TestCoffeeMaker {

    private M4UserInterface ui;
    private M4WarmerPlate hws;
    private M4Boiler cv;
    private CoffeeMakerStub api;

    @Before
    public void setup() {
        api = new CoffeeMakerStub();
        ui = new M4UserInterface(api);
        hws = new M4WarmerPlate(api);
        cv = new M4Boiler(api);
        ui.init(hws, cv);
        hws.init(ui, cv);
        cv.init(ui, hws);
    }

    private void poll() {
        ui.poll();
        hws.poll();
        cv.poll();
    }

    //start coffee maker boiler is not empty / button is pressed
    private void normalStart() {
        poll();
        api.boilerEmpty = false;
        api.buttonPressed = true;
        poll();
    }

    //normal start  = pot is not empty
    private void normalFill() {
        normalStart();
        api.potNotEmpty = true;
        poll();
    }

    //normal brew = boiler is empty
    private void normalBrew() {
        normalFill();
        api.boilerEmpty = true;
        poll();
    }

    //USE CASE 1 = PASSED
    @Test
    public void testUseCase1BrewCoffee() throws Exception {
        normalBrew(); //brew coffee
        assert (!api.boilerOn); //assert boiler is not on
        assert (api.lightOn); //turn indicator light on
        assert (api.plateOn); //turn heat on
        assert (api.valveClosed); //close valve
    }

    //USE CASE 2 = PASSED
    @Test
    public void pourCoffeeAddExtra() throws Exception {
        normalStart();
        api.potPresent = false; //lifts pot
        poll();
        assert (!api.boilerOn); //turns off plate warmer
        assert (!api.lightOn); //light off
        assert (!api.plateOn); //replace pot
        assert (!api.valveClosed); //close valve
        api.potPresent = true; //if pot is present , restart the plate
        api.potNotEmpty = false; //pot is filled
        poll();
        assert (api.boilerOn); //turn boiler on
        assert (!api.lightOn); //turn light off
        assert (!api.plateOn); //turn plate off
        assert (api.valveClosed); //valve closed
    }

    //USE CASE 3 = PASSED
    @Test
    public void pourInterruptBrewing() throws Exception {
        normalStart();
        api.potPresent = false; //lifts pot
        poll();
        assert (!api.boilerOn); //turns boiler off
        assert (!api.lightOn); //turns light off
        assert (!api.plateOn); //turns boiler off
        assert (!api.valveClosed); //open valve
        api.potPresent = true; //pot is there
        api.potNotEmpty = false; //if pot is empty returned.
        poll();
        assert (api.boilerOn); //brew process
        assert (!api.lightOn);
        assert (!api.plateOn);
        assert (api.valveClosed);
    }
}