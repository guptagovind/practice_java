public class Main {
    /* 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.

        The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.

        In case the radius parameter is less than 0 it needs to set the radius field value to 0.

        Write the following methods (instance methods):
        * Method named getRadius without any parameters, it needs to return the value of radius field.
        * Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.


        2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.

        The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.

        In case the height parameter is less than 0 it needs to set the height field value to 0.

        Write the following methods (instance methods):
        * Method named getHeight without any parameters, it needs to return the value of height field.
        * Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.



        TEST EXAMPLE

        → TEST CODE:

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        → OUTPUT

        circle.radius= 3.75
        circle.area= 44.178646691106465
        cylinder.radius= 5.55
        cylinder.height= 7.25
        cylinder.area= 96.76890771219959
        cylinder.volume= 701.574580913447


        NOTE: All methods should be defined as public NOT public static.

        NOTE: In total, you have to write 2 classes.

        NOTE: Do not add a main method to the solution code.*/

    /*The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.


            1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.

    The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.

    In case the width parameter is less than 0 it needs to set the width field value to 0.

    In case the length parameter is less than 0 it needs to set the length field value to 0.

    Write the following methods (instance methods):
            * Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getLength without any parameters, it needs to return the value of length field.
* Method named getArea without any parameters, it needs to return the calculated area (width * length).


            2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.

    The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.

            In case the height parameter is less than 0 it needs to set the height field value to 0.

    Write the following methods (instance methods):
            * Method named getHeight without any parameters, it needs to return the value of height field.
* Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.



    TEST EXAMPLE

→ TEST CODE:

    Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());
    Cuboid cuboid = new Cuboid(5,10,5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());

→ OUTPUT

    rectangle.width= 5.0
    rectangle.length= 10.0
    rectangle.area= 50.0
    cuboid.width= 5.0
    cuboid.length= 10.0
    cuboid.area= 50.0
    cuboid.height= 5.0
    cuboid.volume= 250.0


    NOTE: All methods should be defined as public NOT public static.

    NOTE: In total, you have to write 2 classes.

            NOTE: Do not add a main method to the solution code.*/
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
