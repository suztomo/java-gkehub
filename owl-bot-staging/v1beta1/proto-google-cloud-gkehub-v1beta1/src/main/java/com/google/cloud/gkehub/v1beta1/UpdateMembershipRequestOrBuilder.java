// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public interface UpdateMembershipRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.UpdateMembershipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The membership resource name in the format:
   * `projects/[project_id]/locations/global/memberships/[membership_id]`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The membership resource name in the format:
   * `projects/[project_id]/locations/global/memberships/[membership_id]`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Mask of fields to update. At least one field path must be specified in this
   * mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update. At least one field path must be specified in this
   * mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields to update. At least one field path must be specified in this
   * mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Required. Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  com.google.cloud.gkehub.v1beta1.Membership getResource();
  /**
   * <pre>
   * Required. Only fields specified in update_mask are updated.
   * If you specify a field in the update_mask but don't specify its value here
   * that field will be deleted.
   * If you are updating a map field, set the value of a key to null or empty
   * string to delete the key from the map. It's not possible to update a key's
   * value to the empty string.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1beta1.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkehub.v1beta1.MembershipOrBuilder getResourceOrBuilder();
}