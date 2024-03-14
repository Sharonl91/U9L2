public class Treasury extends Club{
    private int money;
    public Treasury(String n, int a, int m){
        super(n,a);
        money = m;
    }

    public int getMoney() {
        return money;
    }

    public void countMoney() {
        System.out.println("This club currently has " + money + " dollars.");;
    }
}
