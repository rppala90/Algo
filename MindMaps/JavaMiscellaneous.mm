<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548447258324" ID="ID_506919794" MODIFIED="1549040963492">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Java miscellaneous
    </p>
    <p>
      
    </p>
    <p>
      Questions that does not fit any specific mindmap.
    </p>
  </body>
</html></richcontent>
<node CREATED="1548447311167" ID="ID_982592837" MODIFIED="1548447639201" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      If Java class implements multiple interfaces then there is a risk that a same method (with same signature) exists in multiple interfaces. Since java can only implement at method with a given signature once, this could potentially lead to some problems. Java specification does not give any solution to this problem.
    </p>
    <p>
      
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1548447645869" ID="ID_332183845" MODIFIED="1548450353537" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      What if I want to add new method to an interface in a later version ?
    </p>
    <p>
      
    </p>
    <p>
      Ans:&#160;&#160;Interface Default Method.
    </p>
    <p>
      Classes that implement the interface but which contain no implementation for the default interface will then automatically get the default method implementation.
    </p>
    <p>
      
    </p>
    <p>
      Static methods possible inside an interface.
    </p>
    <p>
      
    </p>
    <p>
      Functional Interfaces contain single unimplemented method. (non-default, non-static).
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1549040966050" ID="ID_1767857186" MODIFIED="1549044310123" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>try-with-resource </b>:
    </p>
    <p>
      To automatically close resources like InputStream or JDBC Connection.
    </p>
    <p>
      
    </p>
    <p>
      <b>Old school</b>:
    </p>
    <p>
      try{ file = new FileInputStream(); } catch(Exception e){} finally { file.close(); }
    </p>
    <p>
      What happens if there is an excpetion during file.close() ?
    </p>
    <p>
      The stack trace will show file.close() as an error and will hide any actual exception during try or catch blocks.
    </p>
    <p>
      
    </p>
    <p>
      <b>Java 7 </b>:
    </p>
    <p>
      try(FileInputStream input = new FileInputStream(&quot;file.txt&quot;)) { //read data from stream. }
    </p>
    <p>
      <b>Java 9</b>&#160;:
    </p>
    <p>
      FileInputStream input = new FileInputStream(&quot;File.txt&quot;);
    </p>
    <p>
      try(input) { //read data from stream.}
    </p>
    <p>
      
    </p>
    <p>
      <b>Multiple resources can also be used </b>in which case resources will be closed in reverse order of their creation.
    </p>
    <p>
      
    </p>
    <p>
      Implement <b>java.lang.AutoClosable interface</b>&#160;in your own class and use that class in try-with-resource block.
    </p>
    <p>
      
    </p>
    <p>
      If an <b>exception is thrown inside try block</b>&#160;then
    </p>
    <p>
      1) All the resources opened in try will still be closed automatically.
    </p>
    <p>
      2) Exception in try will be propagated up the call stack.
    </p>
    <p>
      
    </p>
    <p>
      If an <b>exception is thrown during close() call</b>&#160;then
    </p>
    <p>
      1) Rest of the open resources will still be closed automatically.
    </p>
    <p>
      2) The first exception encountered in close will be propagated up the call stack
    </p>
    <p>
      &#160;&#160;&#160;&#160;and other close exceptions will be suppressed.
    </p>
    <p>
      
    </p>
    <p>
      If an <b>exception happens both inside try block and close() call</b>&#160;then
    </p>
    <p>
      1) Exception from try block will be propagated up the call stack and
    </p>
    <p>
      2) Exceptions inside close will be suppressed.
    </p>
    <p>
      3) This is opposite of what happens in <b>try-catch </b>block.
    </p>
    <p>
      
    </p>
    <p>
      Can have both <b>catch</b>&#160;and <b>finally</b>&#160;block for the try-with-resource block.
    </p>
    <p>
      In that case close() will be called before calling the catch block.
    </p>
    <p>
      
    </p>
    <p>
      <b>Suppressed Exceptions</b>:
    </p>
    <p>
      Throwable class has a method named addSuppressed().
    </p>
    <p>
      This will enable adding suppressed exception to another exception.
    </p>
    <p>
      We can choose to suppress exception during close and attach it to exception in try block.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
