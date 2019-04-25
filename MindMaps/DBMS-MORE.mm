<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1555636626907" ID="ID_986494466" MODIFIED="1555636633868" TEXT="DBMS-MORE">
<node CREATED="1555636637512" ID="ID_756159153" MODIFIED="1555640682474" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>DATABASE ADMINISTRATION</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Concurrency Control
      </li>
      <li>
        Security
      </li>
      <li>
        Backup and Recovery
      </li>
    </ol>
    <p>
      Transaction --&gt; Single logical unit of work (LUW)
    </p>
    <p>
      
    </p>
    <p>
      <b>Lost Update problem </b>:&#160;&#160;&#160;If 2 or more users are attempting to update the same datum at the same time, it is possible for one update to overwrite the other update.
    </p>
    <p>
      
    </p>
    <p>
      <b>Concurrency issues</b>:
    </p>
    <ol>
      <li>
        Dirty reads .&#160;&#160;&#160;--&gt; Transaction reads a modified record that has not yet been committed to database.
      </li>
      <li>
        Inconsistent reads . --&gt;Transaction re-reads a data set and finds that the data have changed
      </li>
      <li>
        Phantom reads .&#160;&#160;--&gt; Transaction re-reads a data set and finds that a new record has been added.
      </li>
    </ol>
    <p>
      <b>Resource Locking</b>&#160;:
    </p>
    <ol>
      <li>
        Implicit Locks . --&gt; Automatically issued by DBMS.
      </li>
      <li>
        Explicit Locks .&#160;&#160;--&gt; Users requesting exclusive rights to specific data.

        <ol>
          <li>
            Table locks
          </li>
          <li>
            Row locks
          </li>
          <li>
            Column locks
          </li>
          <li>
            Cell locks.
          </li>
        </ol>
      </li>
    </ol>
    <p>
      <b>Deadlock</b>: Two transactions may indefinitely wait on each other to release resources.
    </p>
    <p>
      
    </p>
    <p>
      <b>Optimistic Locking</b>&#160;:&#160;&#160;Optimistic that changes will succeed with out concurrency issues.
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;Majority transactions involve just reading data. Few insert/update/delete.
    </p>
    <ol>
      <li>
        Read Data
      </li>
      <li>
        Process Transaction
      </li>
      <li>
        Issue Update
      </li>
      <li>
        Look for conflict
      </li>
      <li>
        If no conflict occured THEN commit transacation
      </li>
      <li>
        ELSE rollback and repeat transaction.
      </li>
    </ol>
    <p>
      <b>PsuedoCode</b>&#160;for optimistic :
    </p>
    <p>
      
    </p>
    <p>
      SELECT product.name, product.quantity from product where product.name = 'pencil'
    </p>
    <p>
      oldQuantity = product.quantity
    </p>
    <p>
      set newquantity = product.quantity - 5
    </p>
    <p>
      {process transaction - take exception action if NewQuantity &lt; 0 else &lt;all is ok&gt; }
    </p>
    <p>
      
    </p>
    <p>
      LOCK PRODUCT { at some level of granularity}
    </p>
    <p>
      
    </p>
    <p>
      UPDATE product SET product.quantity = NewQuantity where product.name = 'pencil' and product.quantity = OldQuantity'
    </p>
    <p>
      
    </p>
    <p>
      UNLOCK PRODUCT
    </p>
    <p>
      
    </p>
    <p>
      {check to see if update was successful; if not repeat transaction}
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>Pessimistic Locking</b>&#160;: Concurrency problems may arise so we avoid that.
    </p>
    <p>
      Many insets/update/deletes.
    </p>
    <ol>
      <li>
        Lock required resources
      </li>
      <li>
        Read data
      </li>
      <li>
        Process Transactions
      </li>
      <li>
        Commit changes
      </li>
      <li>
        Release Locks.
      </li>
    </ol>
    <p>
      <b>PsuedoCode</b>&#160;for pessimistic :
    </p>
    <p>
      LOCK product
    </p>
    <p>
      SELECT product.name, product.quantity from product where product.name = 'pencil'
    </p>
    <p>
      set newquantity = product.quantity - 5
    </p>
    <p>
      {process transaction - take exception action if NewQuantity &lt; 0 else &lt;all is ok&gt; }
    </p>
    <p>
      UPDATE product SET product.quantity = NewQuantity where product.name = 'pencil'
    </p>
    <p>
      UNLOCK product
    </p>
    <p>
      {no need to check if update was successful}
    </p>
    <p>
      
    </p>
    <p>
      <b>Consistent Transactions </b>:
    </p>
    <ol>
      <li>
        <b>A</b>tomic .&#160;&#160;&#160;--&gt; Single Logical Unit.
      </li>
      <li>
        <b>C</b>onsistent .&#160;&#160;--&gt; . Other transactions are disallowed while the transaction is on the way. (database locks)
      </li>
      <li>
        <b>I</b>solated&#160;&#160;&#160;&#160;--&gt; .&#160;With Multi user environments different transactions may be operating on same data at same time.

        <ol>
          <li>
            The sequencing of uncommitted updates, rollbacks, and commits continuously changes the data content.
          </li>
          <li>
            Following levels specifies which of the concurrency control problems are allowed to occur.
          </li>
          <li>
            READ UNCOMMITTED .&#160;&#160;(least restrictive)
          </li>
          <li>
            READ COMMITTED
          </li>
          <li>
            REPEATABLE READ
          </li>
          <li>
            SERIALIZABLE .&#160;&#160;&#160;&#160;&#160;&#160;(Most restrictive)
          </li>
        </ol>
      </li>
      <li>
        <b>D</b>urable . --&gt; . All of the changes that are committed are considered permanent.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1555640772199" ID="ID_1773576078" MODIFIED="1555643382780" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>CURSORS</b>&#160;:
    </p>
    <p>
      
    </p>
    <p>
      <b>Pointer</b>&#160;into a set of rows that is the <b>result set</b>&#160;from a SQL <b>SELECT</b>&#160;statement.
    </p>
    <p>
      Result sets can be very large, so applications and websites often can not work with the entire result set as a single unit.
    </p>
    <p>
      
    </p>
    <p>
      <b>Cursors allow a result set to be processed one row at a time.</b>
    </p>
    <p>
      
    </p>
    <p>
      <b>DECLARE CURSOR LargePurchases AS </b>
    </p>
    <p>
      <b>&#160;&#160;&#160;&#160;&#160;SELECT * from sales where purchaseprice &gt;= 10000</b>;
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        <b>Forward Only cursors</b>

        <ol>
          <li>
            Rows fetched serially from the start to end of the cursor.
          </li>
          <li>
            Rows are not retrieved from the database untill they are fetched
          </li>
          <li>
            The effect of any insert,update, or delete statements that affect rows in the result set are visible as the rows are fetched from the cursor.
          </li>
          <li>
            These cursors can not be scrolled backwards. Changes made to a row in the database after the row has been fetched are not visible through the cursor
          </li>
        </ol>
      </li>
      <li>
        Scrollable Cursors --&gt; Can move front and back.

        <ol>
          <li>
            Static Cursors (Snapshot cursor)

            <ol>
              <li>
                Complete result set is retrieved and stored in a&#160;temporary table&#160;when the cursor is opened
              </li>
              <li>
                Any changes made to underlying data is not visible to the cursor
              </li>
              <li>
                consumes few system resources while scrolling
              </li>
            </ol>
          </li>
          <li>
            KeySet Cursors

            <ol>
              <li>
                Keys for the rows&#160;in the result set are retrieved and stored in temporary table&#160;when the cursor is opened
              </li>
              <li>
                When cursor scrolls to a row, the key is used to fetch the current data values for that row from the database
              </li>
              <li>
                Deleted are also visible but inserts are not visible since keys are retrieved when cursor is opened itself.
              </li>
            </ol>
          </li>
          <li>
            Dynamic Cursors

            <ol>
              <li>
                All changes made to rows in the result set are visible when scrolling the cursor.
              </li>
              <li>
                All updates, insert, delete statements made by all users are visible.
              </li>
              <li>
                Uses lot of system resources.
              </li>
            </ol>
            <p>
              
            </p>
          </li>
        </ol>
        <p>
          
        </p>
      </li>
    </ol>
    <p>
      Security
    </p>
    <p>
      &#160;&#160;&#160;&#160;Authentication and Authorization.
    </p>
    <p>
      
    </p>
    <p>
      <b>DISTRIBUTED DATABASES</b>:
    </p>
    <p>
      
    </p>
    <p>
      PARTITIOENED DATABASE
    </p>
    <p>
      
    </p>
    <p>
      &#160;&#160;&#160;&#160;Database has been subdivided such that it runs on two(or more) different database servers.
    </p>
    <p>
      &#160;&#160;&#160;&#160;Few tables on server1 and other tables on server2.
    </p>
    <p>
      &#160;&#160;&#160;
    </p>
    <p>
      REPLICATED DATABASE
    </p>
    <p>
      
    </p>
    <p>
      &#160;&#160;&#160;&#160;Database servers have entire copy of the same datbases.
    </p>
    <p>
      &#160;&#160;&#160;&#160;A full database replicated on all database servers.
    </p>
    <p>
      
    </p>
    <p>
      PARTITIONED REPLICATED DATABASE
    </p>
    <p>
      &#160;&#160;&#160;&#160;Replicating some tables between servers 1 and 2.
    </p>
    <p>
      &#160;&#160;&#160;&#160;Storing different tables on different servers.
    </p>
    <p>
      
    </p>
    <p>
      Object-Relational Database Management.
    </p>
  </body>
