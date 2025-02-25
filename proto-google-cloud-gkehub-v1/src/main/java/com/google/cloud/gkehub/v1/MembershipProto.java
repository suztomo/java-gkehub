/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/membership.proto

package com.google.cloud.gkehub.v1;

public final class MembershipProto {
  private MembershipProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_Membership_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_Membership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_Membership_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_Membership_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_MembershipEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_MembershipEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_GkeCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_GkeCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_KubernetesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_KubernetesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_MembershipState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_MembershipState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_Authority_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_Authority_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/gkehub/v1/membership.prot"
          + "o\022\026google.cloud.gkehub.v1\032\037google/api/fi"
          + "eld_behavior.proto\032\031google/api/resource."
          + "proto\032\037google/protobuf/timestamp.proto\032\034"
          + "google/api/annotations.proto\"\356\005\n\nMembers"
          + "hip\022C\n\010endpoint\030\004 \001(\0132*.google.cloud.gke"
          + "hub.v1.MembershipEndpointB\003\340A\001H\000\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\003\022C\n\006labels\030\002 \003(\0132..google.clo"
          + "ud.gkehub.v1.Membership.LabelsEntryB\003\340A\001"
          + "\022\030\n\013description\030\003 \001(\tB\003\340A\003\022;\n\005state\030\005 \001("
          + "\0132\'.google.cloud.gkehub.v1.MembershipSta"
          + "teB\003\340A\003\0224\n\013create_time\030\006 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\007 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013d"
          + "elete_time\030\010 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022\030\n\013external_id\030\t \001(\tB\003\340A\001\022=\n\024l"
          + "ast_connection_time\030\n \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022\026\n\tunique_id\030\013 \001(\tB\003\340"
          + "A\003\0229\n\tauthority\030\014 \001(\0132!.google.cloud.gke"
          + "hub.v1.AuthorityB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:g\352Ad\n gkehu"
          + "b.googleapis.com/Membership\022@projects/{p"
          + "roject}/locations/{location}/memberships"
          + "/{membership}B\006\n\004type\"\240\001\n\022MembershipEndp"
          + "oint\022<\n\013gke_cluster\030\001 \001(\0132\".google.cloud"
          + ".gkehub.v1.GkeClusterB\003\340A\001\022L\n\023kubernetes"
          + "_metadata\030\002 \001(\0132*.google.cloud.gkehub.v1"
          + ".KubernetesMetadataB\003\340A\003\"(\n\nGkeCluster\022\032"
          + "\n\rresource_link\030\001 \001(\tB\003\340A\005\"\337\001\n\022Kubernete"
          + "sMetadata\022*\n\035kubernetes_api_server_versi"
          + "on\030\001 \001(\tB\003\340A\003\022\035\n\020node_provider_id\030\002 \001(\tB"
          + "\003\340A\003\022\027\n\nnode_count\030\003 \001(\005B\003\340A\003\022\027\n\nvcpu_co"
          + "unt\030\004 \001(\005B\003\340A\003\022\026\n\tmemory_mb\030\005 \001(\005B\003\340A\003\0224"
          + "\n\013update_time\030d \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\"\273\001\n\017MembershipState\022?\n\004code"
          + "\030\001 \001(\0162,.google.cloud.gkehub.v1.Membersh"
          + "ipState.CodeB\003\340A\003\"g\n\004Code\022\024\n\020CODE_UNSPEC"
          + "IFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020\002\022\014\n\010DELE"
          + "TING\020\003\022\014\n\010UPDATING\020\004\022\024\n\020SERVICE_UPDATING"
          + "\020\005\"}\n\tAuthority\022\023\n\006issuer\030\001 \001(\tB\003\340A\001\022#\n\026"
          + "workload_identity_pool\030\002 \001(\tB\003\340A\003\022\036\n\021ide"
          + "ntity_provider\030\003 \001(\tB\003\340A\003\022\026\n\toidc_jwks\030\004"
          + " \001(\014B\003\340A\001B\273\001\n\032com.google.cloud.gkehub.v1"
          + "B\017MembershipProtoP\001Z<google.golang.org/g"
          + "enproto/googleapis/cloud/gkehub/v1;gkehu"
          + "b\252\002\026Google.Cloud.GkeHub.V1\312\002\026Google\\Clou"
          + "d\\GkeHub\\V1\352\002\031Google::Cloud::GkeHub::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1_Membership_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1_Membership_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_Membership_descriptor,
            new java.lang.String[] {
              "Endpoint",
              "Name",
              "Labels",
              "Description",
              "State",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "ExternalId",
              "LastConnectionTime",
              "UniqueId",
              "Authority",
              "Type",
            });
    internal_static_google_cloud_gkehub_v1_Membership_LabelsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1_Membership_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkehub_v1_Membership_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_Membership_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1_MembershipEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1_MembershipEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_MembershipEndpoint_descriptor,
            new java.lang.String[] {
              "GkeCluster", "KubernetesMetadata",
            });
    internal_static_google_cloud_gkehub_v1_GkeCluster_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1_GkeCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_GkeCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink",
            });
    internal_static_google_cloud_gkehub_v1_KubernetesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1_KubernetesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_KubernetesMetadata_descriptor,
            new java.lang.String[] {
              "KubernetesApiServerVersion",
              "NodeProviderId",
              "NodeCount",
              "VcpuCount",
              "MemoryMb",
              "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1_MembershipState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1_MembershipState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_MembershipState_descriptor,
            new java.lang.String[] {
              "Code",
            });
    internal_static_google_cloud_gkehub_v1_Authority_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1_Authority_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_Authority_descriptor,
            new java.lang.String[] {
              "Issuer", "WorkloadIdentityPool", "IdentityProvider", "OidcJwks",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
