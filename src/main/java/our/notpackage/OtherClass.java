package our.notpackage;

import our.Xdf;

public class OtherClass {

    public static void main(String[] args) {
        new Xdf();
        int count = Xdf.count;
        if (count == 0)
        Xdf.main(new String[] {});
        String s = NotClass.field;
    }
}
