<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1555459188051" ID="ID_480111718" MODIFIED="1555633131043" TEXT="RDBMS">
<node CREATED="1555459196923" ID="ID_217753871" MODIFIED="1555522624930" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      TERMINOLOGY:
    </p>
    <p>
      
    </p>
    <p>
      Super Key&#160;&#160;--&gt;&#160;&#160;&#160;A set of one or more attributes(columns), which can uniquely identify a row in a table.
    </p>
    <p>
      <b>Candidate Key --&gt;</b>&#160;Should not have any redundant attribute. Minimal super key with no redundant attributes.
    </p>
    <p>
      <b>Primary Key --&gt;</b>&#160;Selected from set of candidate keys.
    </p>
    <p>
      
    </p>
    <p>
      <b>Example</b>:
    </p>
    <p>
      Emp_SSN |&#160;&#160;EMP_NUMBER&#160;&#160;|&#160;&#160;EMP_NAME
    </p>
    <p>
      
    </p>
    <p>
      Super Keys: {emp_ssn}, {emp_number}, {emp_ssn, emp_number}, {emp_ssn, emp_name},
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;{emp_ssn, emp_number, emp_name}, {emp_number, emp_name}
    </p>
    <p>
      <b>Candidate Keys</b>:&#160;&#160;{emp_ssn}, {emp_number}
    </p>
    <p>
      <b>Primary Keys</b>: Either emp_ssn or emp_number.
    </p>
    <p>
      
    </p>
    <p>
      <b>DataDefinitionLanguage (DDL) </b>:&#160;&#160;Create, Alter, Drop, Truncate, Rename, Drop, Comment.
    </p>
    <p>
      <b>Data Manipulation Language(DML)</b>: Select, Insert, Update, Delete
    </p>
    <p>
      <b>Data Control Language (DCL)</b>&#160;: Grant, Revoke
    </p>
    <p>
      <b>Transaction Control Language (TCL) </b>: Commit, Rollback.
    </p>
    <p>
      
    </p>
    <p>
      <b>ER Diagrams in RDBMS </b>:
    </p>
    <p>
      
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;/---------Entity ----&gt; Weak Entity
    </p>
    <p>
      ER Model----/-------Attribute-----&gt; Key&#160;&#160;&#160;;&#160;&#160;Composite&#160;&#160;&#160;&#160;;&#160;&#160;&#160; MultiValued&#160;&#160;&#160;&#160;;&#160;&#160;Derived
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;\----Relationship-----&gt; One to One&#160;&#160;;&#160;&#160;&#160;One to Many&#160;&#160;&#160;; &#160;&#160;&#160;Many to One&#160;&#160;&#160;;&#160;&#160;&#160;Many to Many.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1555628647392" ID="ID_1131158041" MODIFIED="1555634004855" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>DATABASE MODEL</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Requirement Analysis Stage

        <ol>
          <li>
            User Interviews
          </li>
          <li>
            Forms, Reports
          </li>
          <li>
            Use cases, Business Rules, Observation
          </li>
        </ol>
      </li>
      <li>
        Component Design Stage

        <ol>
          <li>
            E-R Data Model:

            <ol>
              <li>
                Entity

                <ol>
                  <li>
                    Strong and Weak Entities (dependent vs Independent).

                    <ol>
                      <li>
                        CUSTOMER and ORDER. Can not add ORDER unless it is associated with CUSTOMER. CUSTOMER can be added with out ORDER.
                      </li>
                      <li>
                        ID dependent (solid line) and Non-ID (dotted line) dependent weak entities.
                      </li>
                      <li>
                        ID dependent: Part of primary key of weak entity is part of primary key of the other entity.
                      </li>
                      <li>
                        Non-ID dependent: Different type of primary key for weak entity but other non-id fields will have the primary key of other entity.
                      </li>
                    </ol>
                  </li>
                  <li>
                    Super Type -- Sub Type&#160;&#160;(Vehicle -- car,truck etc..)

                    <ol>
                      <li>
                        Exclusive (A VEHICLE can only be a CAR or TRUCK and can not be both) .&#160;&#160;VEHICLE -----(X)|-----CAR
                      </li>
                      <li>
                        Inclusive. (A PERSON can be both STUDENT and EMPLOYEE simultaneously.&#160;&#160;PERSON -----()|---- STUDENT
                      </li>
                    </ol>
                  </li>
                </ol>
              </li>
              <li>
                Attributes ( Identifiers-key- and Non-key attributes) : Each attribute has Data type and other attributes.

                <ol>
                  <li>
                    Uniqueness &amp; Composite.
                  </li>
                </ol>
              </li>
              <li>
                Relationships.

                <ol>
                  <li>
                    Degree 1 is a unary relationship ( A PERSON married to another PERSON)
                  </li>
                  <li>
                    Degree 2 is a binary relationship (An EMPLOYEE can be assigned to a PARKINGSPACE)
                  </li>
                  <li>
                    Degree 3 is a ternary relationship ( A DOCTOR prescribes DRUG to PATIENT)
                  </li>
                  <li>
                    1:1 Relationship . ( An EMPLOYEE is assigned one LOCKER and viceversa)<br />
                  </li>
                  <li>
                    1:N Relationship. (A Single DEPARTMENT contains multiple EMPLOYESS)
                  </li>
                  <li>
                    Recursive Relationship
                  </li>
                  <li>
                    N:M Relationship. (Multiple ITEMS may be supplied by multiple SUPPLIERS)

                    <ol>
                      <li>
                        ITEM &lt;--&gt;&#160;&#160;ITERM_SUPPLIER (lookup table) &lt;--&gt; SUPPLIER
                      </li>
                    </ol>
                  </li>
                  <li>
                    Maximim Cardinality(count) Minimum Cardinality (zero or One)

                    <ol>
                      <li>
                        One and Only One -------|-|-&#160;&#160;&#160;
                      </li>
                      <li>
                        One to Many .&#160;&#160;&#160;&#160;&#160;&#160;&#160;-------|-&lt;-&#160;&#160;&#160;(CUSTOMER can be placed one to many ORDERS)
                      </li>
                      <li>
                        Zero to One&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;-------0-|-
                      </li>
                      <li>
                        Zero to Many .&#160;&#160;&#160;&#160;&#160;&#160;&#160;------ 0-
                      </li>
                    </ol>
                  </li>
                  <li>
                    Recursive relationship :

                    <ol>
                      <li>
                        Unary Relationship ( Employee pk(employeeid) can also be a Manager (Fk: managerId)) Hierarchical.
                      </li>
                      <li>
                        
                      </li>
                    </ol>
                  </li>
                </ol>
              </li>
            </ol>
          </li>
        </ol>
      </li>
      <li>
        Implementation Stage
      </li>
    </ol>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1555633134186" ID="ID_111518901" MODIFIED="1555636561826" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>DATABASE DESIGN</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Create Table for each Entity
      </li>
      <li>
        Specify Primary Key
      </li>
      <li>
        Column Properties

        <ol>
          <li>
            Data type
          </li>
          <li>
            Null status
          </li>
          <li>
            Default Values
          </li>
          <li>
            Data Constraints.
          </li>
        </ol>
      </li>
      <li>
        Relation is then analyzed using normalization rules.
      </li>
      <li>
        Normalization:

        <ol>
          <li>
            First Normal Form ( Every relation is by definition in frist normal form)
          </li>
          <li>
            Second Normal Form (Remove partial dependencies from table)
          </li>
          <li>
            Third Normal Form ( Remove any transitive dependencies from table)
          </li>
          <li>
            Boyce - Codd Normal Form ( Every determinant with in the table is also candidate key )
          </li>
          <li>
            Fourth Normal form
          </li>
          <li>
            Fifth Normal form
          </li>
          <li>
            Domain&#160;&#160;/ Key Normal Form.
          </li>
          <li>
            Sixth Normal form.
          </li>
        </ol>
      </li>
      <li>
        Denormalization

        <ol>
          <li>
            Business justification of why two or more tables should be combined to single.
          </li>
          <li>
            Reasons: Simplicity of design, speed of querying (avoid too many joins).
          </li>
          <li>
            Drawbacks: Modification anomoly that Normalization fixes.
          </li>
        </ol>
      </li>
      <li>
        Representing Relationships:

        <ol>
          <li>
            1:1 Relationships:

            <ol>
              <li>
                If both sides of relationship optional then does not matter which table received foreign key. (EMPLOYEE LOCKER example so FK in either table)
              </li>
              <li>
                If one side is optional the optional side receives foreign key. (PATIENT BED , foreign key should be on Patient as patient is optional --bed could be empty--)
              </li>
            </ol>
          </li>
          <li>
            1:N Relationship - Always FK goes into the many side(child table) of relationship.

            <ol>
              <li>
                PLAYER TEAM ( One Team contains Many players and hence FK belongs in player)
              </li>
            </ol>
          </li>
          <li>
            N:M Relationship - Intersection table consisting of composite key.

            <ol>
              <li>
                STUDENT -- STUDENT_CLASS -- CLASS
              </li>
              <li>
                select * from student s, Class c, student_class sc
              </li>
              <li>
                where&#160;&#160;s.SID = sc.SID and sc.classNum = c.classNum;
              </li>
            </ol>
          </li>
          <li>
            Surrogate Keys and Associative Entities

            <ol>
              <li>
                Customer(&lt;custId pk&gt;, name) --||----0&lt;--Rating(&lt;CustId pk,fd&gt;, &lt;productId pk,fk&gt;) --&gt;0----||--Product(&lt;productId pk&gt;, name)
              </li>
              <li>
                Problem with above is if customer wants to rate a product multiple times.
              </li>
              <li>
                Surrogate Key:
              </li>
              <li>
                Customer(&lt;custId pk&gt;, name) --||----0&lt;--Rating(&lt;ratingId pk&gt;, &lt;custId fk&gt;, &lt;prodId fk&gt;) --&gt;0---||--Product(&lt;prodId pk&gt;, name)
              </li>
              <li>
                Now customer can rate a product multiple times.
              </li>
            </ol>
          </li>
          <li>
            Recursive relationship can be 1:1 , 1:N, N:M recursive relationship.

            <ol>
              <li>
                select * from person as a, person b where a.person = b.personsponsored;
              </li>
              <li>
                Intersection Table: treatment-intersection; table doctor.
              </li>
              <li>
                select * from doctor a, doctor b, treatment-intersection
              </li>
              <li>
                where a.name = treatment-intersection.physician and
              </li>
              <li>
                treatment-intersection.patient = b.name
              </li>
            </ol>
          </li>
        </ol>
      </li>
      <li>
        ABC
      </li>
    </ol>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
