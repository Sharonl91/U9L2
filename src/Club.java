public class Club {
    private String name;
    private int age;
    public Club(String n, int a){
        this.name = n;
        this.age = a;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void meet(){
        System.out.println(name + " has a meeting today!");
    }
}
