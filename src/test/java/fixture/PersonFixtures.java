package fixture;

import persistence.model.Person;

public class PersonFixtures {
    public static Person createPerson() {
        return new Person(
                "yohan",
                31,
                "yohan@google.com",
                1
        );
    }

    public static PersonV3 createPersonV3() {
        return new PersonV3(
                1L,
                "yohan",
                31,
                "yohan@google.com",
                1
        );
    }
}
