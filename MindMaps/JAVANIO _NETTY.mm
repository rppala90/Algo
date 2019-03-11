<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1549061840821" ID="ID_1733413734" MODIFIED="1549062051947">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p style="text-align: center">
      JAVA NIO &amp; NETTY
    </p>
    <p style="text-align: center">
      Non-blocking IO.
    </p>
  </body>
</html></richcontent>
<node CREATED="1549061912400" ID="ID_1072207970" MODIFIED="1549167038426" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      byte <b>Streams</b>&#160;&amp; character <b>Streams</b>.
    </p>
    <p>
      
    </p>
    <p>
      Read from a <b>Channe</b>l into a <b>buffer</b>.
    </p>
    <p>
      Written from a <b>buffer</b>&#160;into a <b>Channel</b>.
    </p>
    <p>
      
    </p>
    <p>
      A <b>Selector</b>&#160;is an object that can monitor multiple channels for events (like Connection opened, data arrived etc..). Thus a single thread can monitor multiple channels for data.
    </p>
    <p>
      
    </p>
    <p>
      <b>Utility Classes</b>: Pipe, FileLock.
    </p>
    <p>
      
    </p>
    <p>
      Channels:
    </p>
    <ol>
      <li>
        File Channel&#160;&#160;// Can not be switched into non-blocking, hence can not register with selector.
      </li>
      <li>
        Datagram Channel
      </li>
      <li>
        SocketChannel
      </li>
      <li>
        ServerSocketChannel
      </li>
    </ol>
    <p>
      Buffers:
    </p>
    <ol>
      <li>
        ByteBuffer and all other data types.
      </li>
      <li>
        MemoryByteBuffer for memory mapped files.
      </li>
    </ol>
    <p>
      A selector allows a single thread to handle multiple channels.
    </p>
    <p>
      To use Selector you register channels with it.
    </p>
    <p>
      Then call its select method.
    </p>
    <p>
      This method blocks until there is an event ready for one of the registered channels.
    </p>
    <p>
      Once the method returns, the thread can then process these events.
    </p>
    <p>
      
    </p>
    <p>
      Channels are similar to Streams except:
    </p>
    <ol>
      <li>
        You can both read and write to a channel, Streams are typically one way.
      </li>
      <li>
        Channels can be read and written asynchronously.
      </li>
      <li>
        Channels always read to, or write from, a Buffer.
      </li>
    </ol>
    <p>
      **********************************FILE CHANNEL**************************************
    </p>
    <p>
      RandomAccessFile aFile = new RandomAccessFile(&quot;fileName&quot;, &quot;rw&quot;);
    </p>
    <p>
      FileChannel inChannel = aFile.getChannel();
    </p>
    <p>
      ByteBuffer buf = ByteBuffer.allocate(48);
    </p>
    <p>
      int bytesRead = inChannel.read(buf);
    </p>
    <p>
      while(byteRead != -1) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;System.out.println(&quot;Read &quot; + bytesRead);
    </p>
    <p>
      &#160;&#160;&#160;&#160;buf.flip();&#160;&#160;&#160;// To flip from writing into buffer to reading from buffer.
    </p>
    <p>
      &#160;&#160;&#160;while(buf.hasRemaining()) {
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;System.out.print((char) buf.get());
    </p>
    <p>
      &#160;&#160;&#160;}
    </p>
    <p>
      &#160;&#160;&#160;buf.clear();
    </p>
    <p>
      &#160;&#160;&#160;bytesRead = inChannel.read(buf);
    </p>
    <p>
      }
    </p>
    <p>
      aFile.close();
    </p>
    <p>
      *************************************************************************************
    </p>
    <p>
      
    </p>
    <p>
      A <b>buffer</b>&#160;is essentially a block of memory into which you can write data, which you can then later read again.
    </p>
    <p>
      This memory block is wrapped in a NIO Buffer object, which provides a set of methods to assess it.
    </p>
    <ol>
      <li>
        Write data to Buffer.
      </li>
      <li>
        Call buffer.flip()
      </li>
      <li>
        Read data out of Buffer.
      </li>
      <li>
        Call buffer.clear() or buffer.compact() // Clear all or Clear data that was already read.
      </li>
    </ol>
    <p>
      Buffer has 3 properties : capacity, position, limit.
    </p>
    <p>
      Capacity pointer will always be max capacity of the buffer.
    </p>
    <p>
      Position will start at 0 and keep moving as new bytes are read.
    </p>
    <p>
      Limit pointer will be at how much data you can write into buffer.
    </p>
    <p>
      When buffer.flip() is called, limit is set to the same place as position.
    </p>
    <p>
      position will be reset to 0 and position is advanced as bytes are read.
    </p>
    <p>
      
    </p>
    <p>
      <b>Scattering Reads &amp; Gathering Writes </b>:
    </p>
    <p>
      Read data from a single channel into multiple buffers.
    </p>
    <p>
      Write data from multiple buffers into single channel.
    </p>
    <p>
      
    </p>
    <p>
      <b>Selector</b>: Helps to have single thread handle multiple channels. ( Avoid cost of multithreading).
    </p>
    <p>
      
    </p>
    <p>
      Selector selector = Selector.open();
    </p>
    <p>
      
    </p>
    <p>
      channel.configureBlocking(false);
    </p>
    <p>
      SelectionKey key = channel.register(selector, SelectionKey.OP_READ); // Register channel with selector.
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        SelectionKey.OP_CONNECT
      </li>
      <li>
        SelectionKey.OP_ACCEPT
      </li>
      <li>
        SelectionKey.OP_READ
      </li>
      <li>
        SelectionKey.OP_WRITE
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      Attach an object to selectionkey or while registering channel for recognizing a given channel.
    </p>
    <p>
      
    </p>
    <p>
      <b>Selecting channels via Selector</b>:
    </p>
    <p>
      select() --&gt; blocked untill atleast one channel is ready for the events you registered for.
    </p>
    <p>
      select(long)
    </p>
    <p>
      selectNow() --&gt; doesn't block. It returns immediately with whatever channels are ready.
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
