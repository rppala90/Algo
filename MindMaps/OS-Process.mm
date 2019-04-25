<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1556230973142" ID="ID_1398456414" MODIFIED="1556230981016" TEXT="OS Process">
<node CREATED="1556230985361" ID="ID_754499718" MODIFIED="1556232449767" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Process Concept </b>:
    </p>
    <p>
      
    </p>
    <p>
      Program is a passive entity that has some text in it.
    </p>
    <p>
      Process is an active entity, with a program counter specifying the next instruction to execute and a set of associated resources.
    </p>
    <p>
      
    </p>
    <p>
      A program becomes process when an executable file is loaded into memory.
    </p>
    <p>
      
    </p>
    <p>
      Process in memory has : text, data, heap and stack.
    </p>
    <p>
      <b>Text</b>&#160;-&gt; contains Program code.
    </p>
    <p>
      <b>Current activity</b>&#160;-&gt; represented by the value of the program counter and the contents of the processor's registers.
    </p>
    <p>
      <b>Stack</b>&#160;-&gt; Contains temporary data such as function parameters, return address, local variables.
    </p>
    <p>
      <b>Data</b>&#160;-&gt; contains global variables.
    </p>
    <p>
      <b>Heap</b>&#160;-&gt; Dynamically allocated memory during process runtime.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>States</b>: New, Running, Waiting, Ready, Terminated.
    </p>
    <p>
      
    </p>
    <p>
      <b>Process Control Block PBC (or) Task control block</b>&#160;:
    </p>
    <p>
      Each process in OS is represented by PBC.
    </p>
    <p>
      PBC contains Process state: Program counter, CPU registers, CPU-schedling information, Memory-Management Information, Accounting Information, I/O status information.
    </p>
    <p>
      
    </p>
    <p>
      CPU switch from process to process requires saving process state into PCBi and loading new process state from PCBj.
    </p>
    <p>
      PCB simply serves as the repository for any information that may vary from process to process.
    </p>
    <p>
      
    </p>
    <p>
      On systems that supports threads, the PCB is expanded to include information for each thread.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
