package T2.Q5;

public class LoadDisk2Align {
    public void LoadDisk(){
        System.out.println("Order number WaferID: 1234");
        System.out.println("Start Wafer Alignment");
        OffsetAdjustment test2 = new OffsetAdjustment();
        Alignment a1 = new Alignment();

        System.out.println(a1.checkOffset());
        System.out.println(test2.rotate());
    }

}
