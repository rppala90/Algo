<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1552321551681" ID="ID_1801073708" MODIFIED="1552321579636">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Linux FileSystem
    </p>
    <p>
      https://opensource.com/article/18/4/ext4-filesystem
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1552321564591" ID="ID_1181651943" MODIFIED="1552327348474" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ext 2/3/4&#160;&#160;brtfs, zfs, xfs.
    </p>
    <p>
      
    </p>
    <p>
      <b>ext</b>:&#160;&#160;1991.
    </p>
    <p>
      used new virtual file system abstraction layer in the linux kernel.
    </p>
    <p>
      can handle up to 2GB of storage.
    </p>
    <p>
      Its primitive timestamping -- only one per file -- rather than 3 separate creation, access and modify times.
    </p>
    <p>
      
    </p>
    <p>
      <b>ext2</b>:
    </p>
    <p>
      offered max filesizes in GBs and filesystem sizes in terabytes.
    </p>
    <p>
      Prone to catastrophic corruption if the system crashed or lost power while data was being written to disk.
    </p>
    <p>
      Performance losses due to fragmentation.
    </p>
    <p>
      
    </p>
    <p>
      <b>ext3</b>:
    </p>
    <p>
      Used <b>Journaling</b>&#160;to solve the catastrophic corruption issues.
    </p>
    <p>
      Journal is a special allocation on disk where writes are stored in transactions.
    </p>
    <p>
      If the transaction finishes writing to disk, its data in the journal is committed to the filesystem itself.
    </p>
    <p>
      If the system crashes before the operation is committed then the newly rebooted system recognizes it as incomplete transaction and rolls it back as though it never happened.
    </p>
    <p>
      Meaning the file being worked on may still be lost but the filesystem will not be corrupted.
    </p>
    <p>
      THREE levels of journaling:
    </p>
    <ol>
      <li>
        Journal&#160;&#160;- lowest risk mode. Both data and metadata are written into the journal before committing it to the filesystem. This ensures consistency of the file being written to as well as filesystem as a whole but can significantly reduce performance.
      </li>
      <li>
        Ordered - Metadata writes to journal but commits data directly to filesystem. In event of crash, the metadata associated with incomplete writes is still in the journal, and the filesystem can sanitize those incomplete writes while rolling back the journal. Order of operations is very rigid. A crash may result in corruption of files being actively written during crash but the filesystem itself are guaranteed safe.
      </li>
      <li>
        Writeback - Least safe. Metadata is journaled and data is not just like in Ordered. Metadata and data may be written in whatever order that may make sense for best performance. Eventhough the filesystem will not be corrupted there is a chance for the file that were written during the crash to be corrupted.
      </li>
    </ol>
    <p>
      Blocksize of 4k, file size of 2 TiB, max filesystem size of 16TiB.
    </p>
    <p>
      
    </p>
    <p>
      <b>ext4</b>:
    </p>
    <p>
      Large filesystem support.
    </p>
    <p>
      Improved resistance to fragmentation.
    </p>
    <p>
      Higher performance and improved timestamps.
    </p>
    <p>
      Uses 48-bit internal addressing, allowing filesize of 16TiB on filesystems up to 1,000,000 TiB.
    </p>
    <p>
      Has following improvements in the ways storage blocks are allocated before writing to disk:
    </p>
    <ul>
      <li>
        <b>Extents</b>&#160;:&#160;&#160;is a range of contiguous physical blocks that can be reserved and addressed at once. Helps in reducing inodes required by a given file and significantly decreases fragmentation and increases performance when writing large files.
      </li>
      <li>
        <b>Mutiblock allocation</b>&#160;: When preallocating disk space for a file, most file systems must write zeros to the blocks for that file on creation. Ext4 allows use of fallocate() which guarantees availability of space with out first needing to write to it. This improved performance.
      </li>
      <li>
        <b>Delayed allocation </b>: This allows ext4 to wait to allocate the actual blocks it will write data to until it's ready to commit that data to disk. (In contrast, ext3 allocate blocks immediately, even while the data is flowing into a write cache.) This helps reduced fragmentation and improved performance. But this has the following <b>drawback</b>: Earlier if programmer closes a file after write then that is sufficient to guarantee that the contents of the file are flushed to disk. There is very little risk of losing the data if a crash occurs after the file is closed.
      </li>
    </ul>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
