public class Cat {
    String name;
    String color;


    Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    Cat(String name){
        this(name,  "Зеленый");
    }
    void voice(){
        System.out.println("Мяу " + name);
    }
    void voice(int loud){
        System.out.println(this.name + " мяукнул с громкостью " + loud);
    }
    void scream(String cat){
        System.out.println(this.name + " шипит на " + cat);
    }


}
