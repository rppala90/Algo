<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1551217348983" ID="ID_1497446" MODIFIED="1551636323313" TEXT="Object Oriented Design Interview">
<node CREATED="1551217387534" HGAP="13" ID="ID_1038262754" MODIFIED="1551222339492" POSITION="right" VSHIFT="16">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Encapsulation&#160;&#160;&#160;&#160;--&gt;&#160;&#160;&#160;&#160;Binding data together and hiding it from outside world.
    </p>
    <p>
      Abstraction&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;&#160;&#160;&#160;&#160;Hiding internal implementation and only revealing operations that are relevant to other objects.
    </p>
    <p>
      Inheritance&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;&#160;&#160;&#160;Subclass, Interfaces.
    </p>
    <p>
      Polymorphism&#160;&#160;&#160;--&gt;&#160;&#160;&#160;Overloading and Overriding methods.
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551217542275" HGAP="34" ID="ID_545398759" MODIFIED="1551221750245" POSITION="left" VSHIFT="241">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Analyzing and Designing a System :
    </p>
    <ol>
      <li>
        Identifying the objects in a system.
      </li>
      <li>
        Defining relationships between objects.
      </li>
      <li>
        Establishing the interface of each objects; and
      </li>
      <li>
        Making a design, which can be converted to executables using OO language.
      </li>
    </ol>
    <p>
      Benefits of using UML (Unified Modeling Language) :
    </p>
    <ol>
      <li>
        Helps develop a quick understanding of a software system.
      </li>
      <li>
        UML modeling helps in breaking a complex system into discrete pieces that can be easily understood.
      </li>
      <li>
        To communicate design decisions.
      </li>
      <li>
        Easier to abstract out concepts.
      </li>
      <li>
        Easier to hand over the system to new teams.
      </li>
    </ol>
    <p>
      <b>Structural UML diagrams </b>:
    </p>
    <ol>
      <li>
        Class diagram&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Used to define structure and behavior in the use cases, a conceptual model of the system in terms of entities and their relationships.
      </li>
      <li>
        Object diagram
      </li>
      <li>
        Package diagram
      </li>
      <li>
        Component diagram
      </li>
      <li>
        Composite Structure diagram
      </li>
      <li>
        Deployment diagram
      </li>
      <li>
        Profile diagram
      </li>
    </ol>
    <p>
      <b>Behavioral UML diagrams </b>:
    </p>
    <ol>
      <li>
        Use case diagram&#160;&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Used to describe a set of user scenarios, illustrates the functionality provided by the system.
      </li>
      <li>
        Activity diagram&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Used to model the functional flow-of-control between two or more class objects.
      </li>
      <li>
        Sequence diagram&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Used to describe interactions among classes in terms of an exchange of messages over time.
      </li>
      <li>
        State diagram
      </li>
      <li>
        Communication diagram
      </li>
      <li>
        Interaction overview diagram
      </li>
      <li>
        Timing diagram.
      </li>
    </ol>
  </body>
</html></richcontent>
</node>
<node CREATED="1551218334416" HGAP="38" ID="ID_752078265" MODIFIED="1551222343868" POSITION="right" VSHIFT="13">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Use Case Diagram </b>:&#160;&#160;&#160;(Refer to diagram UseCaseDiagram.png under images folder)
    </p>
    <p>
      
    </p>
    <p>
      Actors and set of actions that they perform.
    </p>
    <p>
      
    </p>
    <p>
      Describe high-level functional behavior of the system.
    </p>
    <p>
      What system does from the user point of view.
    </p>
    <p>
      What system does and what it does not do.
    </p>
    <p>
      
    </p>
    <p>
      Visualize functional requirements of the system..
    </p>
    <p>
      
    </p>
    <p>
      <b>Components of UseCaseDiagram</b>:
    </p>
    <ol>
      <li>
        System Boundary
      </li>
      <li>
        Actors
      </li>
      <li>
        Use Case&#160;&#160;-&gt;&#160;&#160;Every business functionality is a potential use case.
      </li>
      <li>
        Include&#160;&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Include relationship (invocation of one use case by another use case.)
      </li>
      <li>
        Extend&#160;&#160;&#160;&#160;&#160;-&gt;&#160;&#160;Extending one use case from other user case.&#160;&#160;( E.g: SearchProductByName &amp; ByCategory extends SearchProduct.
      </li>
    </ol>
  </body>
