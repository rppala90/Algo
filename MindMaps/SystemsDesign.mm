<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1555705164000" ID="ID_1215045314" MODIFIED="1555731630091" TEXT="Systems Design">
<node CREATED="1555705237192" ID="ID_218287935" MODIFIED="1555711679058" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <b>Interview Tips</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        NAIL DOWN THE&#160;<b>FEATURES</b>.
      </li>
      <li>
        Ask questions to reduce scope and nail down minimum viable product.
      </li>
      <li>
        How much to scale ?
      </li>
      <li>
        Do not use Buzzword.
      </li>
      <li>
        Clear and Organized thinking. (first define 50,000 feet of the problem before going into details.)

        <ol>
          <li>
            all APIs.
          </li>
          <li>
            Actors for the system.
          </li>
          <li>
            Draw all boxes.
          </li>
        </ol>
      </li>
      <li>
        Drive discussion. ( 80 - 20 rule so atleast 20% interviewer talks)
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      <b>Basic Features</b>:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Features ( Define Minimal viable features) . --&gt; Facebook messenger (1to1 chat, exclude group messaging etc...)
      </li>
      <li>
        Define APIs . (what , who is going to use, how to call)
      </li>
      <li>
        Availability ( How available this service is ?)
      </li>
      <li>
        Latency Performance ( If customer facing request, system should be super fast ? will cache help etc..)
      </li>
      <li>
        Scalability ( How many users should be supported ?)
      </li>
      <li>
        Durability (Data stored securely in database, not lost and not compromised)
      </li>
      <li>
        Class Diagram ( Design parking lot, elevator system -- OOP principles, classes )
      </li>
      <li>
        Security &amp; Privacy
      </li>
      <li>
        Cost effective.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>Concepts</b>&#160;:
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        Http / Http2 Vs websockets
      </li>
      <li>
        TCP/IP model
      </li>
      <li>
        IP4 vs IP6
      </li>
      <li>
        TCP vs UDP
      </li>
      <li>
        DNS lookup
      </li>
      <li>
        HTTPS &amp; TLS
      </li>
      <li>
        public key infrastructure and certificate authority
      </li>
      <li>
        Symmetric and Asymmetric key
      </li>
      <li>
        Load balancer L4 and L7 (nginx)
      </li>
      <li>
        CDNs and Edge
      </li>
      <li>
        Bloom filters and count-min sketch
      </li>
      <li>
        Paxos - consenus over distributed hosts. Leader election.
      </li>
      <li>
        Design Patterns and Object Oriented Design
      </li>
      <li>
        Virtual machines and containers. (Docker - kubernetes / Mesos)
      </li>
      <li>
        Publisher subscriber (Kafka) or Queue
      </li>
      <li>
        Map reduce. (Hadoop / Spark -- HDFS --&gt; Java based distributed file system).
      </li>
      <li>
        Multi threading, concurrency, locks. synchronization, Compare And Set
      </li>
      <li>
        Vertical and Horizontal scaling
      </li>
      <li>
        CAP theorem
      </li>
      <li>
        ACID vs BASE (Basically available soft state eventual consistency)
      </li>
      <li>
        Partitioning and sharding Data - consistent hashing
      </li>
      <li>
        Optimistic vs Pessimistic locking
      </li>
      <li>
        Strong vs Eventual consistency
      </li>
      <li>
        Relational DB vs NoSQL
      </li>
      <li>
        Types of NOSQL --&gt; key value, wide column (cassandra) , document based (mongo db / couchbase), graph based.
      </li>
      <li>
        Caching . (memcachd, redis--cluster--)
      </li>
      <li>
        Centralized configuration management ( zookeeper) - leader election, distributed locking. Scales good for reads but not much for write.
      </li>
      <li>
        Data center / Racks / hosts
      </li>
      <li>
        CPU / memory / Harddrive / Network bandwidth
      </li>
      <li>
        Random vs Sequential read/write on disk.
      </li>
      <li>
        solr / elastic search (full text search)
      </li>
      <li>
        Blobstore like amazon s3.
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      https://www.edureka.co/blog/apache-hadoop-hdfs-architecture/
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1555731633471" ID="ID_1773154787" MODIFIED="1555767604418" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      DESIGN TINY URL :
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1555798834899" ID="ID_635741212" MODIFIED="1555802157124" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      DISTRIBUTED SYSTEMS :
    </p>
    <p>
      
    </p>
    <ol>
      <li>
        computers operate concurrently
      </li>
      <li>
        Computers fail independently
      </li>
      <li>
        Computers do not share global clock.
      </li>
    </ol>
    <p>
      
    </p>
    <ol>
      <li>
        Storage

        <ol>
          <li>
            Single - Master Storage

            <ol>
              <li>
                Lot of reads tire the single system. --&gt; Hence Read Replication. This breaks consistency.
              </li>
              <li>
                Sharding --&gt; Since writes may also tire the single system.

                <ol>
                  <li>
                    Break up database based on some key. Each shard is given read replication for read fasts.
                  </li>
                  <li>
                    Joining across shards may not be possible.
                  </li>
                </ol>
              </li>
            </ol>
          </li>
          <li>
            Consistent Hashing

            <ol>
              <li>
                Replication (copies go to next nodes in the circle.)
              </li>
              <li>
                Consistency --&gt; so now three copies on three nodes. If one of nodes is down when the write happens and then the other two will have new value so who is telling the truth ?&#160;&#160;&#160;if R + W &gt; N then strong consistency.
              </li>
            </ol>
          </li>
          <li>
            CAP Theorem

            <ol>
              <li>
                A distributed database needs 3 properties: consistencty, Available, Partition Tolerant.
              </li>
              <li>
                Can not have all three...
              </li>
            </ol>
          </li>
        </ol>
      </li>
      <li>
        Computation

        <ol>
          <li>
            Map Reduce --&gt;&#160;&#160;word count.&#160;&#160;&#160;Dump text into MAP function which would tokenize it (split into words) and turn into key-value pairs ( word: count) then SHUFFLE words to different computers such that similar words are together and then take collection of these similar words and dump up into REDUCE function .
          </li>
          <li>
            SPARK --&gt; scatter / gather paradigm.&#160;&#160;Underlying paradigm is still simillar to Map Reduce.
          </li>
          <li>
            KAFKA&#160;&#160;--&gt;&#160;&#160;Focus on real -time analysis.

            <ol>
              <li>
                Streams and Streams only.
              </li>
              <li>
                &#160;
              </li>
            </ol>
          </li>
        </ol>
      </li>
      <li>
        Messaging

        <ol>
          <li>
            consumed by subscribers.
          </li>
          <li>
            Loosely coupling subsystems.
          </li>
          <li>
            Created by one or more producers.
          </li>
          <li>
            Processed by brokers ( computer) and organized into topics.
          </li>
          <li>
            Usually persistant over the short term.
          </li>
          <li>
            What if producers becomes big ??&#160;&#160;(Topic retains too much data)

            <ol>
              <li>
                Split into multiple topics.
              </li>
              <li>
                Ofcourse replicate the topics too for fault tolerance.
              </li>
              <li>
                each partiton (topic) is ordered.
              </li>
              <li>
                whole system wide ordering is lost.
              </li>
            </ol>
          </li>
          <li>
            How strong can we guarantee delivery ?
          </li>
          <li>
            Lambda architecture

            <ol>
              <li>
                Long term storage.&#160;&#160;&#160;&#160;Batch Processing.&#160;&#160;&#160;&#160;Slow, complete.
              </li>
              <li>
                Temporary Queuing,.&#160;&#160;Stream processing.&#160;&#160;Fast Summaries.
              </li>
            </ol>
          </li>
          <li>
            With Streams. --&gt; Distributed Messaging.
          </li>
        </ol>
      </li>
    </ol>
  </body>
</html>
</richcontent>
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
</map>
