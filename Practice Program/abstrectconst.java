
abstract class ok {
    int id;
    String name;
    String email;
    String discription;
    int age;

    ok(int id, String name, String email, int age) {
        System.out.println(this.hashCode());
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;

    }
}

class child extends ok {
    String hello;

    child(int id, String name, String email, int age) {
        super(id, name, email, age);
    }
}

public class abstrectconst {

    public static void main(String[] args) {
        child ch = new child(1, "name", "hitesh", 20);
        System.out.println(ch);

    }
}
