<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548699325835" ID="ID_1728236344" MODIFIED="1548711900741">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Java Concurrency
    </p>
    <p>
      
    </p>
    <p>
      &#160;Multithreading pros vs cons?
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Better resource utilization
      </li>
      <li>
        More responsive programs
      </li>
      <li>
        Simple program design in some situations.
      </li>
      <li>
        Vs
      </li>
      <li>
        Complex design
      </li>
      <li>
        Context switching overhead
      </li>
      <li>
        Increased resource consumption.
      </li>
    </ol>
    <p>
      
    </p>
  </body>
</html></richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1548712230854" ID="ID_933358843" MODIFIED="1548738830187" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Concurrency Models </b>
    </p>
    <p>
      
    </p>
    <p>
      <b>Parallel Workers </b>Vs<b>&#160;(Assembly Line / Reactive system / Event driven system) Vs Functional Parallelism: </b>
    </p>
    <p>
      
    </p>
    <p>
      <b>Parallel Workers </b>
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;-----&gt; Worker
    </p>
    <p>
      Delegator&#160;&#160;&#160;-----&gt; Worker
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;-----&gt; Worker
    </p>
    <p>
      <b>Advantages</b>:
    </p>
    <ol>
      <li>
        Scaling is easy; add more workers
      </li>
      <li>
        Easy to Understand.
      </li>
    </ol>
    <p>
      <b>Disadvantages</b>:
    </p>
    <ol>
      <li>
        Shared state can get complex.

        <p>
          &#160;&#160;&#160;&#160;&#160;&#160;Delegator&#160;&#160;&#160;---&gt; worker \
        </p>
        &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;---&gt; worker&#160;&#160;--&gt; Shared sate in memory / Database.
      </li>
    </ol>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;---&gt; worker /
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        <p>
          Threads need to avoid race conditions, deadlocks and many other shared state concurrency issues.
        </p>
      </li>
      <li>
        <p>
          Part of parallelization is lost when threads are waiting for each other when accessing the shared data structure. Many concurrent data structures are blocking meaning one or a limited set of threads can access them at any given time. (contention)
        </p>
      </li>
      <li>
        <p>
          &#160;Non-blocking concurrency algorithm may decrease contention and increase performance but non-blocking algorithms are hard to implement.
        </p>
      </li>
      <li>
        Stateless Workers: Shared state can be modified by other threads in the system. Therefore workers must re-read the state every time it needs it. This can be slow.(reading everytime).
      </li>
      <li>
        Non-deterministic Job ordering: Job execution order of these different jobs is nondeterministic.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      <b>Assembly Line / Reactive System / Event driven System</b>:
    </p>
    <p>
      
    </p>
    <p>
      Delegator --&gt; worker --&gt; worker --&gt; worker.
    </p>
    <p>
      
    </p>
    <p>
      Each worker performs a part of the full job and when that part is finished the worker forwards the job to the next worker.
    </p>
    <p>
      Each worker runs in its own thread and shares no state with other workers.
    </p>
    <p>
      Usually use <b>Non-Blocking IO</b>.
    </p>
    <p>
      Delegator --&gt; worker --&gt; Non-blocking IO --&gt; worker --&gt; Non-blocking IO --&gt; worker.
    </p>
    <p>
      Also can be:
    </p>
    <p>
      Delegator --&gt; worker --&gt; worker --&gt; worker
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt; worker --&gt; worker --&gt; worker
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt; worker --&gt; worker --&gt; worker
    </p>
    <p>
      Reactive / Event-driven platforms:&#160;&#160;Vert.x, <b>Akka, Node.JS </b>
    </p>
    <p>
      <b>Actors and Channels </b>are two examples of assembly line.
    </p>
    <p>
      In <b>actor</b>&#160;model, each worker is an actor and they can send messages directly to each other.
    </p>
    <p>
      Messages are sent and processed asynchronously.
    </p>
    <p>
      In <b>Channel</b>&#160;model, workers do not communicate directly but they publish their messages(events) on different channels. Other workers listen to these messages and sender does not have to worry about which worker picks the message. This is best because of the loose coupling between workers.
    </p>
    <p>
      
    </p>
    <p>
      <b>Advantages&#160;: </b>
    </p>
    <ol>
      <li>
        No shared state
      </li>
      <li>
        Stateful workers:
      </li>
      <li>
        Job ordering is possible.
      </li>
    </ol>
    <p>
      <b>Disadvantages</b>:
    </p>
    <ol>
      <li>
        Hard to write. (Callback handlers -- Code with many nested callback handlers may result in callback hell -- hard to track what the code is doing across all the callbacks)
      </li>
    </ol>
    <p>
      <b>Functional Parallelism</b>:
    </p>
    <p>
      Implement program using function calls.
    </p>
    <p>
      All parameters passed to the function are copied, so no entity outside the receiving function can manipulate the data.
    </p>
  </body>
