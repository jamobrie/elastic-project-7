import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testStaticVariables() {
        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");
        new Car("abc", "111");
        new Car("xxx", "222");
        new Car("zzz", "333");
        Car.diesel = "breakStaticValue";

        assertEquals(5, Car.numberOfCars);

        assertEquals("breakStaticValue", Car.diesel);
        assertEquals("petrol", Car.petrol);
    }

    //When to use:
//    When the value of variable is independent of objects
//    When the value is supposed to be shared across all objects

// Points to note
//    Since static variables belong to a class, they can be accessed directly using class name and don't need any object reference
//    static variables can only be declared at the class level
//    static fields can be accessed without object initialization
//    Although we can access static fields using an object reference (like ford.numberOfCars++) , we should refrain from using it as in this case it becomes difficult to figure whether it’s an instance variable or a class variable; instead, we should always refer to static variables using class name (for example, in this case, Car.numberOfCars++)


    @Test
    public void testStaticMethods() {
        Car.setNumberOfCars(22);
        assertEquals(22, Car.numberOfCars);

        assertEquals(16, Car.setNumberOfParts());
    }

    //    static methods are also widely used to create utility or helper classes so that they can be obtained without creating a new object of these classes.
//To access/manipulate static variables and other static methods that don't depend upon objects
//static methods are widely used in utility and helper classes

    @Test
    public void testStaticBlocks() {
        assertEquals("Lieutenant", Car.ranks.get(0));
        assertEquals("Captain", Car.ranks.get(1));
        assertEquals("Major", Car.ranks.get(2));
        assertEquals("Colonel", Car.ranks.get(3));
        assertEquals("General", Car.ranks.get(4));
    }

//    If initialization of static variables requires some additional logic except the assignment
//If the initialization of static variables is error-prone and requires exception handling

}
