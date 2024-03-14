public class Main {
    public static void main(String[] args) {
        Club c =  new Club("SGO",10);
        System.out.println(c.getName());
        System.out.println(c.getAge());

        Secretary s = new Secretary("BTHS", 20, 34);
        System.out.println(s.getMembers());
        s.countMembers();

        Treasury t = new Treasury("NYC", 14, 88765);
        System.out.println(t.getMoney());
        t.countMoney();
    }
}