</html></richcontent>
<font NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1548809720694" ID="ID_1406690555" MODIFIED="1548821683233" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Race conditions</b>&#160;occur only if multiple threads are accessing the same resource and one of more of the threads <b>write</b>&#160;to the resource.
    </p>
    <p>
      
    </p>
    <p>
      Use ImmutableClass b/w threads if the threads need not change the value.
    </p>
    <p>
      
    </p>
    <p>
      Even if an object is immutable and therefore thread safe, the reference to this object may not be thread safe.
    </p>
    <p>
      
    </p>
    <p>
      <b>Java Memory Model </b>used internally inside JVM divides memory between <b>thread stack</b>&#160;and <b>heap</b>.
    </p>
    <p>
      
    </p>
    <p>
      All local variables of primitive types (boolean, byte, int...) are fully stored in thread stack and thus not visible to other threads. One thread may pass a copy of a primitive variable to another thread but can not be shared.
    </p>
    <p>
      
    </p>
    <p>
      Objects will be stored in heap not in thread stack even though the reference is stored in thread stack.
    </p>
    <p>
      An object may contain methods and these method's local variable are stored in <b>thread stack</b>&#160;even though the object itself is on heap.
    </p>
    <p>
      
    </p>
    <p>
      Objects member variables are stored on the heap along with the object itself.
    </p>
    <p>
      
    </p>
    <p>
      <b>Modern Hardware Memory Architecture</b>:
    </p>
    <p>
      
    </p>
    <p>
      CPU (cpu registers) --&gt; CPU Cache Memory&#160;&#160;\
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;RAM MAIN MEMORY
    </p>
    <p>
      CPU (cpu registers) --&gt; CPU Cache Memory&#160;/
    </p>
    <p>
      
    </p>
    <p>
      With out volatile/synchronized there is change made by one thread is stuck in one CPU Cache Memory and thus not visible to other thread that is run on a different cpu.
    </p>
    <p>
      
    </p>
    <p>
      <b>volatile</b>&#160;keyword makes sure a variable is always read from main memory and written to main memory.
    </p>
    <p>
      
    </p>
    <p>
      <b>Synchronized</b>&#160;block guarantees that only one thread can enter a given critical section of the code at a given time. It also guarantees that all variables accessed inside the synchronized block will be read in from main memory, and when thread exits the synchronized block all updated variables will be flushed back to main memory.
    </p>
    <p>
      
    </p>
    <p>
      <b>Full volatile Visibility Guarantee</b>: Even though only one variable of a class is volatile, all variables visible to the thread are also written to main memory.
    </p>
    <p>
      <b>Instruction Reordering Challenges</b>: JavaVM and CPU are allowed to reorder the instructions in the program for performance reasons.
    </p>
    <p>
      public class MyClass {
    </p>
    <p>
      &#160;&#160;private int years;
    </p>
    <p>
      &#160;&#160;private volatile int days;
    </p>
    <p>
      &#160;&#160;public void update(int years, int days) { this.years = years; this.days=days;}
    </p>
    <p>
      }
    </p>
    <p>
      If the above instructions <b>are not reordered</b>&#160;then the new values of both years and days are written to main memory which means another thread reading these values will get latest data for both years and days.
    </p>
    <p>
      If the above instructions <b>are reordered</b>&#160;such that this.days=days is before the this.years=years then even though years is also written to main memory it will write the old years data and not the new data.
    </p>
    <p>
      
    </p>
    <p>
      To address instruction reordering challenge, Java volatile keyword gives a &quot;<b>happens-before</b>&quot; guarantee in addition to the <b>visibility</b>&#160;guarantee.
    </p>
    <p>
      
    </p>
    <p>
      <b>Volatile</b>&#160;is sufficient when multiple threads could be writing to a shared volatile variable, and still have the correct value stored in main memory IFF the new value written does not depend on its previous value.
    </p>
    <p>
      
    </p>
    <p>
      If that is not the case ( volatile int var = 1; var = var +1;) then <b>volatile</b>&#160;itself is not sufficient.
    </p>
    <p>
      Because there could be a gap between reading from main memory and writing to main memory as multiple threads might read this old value from main memory during that time.
    </p>
    <p>
      So <b>synchronized</b>&#160;is necessary to guarantee reading and writing of the variables is atomic.
    </p>
    <p>
      
    </p>
    <p>
      <b>java.util.concurrent </b>pacakge is better alternative for synchronized since synchronized is bad for <b>performance</b>.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
