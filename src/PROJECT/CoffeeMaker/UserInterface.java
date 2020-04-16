package PROJECT.CoffeeMaker;

public abstract class UserInterface {

    private WarmerPlate hws;
    private Boiler cv;
    protected boolean isComplete;

    public UserInterface() {
        isComplete = true;
    }

    public void init(WarmerPlate hws, Boiler cv) {
        this.hws = hws;
        this.cv = cv;
    }

    protected void startBrewing() {
        if (hws.isReady() && cv.isReady()) {
            isComplete = false;
            hws.start();
            cv.start();
        }
    }

    public void complete() {
        isComplete = true;
        completeCycle();
    }

    public abstract void done();
    public abstract void completeCycle();


}