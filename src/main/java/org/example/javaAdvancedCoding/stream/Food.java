package org.example.javaAdvancedCoding.stream;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"weight"})
public class Food {
    private String name;
    private Type type;
    private int weight;

    public Food(String name) {
        this.name = name;
        type = name.equals("chicken") ? Type.MEAT : Type.FRUIT;
    }


    enum Type {
        FRUIT,
        MEAT
    }
}
