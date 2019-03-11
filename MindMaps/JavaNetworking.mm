<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548973407820" ID="ID_232299441" MODIFIED="1548973423309" TEXT="Java Networking">
<node CREATED="1548973425712" ID="ID_432342841" MODIFIED="1549037540476" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>JAVA</b>&#160;<b>IO</b>:
    </p>
    <p>
      
    </p>
    <p>
      Client&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;-----------------&#160;&#160;-&gt;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Server
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Open Connection&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Send Request&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Receive Response&#160;&#160;&#160;&#160;&#160;&#160;&lt;--
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Close Connection&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      Client opens a TCP/IP connection to server using <b>Java Socket</b>&#160;(by sending ip and port).
    </p>
    <p>
      To start a sever that listens for incoming connections use <b>Java Server Socket</b>.
    </p>
    <p>
      For <b>UDP</b>&#160;use <b>DatagramSocket</b>&#160;by sending <b>DatagramPacket</b>.
    </p>
    <p>
      
    </p>
    <p>
      *******************CLIENT CODE*******************
    </p>
    <p>
      Socket socket = new Socket(&quot;ip&quot;, &quot;port);
    </p>
    <p>
      // Write to Socket
    </p>
    <p>
      OutputStream out = socket.getOutputStream();
    </p>
    <p>
      out.write(&quot;Some data&quot;.getBytes());
    </p>
    <p>
      out.flush();
    </p>
    <p>
      out.close();
    </p>
    <p>
      
    </p>
    <p>
      /Read from Socket
    </p>
    <p>
      InputStream in = socket.getInputStream();
    </p>
    <p>
      int data = in.read();
    </p>
    <p>
      //Read more data
    </p>
    <p>
      in.close();
    </p>
    <p>
      
    </p>
    <p>
      socket.close();
    </p>
    <p>
      ************************************************
    </p>
    <p>
      *******************SERVER CODE********************
    </p>
    <p>
      ServerSocket serverSocket = new ServerSocket(9000);
    </p>
    <p>
      boolean isStopped = false;
    </p>
    <p>
      while(!isStopped) {
    </p>
    <p>
      &#160;&#160;Socket clientSocket = serverSocket.accept();
    </p>
    <p>
      &#160;&#160;// Do something with clientSocket.
    </p>
    <p>
      }
    </p>
    <p>
      
    </p>
    <p>
      /*
    </p>
    <p>
      &#160;*&#160;&#160;Only one incoming connection is opened
    </p>
    <p>
      &#160;*&#160;&#160;for each call to the accept() method.
    </p>
    <p>
      &#160;* accept is a blocking call.
    </p>
    <p>
      &#160;* Incoming connections <b>can only be accepted</b>&#160;when
    </p>
    <p>
      &#160;* the thread running the server has called accept().
    </p>
    <p>
      &#160;* Therefore the accepting thread normally passes
    </p>
    <p>
      &#160;* incoming connections (sockets) on to a pool of
    </p>
    <p>
      &#160;* worker threads, who then communicate with clients,
    </p>
    <p>
      */
    </p>
    <p>
      clientSocket.close();
    </p>
    <p>
      serverSocket.close();
    </p>
    <p>
      ****************************************************
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>UDP:</b>
    </p>
    <p>
      ************************************************
    </p>
    <p>
      <b>On Sending Side</b>:
    </p>
    <p>
      byte[] buffer = new byte[65508];
    </p>
    <p>
      InetAddress address = InetAddress.getByName(&quot;rp&quot;);
    </p>
    <p>
      DatagramPacket packet = new DatagramPacket(
    </p>
    <p>
      &#160;&#160;&#160;&#160;buffer, buffer.length, ip, port);
    </p>
    <p>
      DatagramSocket udpSocket = new DatagramSocket();
    </p>
    <p>
      udpSocket.send(packet);
    </p>
    <p>
      
    </p>
    <p>
      <b>On Receiving Side</b>:
    </p>
    <p>
      DatagramSocket udpSocket = new DatagramSocket(port);
    </p>
    <p>
      byte[] buffer = new byte[10];
    </p>
    <p>
      DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
    </p>
    <p>
      udpSocket.receive(packet);
    </p>
    <p>
      // Receive is a blocking call.
    </p>
    <p>
      ************************************************
    </p>
    <p>
      
    </p>
    <p>
      <b>URL &amp; URL Connection classes</b>:
    </p>
    <p>
      These classes are used to create client connections to web servers (HTTP servers).
    </p>
    <p>
      They can also be used to open a file on the local file system.
    </p>
    <p>
      ************************************************
    </p>
    <p>
      URL url = new URL(&quot;http://ip:port/uri&quot;);
    </p>
    <p>
      URLConnection urlConnection = url.openConnection();
    </p>
    <p>
      InputStream input = urlConnection.getInputStream();
    </p>
    <p>
      int data = input.read();
    </p>
    <p>
      while(data != -1) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;System.out.println((char) data);
    </p>
    <p>
      &#160;&#160;&#160;&#160;data = input.read();
    </p>
    <p>
      }
    </p>
    <p>
      input.close();
    </p>
    <p>
      // The above can be used against file:///&lt;local file path&gt; instead of http://ip:port/uri
    </p>
    <p>
      ************************************************
    </p>
    <p>
      
    </p>
    <p>
      The above is HTTP GET.
    </p>
    <p>
      To use HTTP POST:
    </p>
    <p>
      urlConnection.setDoOutput(true);
    </p>
    <p>
      OutputStream output = new urlConnection.getOutputStream();
    </p>
    <p>
      Then write data to this outputstream.
    </p>
    <p>
      
    </p>
    <p>
      Use JarURLConnection instead of URLConnection to get contents of jar file.
    </p>
    <p>
      JarURLConnection. getManifest() &amp; getJarFile().
    </p>
    <p>
      
    </p>
    <p>
      Instead of Ip, port we can use InetAddress class.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1549037543717" ID="ID_1742344316" MODIFIED="1549061836717" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>JAVA IO </b>:
    </p>
    <p>
      
    </p>
    <p>
      Deals with reading raw data from a source and writing raw data to destination.
    </p>
    <p>
      Source &amp; destination can be:
    </p>
    <ol>
      <li>
        Files
      </li>
      <li>
        Pipes
      </li>
      <li>
        Network Connections
      </li>
      <li>
        In-memory Buffers ( e.g: arrays)
      </li>
      <li>
        System.in, out, error.
      </li>
    </ol>
    <p>
      InputStream/Reader for reading.
    </p>
    <p>
      OutputStream/Writer for writing.
    </p>
    <p>
      
    </p>
    <table border="0" style="border-right-style: solid; border-top-width: 0; border-left-width: 0; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 0; width: 80%; border-top-style: solid; border-right-width: 0">
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Byte Based </b>
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Character Based </b>
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Input </b>
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Output </b>
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Input </b>
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            <b>Output</b>
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Basic
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            InputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            OutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            InputStreamReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            OutputStreamWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Arrays
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ByteArrayInputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ByteArrayOutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            CharArrayReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            CharArrayWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            File
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileInputStream
          </p>
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Random AccessFile
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileOutputStream
          </p>
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            RandomAccessFile
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Buffering
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            BufferedInputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            BufferedOutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            BufferedReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            BufferedWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Filtering
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FilterInputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FilterOutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FilterReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FilterWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Parsing
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            PushbackInputStream
          </p>
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            StreamTokenizer
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            PushbackReader
          </p>
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            LineNumberReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Strings
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            StringReader
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            StringWriter
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Data
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            DataInputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            DataOutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Objects
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ObjectInputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ObjectOutputStream
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 50%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; text-align: center; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
      </tr>
    </table>
    <p>
      
    </p>
    <p>
      Java Threads exchange complete Objects but if raw data has to be shared between threads then PipeInputStream,PipeOutputStream can be used.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>Arrays: </b>
    </p>
    <p>
      ******************************************************************************
    </p>
    <p>
      byte[] bytes = new byte[1024];
    </p>
    <p>
      // write data into byte array.
    </p>
    <p>
      InputStream input = new ByteArrayInputStream(bytes);
    </p>
    <p>
      int data = input.read();
    </p>
    <p>
      while(data != -1) {
    </p>
    <p>
      &#160;&#160;//do what ever with data
    </p>
    <p>
      &#160;&#160;//read next byte
    </p>
    <p>
      &#160;&#160;data = input.read();
    </p>
    <p>
      }
    </p>
    <p>
      --------------------------------------------------------
    </p>
    <p>
      ByteArrayOutputStream output = new ByteArrayOutputStream();
    </p>
    <p>
      output.write(&quot;String&quot;.getBytes(&quot;UTF-8&quot;));
    </p>
    <p>
      byte[] bytes = output.toByteArray();
    </p>
    <p>
      ******************************************************************************
    </p>
    <p>
      
    </p>
    <p>
      <b>Reading byte by byte is slow, hence use BufferedStreams:</b>
    </p>
    <p>
      InputStream input = new BufferedInputStream( new FileInputStream(&quot;C:\data&quot;));
    </p>
    <p>
      
    </p>
    <p>
      Similarly other streams that can be wrapper for <b>InputParsing</b>:
    </p>
    <ol>
      <li>
        PushbackInputStream&#160;&#160;--&gt; Read ahead a few bytes to see what is coming before reading whole stream. int data = input.read(); input.unread(data);
      </li>
      <li>
        PushbackReader
      </li>
      <li>
        StreamTokenizer
      </li>
      <li>
        PushbackReader
      </li>
      <li>
        LineNumberReader
      </li>
    </ol>
    <p>
      SequenceInputSteam --&gt; To combine two or more input streams into one.
    </p>
    <p>
      &#160;&#160;&#160;&#160;SequenceInputStream stream = new SequenceInputStream(new FileInputStream(&quot;C:\f1&quot;), new FileInputStream(&quot;C:\f2&quot;));
    </p>
    <p>
      can also be created by passing multiple sequenceInputStreams too.
    </p>
    <p>
      
    </p>
    <p>
      Can also use <b>try-with-resource</b>&#160;construct introduced in java 7; will close the stream automatically.(AutoClosable interface).
    </p>
    <p>
      
    </p>
    <p>
      Reader reader = new BufferedReader(new FileReader(...));
    </p>
    <p>
      
    </p>
    <p>
      <b>Do not have more than one thread </b>read from an InputSteam or Reader, write to an OutputStream or Writer.
    </p>
    <p>
      
    </p>
    <p>
      RandomAccessFile file = new RandomAccessFile(&quot;C:\file&quot;);
    </p>
    <p>
      file.seek(2000);&#160;&#160;&#160;&#160;// Positioning the file pointer at the location.
    </p>
    <p>
      long pointer = file.getFilePointer(); // Get current position of the file pointer.
    </p>
    <p>
      int aByte = file.read();
    </p>
    <p>
      file.write(&quot;String&quot;.getBytes());
    </p>
    <p>
      file.close();
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>File class</b>&#160;can do :
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Check if file or directory exists
      </li>
      <li>
        Create directory if not exists
      </li>
      <li>
        Read length of file
      </li>
      <li>
        Rename or move a file, Delete a file
      </li>
      <li>
        Check if path is file or directory
      </li>
      <li>
        Read list of files in a directory.
      </li>
    </ol>
    <p>
      BufferedInputStream optionally takes buffer size as a parameter.
    </p>
    <p>
      A multiple of block size of the hard disk is an optimal value as a buffer size.
    </p>
    <p>
      If the hard disk reads, say 64kb, of a file into its internal cache then it is better
    </p>
    <p>
      to pull all that data into the BufferedInputStream using one read operation.
    </p>
    <p>
      
    </p>
    <p>
      flush() is helpful for BufferedOutputStream to make sure the data in buffer is flushed to disk or network.
    </p>
    <p>
      
    </p>
    <p>
      DataInputStream is used to read primitive Java datatypes.
    </p>
    <p>
      
    </p>
    <p>
      <b>Serializing an Object</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Class implements marker interface Serializable
      </li>
      <li>
        new ObjectOutputStream(FileOutputStream).writeObject();
      </li>
      <li>
        new ObjectInputStream(FileInputStream).readObject(); (cast to that class)
      </li>
      <li>
        Mark non-serializable fields as <b>transient</b>
      </li>
    </ol>
    <p>
      The above is fine but it does not instantiate objects properly by calling constructor.
    </p>
    <p>
      So, any important logic in constructor is missed.
    </p>
    <p>
      This can be mitigated by moving the logic to a helper method.
    </p>
    <p>
      But in case of de-serialization, who ever implementing the deserialization logic
    </p>
    <p>
      should know that calling that helper method is critical.
    </p>
    <p>
      So, <b>to overcome this flaw, </b>use built-in feature of the serialization mechanism.
    </p>
    <p>
      i.e by providing following <b>private methods</b>&#160;inside the class.
    </p>
    <p>
      
    </p>
    <p>
      private void writeObject(ObjectOutputStream out) throws IOException;
    </p>
    <p>
      private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException;
    </p>
    <p>
      
    </p>
    <p>
      Virtualmachine will automatically check to see if either of these methods is declared during the corresponding method call.
    </p>
    <p>
      <b>Virtualmachine can call private methods</b>&#160;of your class whenever it wants but no other objects can.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <table border="0" style="border-right-style: solid; border-top-width: 0; border-left-width: 0; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 0; width: 80%; border-top-style: solid; border-right-width: 0">
      <tr>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 33%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            MyClass obj = new MyClass();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileOutputStream fos = new FileOutputStream(&quot;C:\file&quot;);
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ObjectOutputStream oos = new ObjectOutputStream(fos);
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            out.writeObject(obj);
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            out.close();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ********************************************************
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            FileInputStream fis = new FileInputStream(&quot;C:\file&quot;);
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            ObjectInputStream ois = new ObjectInputStream(fis);
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            MyClass obj = (MyClass) ois.readObject();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            in.close();
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 33%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            MyClass implements Serializable, Runnable {
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160; <b>transient</b>&#160;private Thread monitor;
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160;&#160;private void writeObject(ObjectOutputStream out) throws IOException {
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160;&#160;&#160;&#160;out.defaultWriteObject();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            }
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160;&#160;private void readObject(ObjectInputStream in) throws IOException {
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160;&#160;&#160;&#160;in.defaultReadObject();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            &#160;&#160;&#160; <b>ImportantHelperMethod</b>();
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            }
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            }
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            /*<b>Use above methods to even stop serialization by throwing exceptions inside the above methods</b>.*/
          </p>
        </td>
        <td valign="top" style="border-right-style: solid; border-top-width: 1; border-left-width: 1; border-left-style: solid; border-bottom-style: solid; border-bottom-width: 1; width: 33%; border-top-style: solid; border-right-width: 1">
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Create your own protocol with the <b>Externalizable</b>&#160;interface.
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            public void writeExternal(ObjectOutput out) throws IOException;
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            Just like earlier, calling oos.writeObject &amp; ois.readObject will automatically call writeExternal &amp; readExternal.
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
          <p style="margin-left: 1; margin-top: 1; margin-right: 1; margin-bottom: 1">
            
          </p>
        </td>
      </tr>
    </table>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>Caching Objects in the stream </b>:
    </p>
    <p>
      
    </p>
    <p>
      ObjectOutputStream out = new ObjectOutputStream();
    </p>
    <p>
      MyClass obj = new MyClass();
    </p>
    <p>
      obj.setState(100);
    </p>
    <p>
      oos.writeObject(obj);&#160;&#160;&#160;// saves object state with state=100
    </p>
    <p>
      obj.setState(200);
    </p>
    <p>
      out.writeObject(obj);&#160;&#160;&#160;// <font color="#ff0000">Does not save new object state. </font>
    </p>
    <p>
      
    </p>
    <p>
      <font color="#00ff00">oos.close() or oos.reset() should be called. </font>
    </p>
    <p>
      
    </p>
    <p>
      <font color="#000000"><b>Version Control </b></font>
    </p>
    <p>
      <font color="#000000">After object is serialzed, if the class had added methods or fields then de-serializing will throw java.io.InvalidClassException. </font>
    </p>
    <p>
      <font color="#000000">To overcome, set the serialVersionUID to be the same as original class. </font>
    </p>
    <p>
      <font color="#000000">Use the jdk tool, serialVer &lt;Class&gt; </font>
    </p>
    <p>
      
    </p>
    <p>
      <font color="#000000">Very important to close the objectstreams as soon as done writing. </font>
    </p>
    <p>
      <font color="#000000">Otherwise GC may not claim that object since it wil be referred by the stream. </font>
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      LineNumberReader, StreamTokenizer, PrintWriter, StringReader &amp; Writer.
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
