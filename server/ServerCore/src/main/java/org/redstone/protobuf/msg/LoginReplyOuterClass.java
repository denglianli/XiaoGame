// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginReply.proto

package org.redstone.protobuf.msg;

public final class LoginReplyOuterClass {
  private LoginReplyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_redstone_protobuf_msg_LoginReply_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_redstone_protobuf_msg_LoginReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020LoginReply.proto\022\031org.redstone.protobu" +
      "f.msg\")\n\nLoginReply\022\014\n\004name\030\001 \001(\t\022\r\n\005lev" +
      "el\030\002 \001(\005B\002P\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_redstone_protobuf_msg_LoginReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_redstone_protobuf_msg_LoginReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_redstone_protobuf_msg_LoginReply_descriptor,
        new java.lang.String[] { "Name", "Level", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
