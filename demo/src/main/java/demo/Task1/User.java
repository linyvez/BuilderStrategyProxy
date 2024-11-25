package demo.Task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@Builder @Getter @Setter @AllArgsConstructor @ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}