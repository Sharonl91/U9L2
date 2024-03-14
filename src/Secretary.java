public class Secretary extends Club{
    public int members;
    public Secretary(String n, int a, int m){
        super(n,a);
        members = m;
    }

    public int getMembers() {
        return members;
    }
    public void countMembers(){
        System.out.println("There are " + getMembers() + "members in this club.");
    }
}
