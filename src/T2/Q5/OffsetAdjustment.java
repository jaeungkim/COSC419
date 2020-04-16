package T2.Q5;

public class OffsetAdjustment extends LoadDisk2Align{
    public String rotate(){
        Alignment a1 = new Alignment();
        return "rotate stage by " + a1.getAngle() + " degree";
    }
}
