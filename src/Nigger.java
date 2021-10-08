public class Nigger {
    String FNT;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Nigger(String FNT,
            String position,
            String email,
            String phone,
            int salary,
            int age){
        this.FNT = FNT;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void PrintData(){
        System.out.println(this.FNT + " " + this.position + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
    }
}
