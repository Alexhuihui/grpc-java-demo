// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_date.proto

package top.alexmmd.grpc.api;

public final class RPCDateServiceApi {
  private RPCDateServiceApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_alexmmd_grpc_api_RPCDateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_alexmmd_grpc_api_RPCDateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_top_alexmmd_grpc_api_RPCDateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_top_alexmmd_grpc_api_RPCDateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016rpc_date.proto\022\024top.alexmmd.grpc.api\"\"" +
      "\n\016RPCDateRequest\022\020\n\010userName\030\001 \001(\t\"%\n\017RP" +
      "CDateResponse\022\022\n\nserverDate\030\001 \001(\t2j\n\016RPC" +
      "DateService\022X\n\007getDate\022$.top.alexmmd.grp" +
      "c.api.RPCDateRequest\032%.top.alexmmd.grpc." +
      "api.RPCDateResponse\"\000B+\n\024top.alexmmd.grp" +
      "c.apiB\021RPCDateServiceApiP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_top_alexmmd_grpc_api_RPCDateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_top_alexmmd_grpc_api_RPCDateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_alexmmd_grpc_api_RPCDateRequest_descriptor,
        new String[] { "UserName", });
    internal_static_top_alexmmd_grpc_api_RPCDateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_top_alexmmd_grpc_api_RPCDateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_top_alexmmd_grpc_api_RPCDateResponse_descriptor,
        new String[] { "ServerDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