</html></richcontent>
</node>
<node CREATED="1551218970083" HGAP="49" ID="ID_1478806624" MODIFIED="1551221872827" POSITION="left" VSHIFT="-247">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>ClassDiagram </b>:&#160;&#160;Backbone of object oriented modeling.&#160;&#160;(Refer to ClassDiagram.pmg under Images)
    </p>
    <p>
      
    </p>
    <p>
      How different entities (people, things, data) relate to each other.
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Analyse and Design of the STATIC view of an application
      </li>
      <li>
        Describe responsibilities of a system
      </li>
      <li>
        Base for Component and Deployment diagrams
      </li>
      <li>
        Forward and Reverse engineering.
      </li>
    </ol>
    <p>
      ClassName | Class Properties |&#160;&#160;Class Methods.
    </p>
    <p>
      
    </p>
    <p>
      <b>Relationships </b>:
    </p>
    <ul>
      <li>
        Association&#160;&#160;&#160;&#160;&#160;&#160;:&#160;&#160;Either bi-directional or uni-directional. Link between classes.
      </li>
      <li>
        Multiplicity&#160;&#160;&#160;&#160;&#160;&#160;&#160;:&#160;&#160;Indicates how many instances of a class participate in the relationship.
      </li>
      <li>
        Aggregation&#160;&#160;&#160;&#160;&#160;:&#160;&#160;The lifecycle of a PART class is independent of the WHOLE class's lifecycle. A relationship where the child can exist independently of the parent.
      </li>
      <li>
        Composition&#160;&#160;&#160;&#160;&#160;:&#160;&#160;Child class's instance lifecycle is dependent on the parent class's instance lifecycle. Child can not exist independently of the parent.
      </li>
      <li>
        Generalization&#160;&#160;:&#160;&#160;Think of it as interface in java world.
      </li>
      <li>
        Abstract Class&#160;&#160;:&#160;&#160;&#160;Same as in java.
      </li>
    </ul>
    <p>
      <b>Conventions </b>:&#160;&#160;(Refer to UMLConventions.pmg under images)
    </p>
    <p>
      
    </p>
    <p>
      &lt;&lt;Interface&gt;&gt; NAME | methods
    </p>
    <p>
      Class Name&#160;&#160;|&#160;&#160;properties(variables) |&#160;&#160;methods
    </p>
    <p>
      
    </p>
    <p>
      A -------|&gt;&#160;&#160;&#160;&#160;&#160;B&#160;&#160;&#160;:&#160;&#160;&#160;Generalization&#160;&#160;&#160;:&#160;&#160;&#160;&#160;A implements B.
    </p>
    <p>
      A <u>&#160;________</u>|&gt;&#160;&#160;&#160;&#160;B&#160;&#160;&#160;:&#160;&#160;&#160;&#160;Inheritance&#160;&#160;&#160;&#160;&#160;&#160;&#160;:&#160;&#160;&#160;&#160;A inherits from B.
    </p>
    <p>
      A ----------&#160;&#160;&#160;B&#160;&#160;&#160;:&#160;&#160;&#160;&#160;Use Interface&#160;&#160;&#160;&#160;:&#160;&#160;&#160;&#160;A uses interface B.
    </p>
    <p>
      A&#160; <u>___________</u>&#160;&#160; B&#160;&#160;&#160;:&#160;&#160;&#160;&#160;Association&#160;&#160;&#160;&#160;&#160;&#160;:&#160;&#160;&#160;&#160;A and B call each other.
    </p>
    <p>
      A ___________&gt;&#160;&#160;B&#160;&#160;&#160;:&#160;&#160;&#160;&#160;Uni-directional Association :&#160;&#160;A can call B but not vice versa.
    </p>
    <p>
      A &lt;&gt;_________&#160;&#160;&#160;B&#160;&#160;:&#160;&#160;&#160;&#160;Aggregation&#160;&#160;&#160;&#160;:&#160;&#160;A &quot;has-an&quot; instance of B. B can exist with out A.
    </p>
    <p>
      A <b>&lt;<font size="6">.</font>&gt;________<font size="3">&#160; &#160;</font></b><font size="3">B&#160;&#160;:&#160;&#160;&#160;&#160;Composition&#160;&#160;&#160;: &#160;A &quot;has-an&quot; instance of B. B can not exist with out A. </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">&#160; </font>
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551221881198" HGAP="97" ID="ID_1281182085" MODIFIED="1551226114595" POSITION="right" VSHIFT="-13">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Sequence Diagram </b>:
    </p>
    <p>
      
    </p>
    <p>
      Interaction among classes in terms of an exchange of messages over time.
    </p>
    <p>
      To explore logic of complex operations, functions or procedures.
    </p>
    <p>
      
    </p>
    <p>
      Identify each class instance by putting each class instance inside a box.
    </p>
    <p>
      If class instance sends a message to another class, draw a line with open arrowhead&#160;&#160;(-&gt;) pointing to the receiving class instance and place name of the message above the line.
    </p>
    <p>
      A dotted line with an arrowhead pointing back to represent returned value (&lt;--)
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551222448710" HGAP="136" ID="ID_598806718" MODIFIED="1551226124653" POSITION="right" VSHIFT="-250">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Activity Diagram</b>&#160;:
    </p>
    <p>
      
    </p>
    <p>
      Illustrate flow of control in a system.
    </p>
    <p>
      Emphasizes condition of the flow and the sequence in which it happens.
    </p>
    <p>
      Also to refer to the steps involved in the execution of a use case.
    </p>
    <p>
      
    </p>
    <p>
      Model flow of control from activity to activity.
    </p>
    <p>
      Model workflow or business process and internal operations.
    </p>
    <p>
      
    </p>
    <p>
      User performing online shopping diagram is under ActivityDiagram.png under images.
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551636343388" HGAP="60" ID="ID_676801378" MODIFIED="1553550268913" POSITION="left" VSHIFT="-83">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>SOLID - Design by Sandi Metz </b>:
    </p>
    <p>
      
    </p>
    <p>
      Issues with code with out design :
    </p>
    <ol>
      <li>
        Rigid&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;&#160;&#160;Every change causes a cascade of related changes.
      </li>
      <li>
        Fragile&#160;&#160;&#160;&#160;&#160;&#160;--&gt;&#160;&#160;Distant and unrelated code breaks after every change.
      </li>
      <li>
        Immobile&#160;&#160;--&gt;&#160;&#160;Can not reuse as code is hopelessly entangled.
      </li>
      <li>
        Viscosity&#160;&#160;&#160;--&gt;&#160;&#160;Behaving bad and not adhering to the original design.
      </li>
    </ol>
    <p>
      <b>SOLID</b>&#160;:
    </p>
    <ol>
      <li>
        <b>S</b>olid Responsibility&#160;&#160;-- There should never be more than one reason for a class to change.
      </li>
      <li>
        <b>O</b>pen/Closed&#160;&#160;--&#160;&#160;A module must be open for extension and closed for modification.
      </li>
      <li>
        <b>L</b>iskov Substitution -- Subclasses should be substitutable for their base classes.&#160;&#160;(avoid isInstanceOf)
      </li>
      <li>
        <b>I</b>nterface Segregation -- Many client specific interfaces are better than one general purpose Interface.
      </li>
      <li>
        <b>D</b>ependency Inversion -- Depend up on abstractions and not concretions.
      </li>
    </ol>
    <p>
      <b>DESIGN IS ALL ABOUT DEPENDENCIES</b>.
    </p>
    <p>
      
    </p>
    <p>
      To avoid dependencies code must be :
    </p>
    <ol>
      <li>
        Loosely coupled&#160;&#160;&#160;--&gt; Dependency Injection.
      </li>
      <li>
        Highly Cohesive&#160;&#160;&#160;--&gt;&#160;&#160;A class should all be about the same thing. (Single Responsibility)
      </li>
      <li>
        Easily Composable&#160;&#160;&#160;--&gt;&#160;
      </li>
      <li>
        Context Independent
      </li>
    </ol>
    <p>
      
    </p>
    <table style="border-top-style: solid; border-left-style: solid; border-top-width: 0; width: 80%; border-left-width: 0; border-bottom-width: 0; border-bottom-style: solid; border-right-style: solid; border-right-width: 0" border="0">
      <tr>
        <td valign="top" style="border-top-style: solid; border-left-style: solid; border-top-width: 1; width: 50%; border-left-width: 1; border-bottom-width: 1; border-bottom-style: solid; border-right-style: solid; border-right-width: 1">
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            DownloadParseUpdateFile class:
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;run() {
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;download_file()
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;parse_file()
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;update_file()
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;}
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;download_file() {&#160;&#160;
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;File temp = new File(&quot;filename&quot;)
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;FTP.open('localhost', 'user','pwd')
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;FTP.getFile('remote file path', temp)
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;}
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;parse_file() {
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;read(temp)
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;}
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;update_file() {
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;createcontent(file)
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            &#160;&#160;&#160;&#160;&#160;&#160;}
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            END CLASS
          </p>
        </td>
        <td valign="top" style="border-top-style: solid; border-left-style: solid; border-top-width: 1; width: 50%; border-left-width: 1; border-bottom-width: 1; border-bottom-style: solid; border-right-style: solid; border-right-width: 1">
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            <b>Problems in the Left side </b>??
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            This code do not tolerate change.
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            What is ftp host/login/password change ?
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            What if I need to create another job like this ?
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            What if I dont want to ftp a file in every test ?
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            
          </p>
          <p style="margin-top: 1; margin-bottom: 1; margin-left: 1; margin-right: 1">
            
          </p>
        </td>
      </tr>
    </table>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
  </body>
</html></richcontent>
</node>
</node>
</map>
