public class Student {
    private String name;
    private int ghaboli = 12;
    private String family;
    private int age;

    public Student(String name, int ghaboli, String family, int age) {
        this.name = name;
        this.ghaboli = ghaboli;
        this.family = family;
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " "+ getFamily()+" "+getAge()+"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGhaboli() {
        return ghaboli;
    }

    public void setGhaboli(int ghaboli) {
        this.ghaboli = ghaboli;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
