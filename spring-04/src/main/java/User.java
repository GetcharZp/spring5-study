import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;
    @Autowired
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
