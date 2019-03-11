<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1551302337167" ID="ID_1423170087" MODIFIED="1551375348207" TEXT="SQL">
<node CREATED="1551302350627" HGAP="264" ID="ID_1938793980" MODIFIED="1551377703128" POSITION="right" VSHIFT="-73">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">CREATE TABLE exercise_logs (id INTEGER PRIMARY KEY AUTOINCREMENT, type TEXT, minutes INTEGER, calories INTEGER, heart_rate INTEGER); </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">INSERT INTO exercise_logs(type, minutes, calories, heart_rate) VALUES (&quot;biking&quot;, 30, 115, 110); </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT type, SUM(calories) AS total_calories FROM exercise_logs GROUP BY type HAVING total_calories &gt; 150; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">select author, sum(words) as total_words from books group by author HAVING sum(words) &gt; 1000000; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">/* CASE */ </font>
    </p>
    <p>
      <font size="3">SELECT type, heart_rate, </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;CASE </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; 220-30 THEN &quot;above max&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; ROUND(0.90 * (220-30)) THEN &quot;above target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; ROUND(0.50 * (220-30)) THEN &quot;within target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;ELSE &quot;below target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;END as &quot;hr_zone&quot; FROM exercise_logs; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT COUNT(*), </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;CASE </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; 220-30 THEN &quot;above max&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; ROUND(0.90 * (220-30)) THEN &quot;above target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;WHEN heart_rate &gt; ROUND(0.50 * (220-30)) THEN &quot;within target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;ELSE &quot;below target&quot; </font>
    </p>
    <p>
      <font size="3">&#160;&#160;&#160;&#160;END as &quot;hr_zone&quot; </font>
    </p>
    <p>
      <font size="3">FROM exercise_logs </font>
    </p>
    <p>
      <font size="3">GROUP BY hr_zone; </font>
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <font size="3"><b>SQL UNION</b>: </font>
    </p>
    <p>
      <font size="3">UNION Vs UNION ALL . (duplicates) </font>
    </p>
    <p>
      <font size="3">Equal columns, same datatypes, same order in both select statements. </font>
    </p>
    <p>
      <font size="3">SELECT columnname(s) from table1 </font>
    </p>
    <p>
      <font size="3">union (ALL) </font>
    </p>
    <p>
      <font size="3">SELECT columnname(s) from table2 </font>
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT&#160;column_name(s) FROM&#160;table_name </font>
    </p>
    <p>
      <font size="3">WHERE&#160;condition GROUP&#160;BY&#160;column_name(s) </font>
    </p>
    <p>
      <font size="3"><b>HAVING</b>&#160;condition ORDER&#160;BY&#160;column_name(s);</font>
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551375332018" HGAP="48" ID="ID_1786502680" MODIFIED="1551375347072" POSITION="left" VSHIFT="-87">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font size="3">JOINS : </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">(INNER) JOIN: Returns records that have matching values in both tables </font>
    </p>
    <p>
      <font size="3">LEFT (OUTER) JOIN: Return all records from the left table, and the matched records from the right table </font>
    </p>
    <p>
      <font size="3">RIGHT (OUTER) JOIN: Return all records from the right table, and the matched records from the left table </font>
    </p>
    <p>
      <font size="3">FULL (OUTER) JOIN: Return all records when there is a match in either left or right table </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT&#160;Orders.OrderID, Customers.CustomerName, Orders.OrderDate FROM&#160;Orders INNER&#160;JOIN&#160;Customers&#160;ON&#160;Orders.CustomerID=Customers.CustomerID; </font>
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">Join three tables: </font>
    </p>
    <p>
      <font size="3">SELECT&#160;Orders.OrderID, Customers.CustomerName, Shippers.ShipperName </font>
    </p>
    <p>
      <font size="3">FROM&#160;((Orders </font>
    </p>
    <p>
      <font size="3">INNER&#160;JOIN&#160;Customers&#160;ON&#160;Orders.CustomerID = Customers.CustomerID) </font>
    </p>
    <p>
      <font size="3">INNER&#160;JOIN&#160;Shippers&#160;ON&#160;Orders.ShipperID = Shippers.ShipperID); </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT&#160;Customers.CustomerName, Orders.OrderID </font>
    </p>
    <p>
      <font size="3">FROM&#160;Customers </font>
    </p>
    <p>
      <font size="3">LEFT&#160;JOIN&#160;Orders&#160;ON&#160;Customers.CustomerID = Orders.CustomerID </font>
    </p>
    <p>
      <font size="3">ORDER&#160;BY&#160;Customers.CustomerName; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT&#160;Orders.OrderID, Employees.LastName, Employees.FirstName </font>
    </p>
    <p>
      <font size="3">FROM&#160;Orders </font>
    </p>
    <p>
      <font size="3">RIGHT&#160;JOIN&#160;Employees&#160;ON&#160;Orders.EmployeeID = Employees.EmployeeID </font>
    </p>
    <p>
      <font size="3">ORDER&#160;BY&#160;Orders.OrderID; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELECT&#160;Customers.CustomerName, Orders.OrderID </font>
    </p>
    <p>
      <font size="3">FROM&#160;Customers </font>
    </p>
    <p>
      <font size="3">FULL&#160;OUTER&#160;JOIN&#160;Orders&#160;ON&#160;Customers.CustomerID=Orders.CustomerID </font>
    </p>
    <p>
      <font size="3">ORDER&#160;BY&#160;Customers.CustomerName; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font size="3">SELF JOIN: </font>
    </p>
    <p>
      <font size="3">SELECT&#160;A.CustomerName&#160;AS&#160;CustomerName1, B.CustomerName&#160;AS&#160;CustomerName2,&#160;A.City FROM&#160;Customers A, Customers B </font>
    </p>
    <p>
      <font size="3">WHERE&#160;A.CustomerID &lt;&gt; B.CustomerID AND&#160;A.City = B.City&#160; </font>
    </p>
    <p>
      <font size="3">ORDER&#160;BY&#160;A.City;</font>
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551375353944" ID="ID_235406671" MODIFIED="1551377691540" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>SQL QUERY PLANNING &amp; OPTIMIZATION </b>:
    </p>
    <p>
      
    </p>
    <p>
      Declarative language -&gt; query declares WHAT we want the sql engine to do.
    </p>
    <p>
      But HOW to run this query is what makes the query efficient. This is called PLAN.
    </p>
    <p>
      
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1551377708030" ID="ID_439535966" MODIFIED="1551377721127" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      UPDATE diary_logs SET content = &quot;I had a horrible fight with OhNoesGuy&quot; WHERE id = 1;
    </p>
    <p>
      
    </p>
    <p>
      DELETE FROM diary_logs WHERE id = 1;
    </p>
  </body>
</html></richcontent>
</node>
</node>
</map>
