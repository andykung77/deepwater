// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface NamedTensorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.NamedTensor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the named tensor.
   * </pre>
   *
   * <code>optional string key = 1;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The name of the named tensor.
   * </pre>
   *
   * <code>optional string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The value of the named tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorProto val = 2;</code>
   */
  boolean hasVal();
  /**
   * <pre>
   * The value of the named tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorProto val = 2;</code>
   */
  org.tensorflow.framework.TensorProto getVal();
  /**
   * <pre>
   * The value of the named tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorProto val = 2;</code>
   */
  org.tensorflow.framework.TensorProtoOrBuilder getValOrBuilder();
}
