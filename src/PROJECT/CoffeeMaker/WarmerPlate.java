package PROJECT.CoffeeMaker;

public abstract class WarmerPlate {

    private UserInterface ui;
    private Boiler cv;
    protected boolean isBrewing;

    public WarmerPlate() {
        isBrewing = false;
    }

    public void init(UserInterface ui, Boiler cv) {
        this.ui = ui;
        this.cv = cv;
    }

    public void start() {
        isBrewing = true;
        startBrewing();
    }

    public void done() {
        isBrewing = false;
    }

    protected void declareDone() {
        ui.done();
        cv.done();
        isBrewing = false;
    }

    public abstract boolean isReady();
    public abstract void startBrewing();
    public abstract void pause();
    public abstract void resume();

}