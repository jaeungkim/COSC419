package PROJECT.CoffeeMaker;

public interface CoffeeMakerAPI {

    //JAE UNG KIM (COSC 419L - Project)
    //REFERENCE: https://blog.naver.com/PostView.nhn?blogId=jwyoon25&logNo=221508719771&parentCategoryNo=&categoryNo=&viewDate=&isShowPopularPosts=false&from=postView
    //REFERENCE: https://github.com/lvguowei/coffee-maker-case-study/blob/master/src/com/guowei/lv/component/CoffeeMakerAPI.java
    //Got helps from Numerous websites.

    //returns the status of the warmer plate sensor. Detects whether pot is empty or not
    int getWarmerPlateStatus();
    int WARMER_EMPTY = 0;
    int POT_EMPTY = 1;
    int POT_NOT_EMPTY = 2;


    //returns status of boiler, 0 if empty, 1 if not
    int getBoilerStatus();
    int BOILER_EMPTY = 0;
    int BOILER_NOT_EMPTY = 1;

    //brew button status, 0 if pushed, 1 if not
    int getBrewButtonStatus();
    int BREW_BUTTON_PUSHED = 0;
    int BREW_BUTTON_NOT_PUSHED = 1;

    //set boiler status, 0 if on, 1 if off
    void setBoilerState(int boilerStatus);
    int BOILER_ON = 0;
    int BOILER_OFF = 1;

    //set warmer status, 0 if warmer on, 1 if warmer off
    void setWarmerState(int warmerState);
    int WARMER_ON = 0;
    int WARMER_OFF = 1;

    //set indicator, 0 if on, 1 if off
    void setIndicatorState(int indicatorState);
    int INDICATOR_ON = 0;
    int INDICATOR_OFF = 1;

    //set valve status, 0 if open, 1 if closed.
    void setReliefValveState(int reliefValveState);
    int VALVE_OPEN = 0;
    int VALVE_CLOSED = 1;
}