<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1548455111683" ID="ID_606969410" MODIFIED="1553744543292" TEXT="Java Collections">
<node CREATED="1548628326200" ID="ID_1312194909" MODIFIED="1551214382333" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Iterable (iterator) --&gt;&#160;&#160;Collection (size) --&gt;&#160;&#160;List
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;--&gt;&#160;&#160;Set&#160;&#160;--&gt; SortedSet&#160;&#160;--&gt;&#160;&#160;Navigable Set
    </p>
    <p>
      &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; --&gt;&#160;&#160;Queue&#160;&#160;--&gt;&#160;&#160;Dequeue
    </p>
    <p>
      
    </p>
    <p>
      <b>List Implemetations</b>:&#160;&#160;ArrayList, LinkedList, Vector, Stack.
    </p>
    <p>
      
    </p>
    <p>
      Collections.sort()&#160;&#160;( can be sorted using natural order{comparable} or comparator).
    </p>
    <p>
      
    </p>
    <p>
      <b>Set Implementations</b>: EnumSet, HashSet, LinkedHashSet, TreeSet
    </p>
    <p>
      Set.Stream()
    </p>
    <p>
      
    </p>
    <p>
      SortedSet a = new TreeSet();
    </p>
    <p>
      Comparator c = new MyComparator();
    </p>
    <p>
      SortedSet b = new TreeSet(c);
    </p>
    <p>
      
    </p>
    <p>
      <b>TreeSet</b>&#160;is an implementation of NavigatableSet.
    </p>
    <p>
      
    </p>
    <p>
      <b>Queue </b>implementations&#160;LinkedList and PriorityQueue.
    </p>
    <p>
      PriorityQueue stores its elements internally to their natural order( if they implement <b>comparable</b>), or according to a <b>Comparator</b>&#160;passed to the PriorityQueue.
    </p>
    <p>
      
    </p>
    <p>
      Java <b>DeQue&#160;</b>represents a double ended queue.&#160;Add and remove elements from both ends of the queue.
    </p>
    <p>
      LinkedList and ArrayDeque are the implementations.
    </p>
    <p>
      
    </p>
    <p>
      <b>Stack&#160;LIFO Queue FIFO </b>
    </p>
    <p>
      
    </p>
    <p>
      <b>hashCode and Equals ( Buckets) for hashmap. </b>
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>Priority Queue</b>&#160;supports 3 primary operations: Insert, Find-Min/Max, delete-Min/Max.
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1548628571567" ID="ID_1912908470" MODIFIED="1553744963503" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Map (keyset(), valueset())&#160;&#160;--&gt;&#160;&#160;Sorted Map&#160;&#160;--&gt;&#160;&#160;Navigable Map.
    </p>
    <p>
      
    </p>
    <p>
      Map is not subtype of Collection.
    </p>
    <p>
      <b>Map Implementations</b>:&#160;&#160;HashMap, Hashtable. EnumMap, IdentityHashMap, LinkedHashMap, Properties, TreeMap, WeakHashMap.
    </p>
    <p>
      
    </p>
    <p>
      HashMap : No ordering. TreeMap : Ordered.
    </p>
    <p>
      TreeMap is an implementation of both SortableMap and NavigableMap
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1548691516306" ID="ID_1768853296" MODIFIED="1548692271789" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      FAQ:
    </p>
    <p>
      
    </p>
    <p>
      1. Iterator Vs Enumerator:&#160;
    </p>
    <ol>
      <li>
        Iterator has remove method where as enumerator is used only to traverse.
      </li>
      <li>
        Enumerator is used to traverse only legacy classes like Vector, HashTable &amp; stack.
      </li>
      <li>
        Iterator is fail-fast: throws concurrentmodification if the collection is modified outside the iterators remove method. Enumerator does not throw any exception in the same case.
      </li>
      <li>
        Iterator preferred over Enumerator.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      2. List Vs Set:
    </p>
    <ol>
      <li>
        Duplicates allowed in List and not allowed in Set.
      </li>
      <li>
        List is ordered and set is not ordered.
      </li>
    </ol>
  </body>
</html></richcontent>
</node>
<node CREATED="1548697013211" ID="ID_1710929978" MODIFIED="1548699161945" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Streams - Java 8. </b>
    </p>
    <p>
      
    </p>
    <p>
      Functional programming approach to iterating and processing elements of a collection.
    </p>
    <p>
      
    </p>
    <p>
      With Java Collections iteration has to be implemented by the user but&#160; Streams are capable of internal iteration of its elements by itself.
    </p>
    <p>
      
    </p>
    <p>
      <b>Stream Processing: </b>
    </p>
    <p>
      Attach listeners to the stream. These listeners are called when the steam iterates elements internally.&#160;The listeners are called once for each element in the stream. Listeners of stream for a chain.
    </p>
    <p>
      
    </p>
    <p>
      <b>Non-terminal operation</b>&#160;is an operation that adds a listener to the stream with out doing anything else.
    </p>
    <p>
      <b>Terminal operation</b>&#160;is an operation that starts the internal iteration of the elements, calls all the listeners and returns a result.
    </p>
    <p>
      
    </p>
    <p>
      <b>Non-terminal operations:&#160;</b>filter, map, flatMap, distinct, limit, peek.
    </p>
    <p>
      <b>Terminal operations:&#160;</b>anyMatch, allMatch, noneMatch, collect, count, findAny, findFirst, forEach, min, max, reduce, toArray
    </p>
    <p>
      
    </p>
    <p>
      Stream.concat(stream1, stream2);
    </p>
    <p>
      Stream.of(&quot;one&quot;, &quot;two&quot;, &quot;three&quot;);
    </p>
    <p>
      
    </p>
    <p>
      The iteration on the stream starts when terminal operation is called.
    </p>
  </body>
</html></richcontent>
</node>
</node>
</map>
