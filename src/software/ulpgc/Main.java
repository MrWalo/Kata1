package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(new Person("Pepito", LocalDate.of(2002,12,23))));
    }
}
