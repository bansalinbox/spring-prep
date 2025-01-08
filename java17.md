1) **Var** introduced in java 10
2) **Record** introduced in java 14

    Primarily used for representing data as a collection of values.
    Java complier implement the equals, hascode and tostring method.You do not need to apply them.
    Filed variable a record level can be declared abut it must be static type.
    Like enum, it can’t extend or be extended by other classes, but it can implement an interface and have static fields and methods.
3) **Extended Switch Expression**
   Even more can be achieved with the new yield keyword that allows returning a value from inside a code block. 
   It’s virtually a return that works from inside a case block and sets that value as a result of its switch.
   DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
   boolean freeDay = switch (dayOfWeek) {
   case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
   System.out.println("Work work work");
   yield false;
   }
   case SATURDAY, SUNDAY -> {
   System.out.println("Yey, a free day!");
   yield true;
   }
   };
4) Instanceof pattern matching
   Java can now create a local variable inside the if, like this:

   if (obj instanceof MyObject myObject && myObject.isValid()) {
   // … the same logic
   }
5) **Better NullPointerExceptions**
   company.getOwner().getAddress().getCity();
    Yes, it was that line. Without a debugger I couldn’t tell which object was null, or rather, which invoke operation has actually caused the problem. Now the message will be specific and it’ll tell us that the JVM “cannot invoke Person.getAddress()”.Actually, this is more of a JVM change than a Java one – as the bytecode analysis to build the detailed message is performed at runtime JVM – but it does appeal to programmers a lot.
6) **New Optional.orElseThrow() method**
   MyObject myObject = myList.stream()
   .filter(MyObject::someBoolean)
   .filter((b) -> false)
   .findFirst()
   .orElseThrow();
7) **New HttpClient**
   There are many libraries that do the same thing, but it is nice to have a proper HTTP client in Java itself