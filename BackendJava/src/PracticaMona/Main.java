package PracticaMona;

public class Main {
    public static void main(String[] args) {
        Bouncer b = new Bouncer("2","1","4");
        Jenktocat j = new Jenktocat("2","1","5");
        OkalEltocat e = new OkalEltocat("2","1","5");
        SaintNicktocat sn = new SaintNicktocat("2","1","5");
        Scarletteocat s = new Scarletteocat("2","1","5");
        Supportcat sc = new Supportcat("2","1","5");
        System.out.println(b.toString());
        System.out.println(j.toString());
        System.out.println(e.toString());
        System.out.println(sn.toString());
        System.out.println(s.toString());
        System.out.println(sc.toString());
    }
}
