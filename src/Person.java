import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final String[] cities = {"Hong Kong", "Beijing", "Shanghai", "Chongqing", "Tianjin", "Macau", "Chaohu",
            "Tokyo", "Kyoto", "Sopporo", "Osaka", "Delhi", "Mumbai", "Ahmedabad", "Thiruvananthapuram"};
    private int age = -1;
    private String address;


    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

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
            setAddress(cities[(int) (Math.random() * cities.length)]);
            System.out.println("Теперь адрес " + address);
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCities() {
        return cities;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAge(0).setSurname(this.getSurname()).setAddress(this.getAddress());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private int age = -1;
        private String address;


        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            if (age >= 0) {
                this.age = age;
                return this;
            }
            throw new IllegalArgumentException("Пожалуйста введите корректный возраст");
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            if (this.name == null || this.surname == null) {
                throw new IllegalStateException("Недостаточно данных. Пожалуйста введите имя и фамилию.");
            }


            return new Person(this);
        }
    }
}
