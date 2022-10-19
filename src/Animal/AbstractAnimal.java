package Animal;

public abstract class AbstractAnimal {
    private int weight;
    private int age;
    private String gender;
    private String nichName;

    public AbstractAnimal(int weight, int age, String gender, String nichName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nichName = nichName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNichName() {
        return nichName;
    }

    public void setNichName(String nichName) {
        this.nichName = nichName;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nichName='" + nichName + '\'' +
                '}';
    }
}
