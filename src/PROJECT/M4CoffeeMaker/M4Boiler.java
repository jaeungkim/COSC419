package PROJECT.M4CoffeeMaker;

import PROJECT.CoffeeMaker.CoffeeMakerAPI;
import PROJECT.CoffeeMaker.Boiler;
import PROJECT.CoffeeMaker.Pollable;

public class M4Boiler extends Boiler implements Pollable {

    private CoffeeMakerAPI api;
    private int lastPotStatus;

    public M4Boiler(CoffeeMakerAPI api) {
        this.api = api;
        lastPotStatus = api.POT_EMPTY;
    }

    @Override
    public void poll() {
        int potStatus = api.getWarmerPlateStatus();
        if (potStatus != lastPotStatus) {
            if (isBrewing) {
                handleBrewingEvent(potStatus);
            } else if (!isComplete) {
                handleIncompleteEvent(potStatus);
            }
            lastPotStatus = potStatus;
        }
    }

    @Override
    public boolean isReady() {
        int plateStatus = api.getWarmerPlateStatus();
        return plateStatus == api.POT_EMPTY;
    }

    private void handleBrewingEvent(int potStatus) {
        if (potStatus == api.POT_NOT_EMPTY) {
            containerAvailable();
            api.setWarmerState(api.WARMER_ON);
        } else if (potStatus == api.WARMER_EMPTY) {
            containerUnavailable();
            api.setWarmerState(api.WARMER_OFF);
        } else {
            containerAvailable();
            api.setWarmerState(api.WARMER_OFF);
        }
    }

    private void handleIncompleteEvent(int potStatus) {
        if (potStatus == api.POT_NOT_EMPTY) {
            api.setWarmerState(api.WARMER_ON);
        } else if (potStatus == api.WARMER_EMPTY) {
            api.setWarmerState(api.WARMER_OFF);
        } else {
            api.setWarmerState(api.WARMER_OFF);
            declareComplete();
        }
    }


}
