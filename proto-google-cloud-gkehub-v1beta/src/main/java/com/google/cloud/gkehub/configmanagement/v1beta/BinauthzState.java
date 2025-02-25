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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

/**
 *
 *
 * <pre>
 * State for Binauthz
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.BinauthzState}
 */
public final class BinauthzState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1beta.BinauthzState)
    BinauthzStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BinauthzState.newBuilder() to construct.
  private BinauthzState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BinauthzState() {
    webhook_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BinauthzState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BinauthzState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              webhook_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder subBuilder =
                  null;
              if (version_ != null) {
                subBuilder = version_.toBuilder();
              }
              version_ =
                  input.readMessage(
                      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(version_);
                version_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1beta_BinauthzState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1beta_BinauthzState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.class,
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.Builder.class);
  }

  public static final int WEBHOOK_FIELD_NUMBER = 1;
  private int webhook_;
  /**
   *
   *
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
   *
   * @return The enum numeric value on the wire for webhook.
   */
  @java.lang.Override
  public int getWebhookValue() {
    return webhook_;
  }
  /**
   *
   *
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
   *
   * @return The webhook.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getWebhook() {
    @SuppressWarnings("deprecation")
    com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(webhook_);
    return result == null
        ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
        : result;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version_;
  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
   *
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion getVersion() {
    return version_ == null
        ? com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.getDefaultInstance()
        : version_;
  }
  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersionOrBuilder
      getVersionOrBuilder() {
    return getVersion();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (webhook_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, webhook_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webhook_
        != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState
            .DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, webhook_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getVersion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState other =
        (com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState) obj;

    if (webhook_ != other.webhook_) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion().equals(other.getVersion())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WEBHOOK_FIELD_NUMBER;
    hash = (53 * hash) + webhook_;
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * State for Binauthz
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.BinauthzState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1beta.BinauthzState)
      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_BinauthzState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_BinauthzState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.class,
              com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      webhook_ = 0;

      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1beta_BinauthzState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState build() {
      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState result =
          new com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState(this);
      result.webhook_ = webhook_;
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState.getDefaultInstance())
        return this;
      if (other.webhook_ != 0) {
        setWebhookValue(other.getWebhookValue());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int webhook_ = 0;
    /**
     *
     *
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
     *
     * @return The enum numeric value on the wire for webhook.
     */
    @java.lang.Override
    public int getWebhookValue() {
      return webhook_;
    }
    /**
     *
     *
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
     *
     * @param value The enum numeric value on the wire for webhook to set.
     * @return This builder for chaining.
     */
    public Builder setWebhookValue(int value) {

      webhook_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
     *
     * @return The webhook.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getWebhook() {
      @SuppressWarnings("deprecation")
      com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result =
          com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(webhook_);
      return result == null
          ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
     *
     * @param value The webhook to set.
     * @return This builder for chaining.
     */
    public Builder setWebhook(
        com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      webhook_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The state of the binauthz webhook.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState webhook = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWebhook() {

      webhook_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion,
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersionOrBuilder>
        versionBuilder_;
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     *
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     *
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.getDefaultInstance()
            : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public Builder mergeVersion(
        com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
              com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.newBuilder(version_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder
        getVersionBuilder() {

      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersionOrBuilder
        getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.getDefaultInstance()
            : version_;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of binauthz that is installed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion,
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion,
                com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersion.Builder,
                com.google.cloud.gkehub.configmanagement.v1beta.BinauthzVersionOrBuilder>(
                getVersion(), getParentForChildren(), isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1beta.BinauthzState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1beta.BinauthzState)
  private static final com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinauthzState> PARSER =
      new com.google.protobuf.AbstractParser<BinauthzState>() {
        @java.lang.Override
        public BinauthzState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BinauthzState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BinauthzState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinauthzState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.BinauthzState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
