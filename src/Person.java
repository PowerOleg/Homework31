import java.util.Random;

public class Person {
    private final String name;
    private final String surname;
    private int age = -1;
    private String address;

    private final String[] cities = {"Hong Kong", "Beijing", "Shanghai", "Chongqing", "Tianjin", "Macau", "Chaohu", "Tokyo", "Kyoto",
            "Sopporo", "Osaka", "Delhi", "Mumbai", "Ahmedabad", "Thiruvananthapuram"};




    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        if (!address.isEmpty()) {
            return true;
        } else {
            System.out.println("Адрес был не известен");
            setAddress(cities[(int) (Math.random()*cities.length)]);
            System.out.println("Теперь адрес "+address);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String[] getCities() {
        return cities;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
