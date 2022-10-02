public class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private String profession;

    public Worker(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "\nname      :" + name + '\'' +
                "\nage       :" + age +
                "\nprofession:" + profession + '\'' +
                "\n-------------------------";
    }

    @Override
    public int compareTo(Worker o) {
        return o.age-this.age;
    }
}
