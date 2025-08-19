package main_study.the_08_14;

public class Members {

    public  String name;
    public  int age;

    Members(String name, int age) {
        this.name = name;
        this.age = age;
    }

        @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj instanceof Members target){
       return  target.name.equals(name) && (target.age==age) ;

    }
    return false;
    }




    }


