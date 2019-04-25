<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1553351205388" ID="ID_296982116" MODIFIED="1553357548361" TEXT="DDOS &amp; CDN">
<node CREATED="1553351216309" ID="ID_640054333" MODIFIED="1553355635510" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Denial Of Service attack is&#160;a malicious attempt to disrupt normal traffic of a targeted server, service or network by overwhelming the target or its surrounding infrastructure with a flood of Internet traffic.
    </p>
    <p>
      
    </p>
    <p>
      <b>Anology</b>: Traffic Jam clogging the highways, preventing regular traffic from arriving at its desired destination.
    </p>
    <p>
      
    </p>
    <p>
      Attacker creates botnet using malware on group of regular internet connected devices. Because each bot is a legitimate Internet device, separating attack traffic from normal traffic can be difficult.
    </p>
    <p>
      
    </p>
    <p>
      <b>Common types of DDOS</b>:
    </p>
    <ol>
      <li>
        Application Layer Attacks:
      </li>
      <li>
        HTTP Flood
      </li>
      <li>
        Protocol Attack
      </li>
      <li>
        SYN FLOOD
      </li>
      <li>
        Volumetric Attack
      </li>
      <li>
        DNS Amplification
      </li>
    </ol>
    <p>
      <b>Mitigation Process</b>:
    </p>
    <ol>
      <li>
        Black Hole Routing
      </li>
      <li>
        Rate Limiting
      </li>
      <li>
        Web Application Firewall
      </li>
      <li>
        Anycast network Diffusion
      </li>
    </ol>
    <p>
      
    </p>
    <p>
      <b>HTTP Flood</b>:
    </p>
    <p>
      &#160;&#160;&#160;&#160;This attack is similar to pressing refresh in a web browser over and over on many different computers at once - large number of HTTP requests flood the server, resulting in denial of service.
    </p>
    <p>
      &#160;&#160;Simple implementations access one URL with same range of attacking ips, referrers and user agents.
    </p>
    <p>
      &#160;&#160;Complex implementations access large number of attacking IP address, and target random urls using random referrers and user agents.
    </p>
    <p>
      
    </p>
    <p>
      <b>SYN Flood</b>:
    </p>
    <p>
      This attack exploits TCP handshake by sending a target a large number of TCP initial connection request (SYN packets) with spoofed source IP address. The target machine responds to each connection and waits for final step of handshake which never occurs.
    </p>
    <p>
      
    </p>
    <p>
      <b>DNS Amplification</b>:
    </p>
    <p>
      A simple request for everything by spoofing source IP as target IP will result in a longer response from DNS to the targetIP.
    </p>
    <p>
      Mitigation is to not open DNSResolver to public but instead to restrict the access only to the devices originated within a trusted domain.
    </p>
    <p>
      
    </p>
    <p>
      <b>Spoofing Mitigation</b>:
    </p>
    <p>
      Packet Filtering is one defence against IP spoofing attacks.
    </p>
    <p>
      The gateway to a network usually performs ingress filtering, which is blocking of packets from outside the network with a source address inside the network. Also egress filtering on outgoing packets, which is blocking packets from inside of network with a source address that is not inside.
    </p>
    <p>
      
    </p>
    <p>
      It is also recommended to design network protocols and services so that they do not rely on the sourceIP address for authentication.
    </p>
    <p>
      
    </p>
    <p>
      
    </p>
    <p>
      <b>What is HTTP referrer</b>&#160;?
    </p>
    <p>
      When visiting a webpage, the referrer or referring page is the URL of the previous webpage from which a link was followed.
    </p>
    <p>
      <b>What is User Agent </b>?
    </p>
    <p>
      User agent is a string identifying the browser and operating system to the web server.
    </p>
    <p>
      <b>TCP HandShake </b>:
    </p>
    <p>
      Source sends SYN &quot;initial request&quot; to target server.
    </p>
    <p>
      Target sends SYN-ACK to agree to the process.
    </p>
    <p>
      Lastly, source sends ACK packet to the target to confirm the process.
    </p>
    <p>
      After this message content can be sent.
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1553357552627" ID="ID_806431826" MODIFIED="1553370891575" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      CDN - Content Delivery Network.
    </p>
    <p>
      
    </p>
    <p>
      Allows for quick transfer of assets needed for loading internet content including html pages, js, images, videos.
    </p>
    <p>
      Also protect websites against common malicious attacks such as DDOS attacks.
    </p>
    <p>
      
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</map>