</html>
</richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1555645407760" ID="ID_1383614385" MODIFIED="1555648507322" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      INDEXES :
    </p>
    <p>
      
    </p>
    <p>
      Data structure that contains organized copy of some of the data from one or more existing database tables.
    </p>
    <p>
      
    </p>
    <p>
      Increases speed. Needs more space.
    </p>
    <p>
      
    </p>
    <p>
      Created on one or more columns.
    </p>
    <p>
      
    </p>
    <p>
      Index created on pk.
    </p>
    <p>
      
    </p>
    <p>
      B-Tree Index ( Balanced tree) :
    </p>
    <p>
      Use pointers and layers of nodes in order to quickly locate desired data.
    </p>
    <p>
      
    </p>
    <p>
      Clustered Vs Non-clustered Index:
    </p>
    <p>
      Clustered:&#160;&#160;Actual data rows (not just pointers)that comprise the table are stored at leaf level of the index.
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Indexed values are stored in a sorted order.
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Only one clustered index per table. (pk columns are good candidate for clustered index)
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Table rows instead of pointers.
    </p>
    <p>
      
    </p>
    <p>
      HashIndex
    </p>
    <p>
      Bit-map index
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Storage
      </li>
      <li>
        If table is updated frequently then indexes have to be rebuilt which takes time.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <br />
    </p>
  </body>
</html>
</richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
</map>
