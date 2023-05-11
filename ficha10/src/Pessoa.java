public class Pessoa {

    private String name;
    private int age;
    private String email;
    private int phone;

    public Pessoa(String name, int age, String email, int phone){
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
