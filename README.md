# Java Bakery
Hello! We are happy to bake you a custom cake for your big day! Currently we offer Birthday and Graduation cakes. Look for more cake themes in future releases.

## Environment
We use Java 8. One day, we will use Java 9.

## Building
We use maven as our build tool
To run tests and package the jar:

`mvn clean package`

To just run tests:

`mvn test`

To build for the impatient:

`mvn -DskipTests clean package`

## Running the Bakery
You've tested and built, time to open for business!

`java -jar target/JavaBakery.jar`

You will be asked to specify the cake recipient and theme, then we will get to baking it!

```
$ java -jar target/JavaBakery.jar 
Welcome to the Java Bakery!
~~~~~~
Enter cake recipient's name: Guy Cakeater
Enter cake type (Graduation = 1, Birthday = 2): 1
Baking..........
Ding! Baking done.

Your cake is now ready, admire it!
Its a bakery.cake.GraduationCake that has icing with message="Congratulations Guy Cakeater!", and color=Black!

~~~~~~
Thanks for visiting, the bakery is now closed!
```


## Code structure
For maximum flexibility, we favor composition over inheritance. A `BirthdayCake` implements `Cakeable`, which in turn extends `Bakeable`, `Consumable`, and `Iced`.

This will allow us to easily add new items in the future, such as a `Bagel` (implements `Bakeable` and `Consumable`, but not `Iced`) or a GlazedDonut (implements `Consumable` and `Iced` but not `Bakeable`. Because donuts are fried, right?)

## Documentation
This is it! The code itself is *"self-documenting"*