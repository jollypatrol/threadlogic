/**
 * Copyright (c) 2012 egross, sabha.
 * 
 * ThreadLogic - parses thread dumps and provides analysis/guidance
 * It is based on the popular TDA tool.  Thank you!
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */
package com.oracle.ateam.threadlogic.advisories;

public class ThreadLogicConstants {

  public static final int BLOCKED_THREADS_THRESHOLD = 3;

  public static final int THREAD_STACK_OFFSET = 3;
  public static final int MIN_THREADSTACK_LEN_TO_CONSIDER = 10;
  public static final int MAX_THREADSTACK_LEN_SUBSET = 20;

  // Min size of the thread stack depth to be considered active/busy and
  // involved in some application activity
  public static final int ACTIVETHREAD_STACKDEPTH = 15;

  // Min number of occurences of a pattern before it can be tagged as a Hot
  // method call..
  public static final int HOT_CALL_MIN_OCCURENCE = 5;

  public static final String FINALIZER_THREAD = "Finalize";
  public static final String FINALIZER_THREAD_BLOCKED = "Finalizer.doFinalize";
  public static final String PARALLEL_GC_THREADS = "ParallelGCThreads";

  public static final String WLS_MUXER_THREADS = "WebLogic Muxer Threads";

  public static final String STUCK_PATTERN = "STUCK";
  public static final String DEADLOCK_PATTERN = "DEADLOCK";
  public static final String REENTRANTLOCK_PATTERN = "ReentrantLock";
  public static final String SOCKET_READ = "SocketInputStream.socketRead";
  public static final String SERVLET_PATTERN1 = "HttpServlet.service";
  public static final String SERVLET_PATTERN2 = "ServletRequestImpl.run";
  public static final String DB_STMT_EXECUTE = "Statement.executeQuery";
  public static final String DB_PSTMT_EXECUTE = "PreparedStatement.execute";

  public static final String HOT_CALL_PATTERN = "HotCallPattern";
  public static final String BLOCKED_THREADS = "BlockedThreads";
  public static final String CONTENTION_FOR_UNOWNED_LOCK = "ContentionForUnownedLock";
  public static final String WAITING_WHILE_BLOCKING = "WaitWhileBlockingPattern";
  public static final String WAITING_INSIDE_WEBLAYER = "WebLayerBlocked";
  public static final String MUXER_WAITING = "MuxerWaiting";
  public static final String WLS_JMS_QUEUE_BOTTLENECK = "WLSJMSQueueBottleneck";
  public static final String WLSMUXER_PROCESS_SOCKETS = "SocketMuxer.processSockets";
  public static final String WLS_SUBSYSTEM_REQUEST_OVERFLOW = "WLSSubsystemRequestOverflow";
  public static final String WLS_CLUSTER_MESSAGERECEIVER_RUNNING = "MessageReceiverRunning";
  
  public static final String AQ_ADAPTER_POLLER = "oracle.tip.adapter.db.inbound.InboundWorkWrapper";
  public static final String IWAY_SAP_POLLER = "com.ibi.sap30.inbound.SapInboundAdapter$MasterThread";
  public static final String GENERIC_POLLER = "poll";
  public static final String GENERIC_SELECT = "doSelect";

  public static final String[] POLLERS = { AQ_ADAPTER_POLLER, IWAY_SAP_POLLER, GENERIC_POLLER, GENERIC_SELECT };

  public static final String ADVISORY_MAP_XML = "com/oracle/ateam/threadlogic/resources/AdvisoryMap.xml";
  public static final String WLS_THREADGROUP_DEFN_XML = "com/oracle/ateam/threadlogic/resources/WLSGroups.xml";
  public static final String NONWLS_THREADGROUP_DEFN_XML = "com/oracle/ateam/threadlogic/resources/NonWLSGroups.xml";

  public static final String[] HOTSPOT_TD_LABEL = new String[] { "Full thread dump", "VM Periodic Task Thread" };
  public static final String[] JROCKIT_TD_LABEL = new String[] { "FULL THREAD DUMP", "END OF THREAD DUMP" };
  public static final String[] IBM_TD_LABEL = new String[] { "LOCKS subcomponent dump routine",
      "CLASSES subcomponent dump routine" };

  public static final String[][] TD_LABELS = { HOTSPOT_TD_LABEL, JROCKIT_TD_LABEL, IBM_TD_LABEL };
}