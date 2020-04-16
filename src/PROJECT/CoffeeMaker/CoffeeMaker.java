package PROJECT.CoffeeMaker;

//JAE UNG KIM (COSC 419L - Project)
//REFERENCE: https://blog.naver.com/PostView.nhn?blogId=jwyoon25&logNo=221508719771&parentCategoryNo=&categoryNo=&viewDate=&isShowPopularPosts=false&from=postView
//REFERENCE: https://github.com/lvguowei/coffee-maker-case-study/blob/master/src/com/guowei/lv/component/CoffeeMakerAPI.java
//Got helps from Numerous websites.

import PROJECT.M4CoffeeMaker.M4CoffeeMakerApiImplementation;
import PROJECT.M4CoffeeMaker.M4Boiler;
import PROJECT.M4CoffeeMaker.M4WarmerPlate;
import PROJECT.M4CoffeeMaker.M4UserInterface;

public class CoffeeMaker {

    public static void main(String[] args) {
        CoffeeMakerAPI api = new M4CoffeeMakerApiImplementation();

        M4UserInterface ui = new M4UserInterface(api);
        M4WarmerPlate hws = new M4WarmerPlate(api);
        M4Boiler cv = new M4Boiler(api);

        ui.init(hws, cv);
        hws.init(ui, cv);
        cv.init(ui, hws);

        while (true) {
            ui.poll();
            hws.poll();
            cv.poll();
        }


    }
}