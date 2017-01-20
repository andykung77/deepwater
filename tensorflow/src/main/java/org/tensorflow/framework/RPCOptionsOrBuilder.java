// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

public interface RPCOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RPCOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, always use RPC to contact the session target.
   * If false (the default option), TensorFlow may use an optimized
   * transport for client-master communication that avoids the RPC
   * stack. This option is primarily for used testing the RPC stack.
   * </pre>
   *
   * <code>optional bool use_rpc_for_inprocess_master = 1;</code>
   */
  boolean getUseRpcForInprocessMaster();
}