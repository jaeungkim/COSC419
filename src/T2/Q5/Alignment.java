package T2.Q5;

public class Alignment extends LoadDisk2Align {
    public double angle = 0.02;
    public String checkOffset(){
        return "Stage off check = " + angle;
    }
    public double getAngle(){
        return angle;
    }
}
