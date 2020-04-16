package PROJECT.CoffeeMaker;

//JAE UNG KIM (COSC 419L - Project)
//REFERENCE: https://blog.naver.com/PostView.nhn?blogId=jwyoon25&logNo=221508719771&parentCategoryNo=&categoryNo=&viewDate=&isShowPopularPosts=false&from=postView
//REFERENCE: https://github.com/lvguowei/coffee-maker-case-study/blob/master/src/com/guowei/lv/component/CoffeeMakerAPI.java
//Got helps from Numerous websites.

public abstract class Boiler {
    private UserInterface ui;
    private WarmerPlate warmerPlate;
    protected boolean isBrewing;
    protected boolean isComplete;

    public Boiler() {
        isBrewing = false;
        isComplete = true;
    }

    public void init(UserInterface ui, WarmerPlate warmerPlate) {
        this.ui = ui;
        this.warmerPlate = warmerPlate;
    }

    public void start() {
        isBrewing = true;
        isComplete = false;
    }

    public void done() {
        isBrewing = false;
    }

    protected void declareComplete() {
        isComplete = true;
        ui.complete();
    }

    protected void containerAvailable() {
        warmerPlate.resume();
    }

    protected void containerUnavailable() {
        warmerPlate.pause();
    }

    public abstract boolean isReady();
}