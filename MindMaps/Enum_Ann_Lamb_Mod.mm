<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548447454354" ID="ID_547429987" MODIFIED="1548454850968">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ENUM , ANNOTATIONS,&#160;LAMBDAS, MODULES
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1548450498154" HGAP="31" ID="ID_1432645711" MODIFIED="1548454886628" POSITION="right" VSHIFT="137">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ENUM
    </p>
    <p>
      
    </p>
    <p>
      Special Java class
    </p>
    <p>
      
    </p>
    <p>
      public enum Level {
    </p>
    <p>
      &#160;&#160;HIGH, MEDIUM, LOW
    </p>
    <p>
      }
    </p>
    <p>
      
    </p>
    <p>
      Level level&#160;&#160;= Level.HIGH;
    </p>
    <p>
      
    </p>
    <p>
      <b>Enum Iteration </b>
    </p>
    <p>
      for(Level level: Level.values(){ }
    </p>
    <p>
      
    </p>
    <p>
      <b>Enum Fields&#160;/ Methods</b>:
    </p>
    <p>
      constructor in Enum can only be private or package scoped.
    </p>
    <p>
      public enum Level {
    </p>
    <p>
      &#160;&#160;&#160;&#160;HIGH(3), MEDIUM(2), LOW(1)<b>;</b>
    </p>
    <p>
      &#160;&#160;&#160;&#160;private level int levelCode;
    </p>
    <p>
      &#160;&#160;&#160;&#160;private Level(int levelCode) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;this.levelCode = levelCode;
    </p>
    <p>
      &#160;&#160;&#160;&#160;}
    </p>
    <p>
      &#160;&#160;&#160;
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;public int getLevelCode() { return this.levelCode;}
    </p>
    <p>
      }
    </p>
    <p>
      
    </p>
    <p>
      Level level = Level.HIGH; level.getLevelCode() will be 3.
    </p>
    <p>
      
    </p>
    <p>
      Java enum class can have abstract methods too.
    </p>
    <p>
      All instances of enum class must implement that abstract method.
    </p>
    <p>
      Java enum class can implement interfaces.
    </p>
    <p>
      Java enum can not extend any class since it already extends java.lang.Enum class.
    </p>
    <p>
      
    </p>
    <p>
      EnumSet and EnumMap to hold enums.
    </p>
    <p>
      EnumSet&lt;Level&gt; enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
    </p>
    <p>
      EnumMap&lt;Level, String&gt; enumMap = new EnumMap&lt;Level, String&gt;(Level.class);
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1548451181508" ID="ID_1069853986" MODIFIED="1548452081134" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ANNOTATIONS
    </p>
    <p>
      
    </p>
    <p>
      Used for providing&#160;&#160;Compiler, Build-time and Runtime instructions.
    </p>
    <p>
      Build tools may scan java code for annotations and generate source code or other files based on annotations.
    </p>
    <p>
      Most of the annotations does not exist in compiled code.
    </p>
    <p>
      Custom defined annotations can exist in runtime and are accessed via java reflections.
    </p>
    <p>
      
    </p>
    <p>
      @deprecated ( better to have java doc explaining why it is deprecated)
    </p>
    <p>
      @override
    </p>
    <p>
      @supresswarnings
    </p>
    <p>
      
    </p>
    <p>
      <b>Creating Annotations:</b>
    </p>
    <p>
      Annotations are defined in its own file just like classes or interfaces.
    </p>
    <p>
      
    </p>
    <p>
      @Retention(RetentionPolicy.RUNTIME)
    </p>
    <p>
      @interface MyAnnotation { String Value() default &quot;&quot;; String name(); }
    </p>
    <p>
      
    </p>
    <p>
      @MyAnnotation(name=&quot;Ravi&quot;)
    </p>
    <p>
      public class MyClass{}
    </p>
    <p>
      
    </p>
    <p>
      RetentionPolicy.CLASS .&#160;&#160;(Will be retained in .class but not in runtime)
    </p>
    <p>
      RetentionPolicy.SOURCE ( will not be avail in class; can be used for build tools)
    </p>
    <p>
      
    </p>
    <p>
      @Target({ELEMENTTYPE.METHOD})
    </p>
    <p>
      Used to specify which java elements your custom annotation can be used to annotate.
    </p>
    <p>
      
    </p>
    <p>
      ELEMENTTYPE.{METHOD/ PACKAGE/ FIELD / CONSTRUCTOR / PARAMETER / TYPE}
    </p>
    <p>
      TYPE above can be class, interface, enum or annotation.
    </p>
    <p>
      
    </p>
    <p>
      @Inherited
    </p>
    <p>
      This annotation signals that a custom java annotation used in a class should be inherited by subclasses inherting from that class.
    </p>
    <p>
      
    </p>
    <p>
      @Documented
    </p>
    <p>
      Signals javadoc tool that annotation should be visible in the javadoc.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1548452132509" HGAP="32" ID="ID_733144756" MODIFIED="1548454874680" POSITION="right" VSHIFT="16">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      LAMBDA
    </p>
    <p>
      
    </p>
    <p>
      Java lamdba expression is a function which can be created without belonging to any class.
    </p>
    <p>
      
    </p>
    <p>
      Typically used to implement simple event listeners / callbacks / java stream apis.
    </p>
    <p>
      
    </p>
    <p>
      Java lambda expressions can be used where the type they are matched against is a single unimplemented method interface (functional interfaces)
    </p>
    <p>
      Parameters and return type of single unimplemented method interface should match with lambda.
    </p>
    <p>
      
    </p>
    <p>
      Lambdas and Anonymous classes are almost similar except that Anonymous classes can have state ( member variables). A lambda can not have that fields which makes it stateless.
    </p>
    <p>
      &quot;this&quot; inside anonymous class refers to the anonymous class itself where as &quot;this&quot; inside lambda refers to enclosing object. lambdas can not have its own instance variables.
    </p>
    <p>
      
    </p>
    <p>
      (a1, a2) -&gt; { return a1&gt;a2;} . can also be written as (a1, a2) -&gt; a1 &gt; a2;
    </p>
    <p>
      
    </p>
    <p>
      A java lambda expression is essentially an object.
    </p>
    <p>
      public interface MyComparator {
    </p>
    <p>
      &#160;&#160;public boolean compare(int a1, int a2);
    </p>
    <p>
      }
    </p>
    <p>
      
    </p>
    <p>
      MyComparator comp = (a1, a2) -&gt; { return a1&gt;a2};
    </p>
    <p>
      comp.compare(a1, a2);
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      Local variables can be captured if and only if they are final or effectively final ( String val = &quot;abc&quot;;)
    </p>
    <p>
      Static variables from enclosing class are also accessible from lambda.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      Method References as Lambda:
    </p>
    <p>
      
    </p>
    <p>
      If lambda has single sentence like &quot;System.out.println(var);&quot; then this can be replaced by simply:
    </p>
    <p>
      System.out::println
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1548454856027" ID="ID_1172307669" MODIFIED="1548455021194" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      MODULES
    </p>
    <p>
      
    </p>
    <p>
      Package Java application and packages into Java modules.
    </p>
    <p>
      It specifies which packages should be visible to other modules using this module.
    </p>
    <p>
      It also should specify which other modules are needed to run this module.
    </p>
    <p>
      Also referred as Java JigSaw or Project JigSaw.
    </p>
    <p>
      Helps reduce the size of the distribution jar.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
