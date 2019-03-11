<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548821758907" ID="ID_1209723539" MODIFIED="1548821837736">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Java Concurrency:
    </p>
    <p>
      
    </p>
    <p>
      ThreadLocal.
    </p>
    <p>
      Deadlock
    </p>
    <p>
      Starvation and Fairness
    </p>
    <p>
      Nested Monitor Lockout
    </p>
    <p>
      Slipped conditions
    </p>
    <p>
      Semaphore
    </p>
    <p>
      Reentrant locks etc...
    </p>
  </body>
</html></richcontent>
<node CREATED="1548821865160" ID="ID_1033583960" MODIFIED="1548961873479" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ThreadLocal:
    </p>
    <p>
      
    </p>
    <p>
      Variable that can be read and written by the same thread.
    </p>
    <p>
      ThreadLocal&lt;String&gt; myThreadLocal = new ThreadLocal&lt;String&gt;();
    </p>
    <p>
      myThreadLocal.set(&quot;value&quot;) . &lt;-- value can be different for different threads and each threads will get the same value that was set by that thread.
    </p>
    <p>
      myThreadLocal.get();
    </p>
    <p>
      
    </p>
    <p>
      Can set initialValue to threadlocal such that all threads get the same initialvalue.
    </p>
    <p>
      
    </p>
    <p>
      <b>InheritabelThreadLocal ?? </b>
    </p>
    <p>
      
    </p>
    <p>
      <b>Thread Signalling</b>&#160;:
    </p>
    <p>
      Signalling via a shared object.
    </p>
    <p>
      Same object can be shared between two threads and&#160;&#160;threadA can change the state indicating the threadB to start processing.
    </p>
    <p>
      But this is <b>BusyWait</b>&#160;which means threadB has to wait in continuous while loop for the state change by threadA.
    </p>
    <p>
      
    </p>
    <p>
      To avoid busyWaiting, use <b>wait(), notify() &amp; notifyAll</b>():
    </p>
    <p>
      A thread that calls wait() on any object becomes inactive untill another thread calls notify() on that object.
    </p>
    <p>
      It is <b>mandatory</b>&#160;to call wait and notify inside synchronized block.
    </p>
    <p>
      How is it possible ? Because, once wait() is called it releases the lock it holds on object. This allows other threads to call wait() or notify() since they are inside synchronized.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      Wait-Notify code to avoid <b>Missed notify signals</b>&#160;and <b>Spurious wakeups</b>&#160;(wakeups with out any reason) :
    </p>
    <p>
      
    </p>
    <p>
      <b>public class MyWaitNotify </b>{
    </p>
    <p>
      &#160;
    </p>
    <p>
      &#160;&#160;&#160;MonitorObject myMonitorObject = new MonitorObject();
    </p>
    <p>
      &#160;&#160;&#160;boolean wasSignalled = false;
    </p>
    <p>
      
    </p>
    <p>
      &#160;&#160;&#160;public void doWait() {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;synchronized(myMonitorObject) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;while(!wasSignalled) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;try { myMonitorObject.wait(); } catch(InterruptedException ie) {}
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;}
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;wasSignalled = false;
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;}
    </p>
    <p>
      &#160;&#160;&#160;}
    </p>
    <p>
      
    </p>
    <p>
      &#160;&#160;&#160;public void doNotify() {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;synchronized(myMonitorObject) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;wasSignalled = true;
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;myMonitorObject.notify();
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;}
    </p>
    <p>
      &#160;&#160;&#160;}
    </p>
    <p>
      }
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1548961877262" ID="ID_1701385039" MODIFIED="1548971838742" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Locks</b>&#160;
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
