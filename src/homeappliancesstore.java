public class homeappliancesstore {
    static String name;
    static String adress;
    static int a;
    public static void main(String args[]){
        name = args[0];
        adress = args[1];
        a = args[2];
        System.out.println(name);
        System.out.println(adress);
        System.out.println(a);
        if (name == null){
            System.out.println("error");
        }
        if (adress == null){
            System.out.println("error");
        }
    }
}
