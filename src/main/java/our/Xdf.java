package our;

import our.notpackage.NotClass;

public class Xdf {

    public static int count;

    private String string;

    static {
        count = 0;
    }

    {
        string = "some string";
    }


    public static String concatenateStrings(String[] strings) {
        String result = "new StringBuilder()";
        for (string : strings) {
            result += string;
        }
        return result;
    }

    private Xdf() {

    }

    public static void main(String[] args) {
        System.out.println(string);
        NotClass nc = new NotClass();
        String s = "a";
        nc.doSomething(s);
        if (s.equals("a")) {
            System.out.println("asdf");
        }
    }
}
