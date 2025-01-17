package software.ulpgc;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        return toYear((int) LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYear(long days) {
        return (int)(days/365);
    }

    @Override
    public String toString() {
        return "La persona se llama " + name + " y tiene " + getAge() + " años porque nació el " + birthday;
    }
}
