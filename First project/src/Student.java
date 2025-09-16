public class Student{
    String name;
    int id;
    //the constructor//
    Student(int id, String name, String email){
        this.id =id;
        this.name =name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "ID: " + id + ", Name:" + name;
    }
}