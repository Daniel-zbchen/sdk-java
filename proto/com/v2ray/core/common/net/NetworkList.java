// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/network.proto

package com.v2ray.core.common.net;

/**
 * Protobuf type {@code v2ray.core.common.net.NetworkList}
 */
public  final class NetworkList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.net.NetworkList)
    NetworkListOrBuilder {
  // Use NetworkList.newBuilder() to construct.
  private NetworkList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkList() {
    network_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NetworkList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              network_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            network_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                network_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              network_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        network_ = java.util.Collections.unmodifiableList(network_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.common.net.NetworkList.class, com.v2ray.core.common.net.NetworkList.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> network_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.v2ray.core.common.net.Network> network_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.v2ray.core.common.net.Network>() {
            public com.v2ray.core.common.net.Network convert(java.lang.Integer from) {
              com.v2ray.core.common.net.Network result = com.v2ray.core.common.net.Network.valueOf(from);
              return result == null ? com.v2ray.core.common.net.Network.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public java.util.List<com.v2ray.core.common.net.Network> getNetworkList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.v2ray.core.common.net.Network>(network_, network_converter_);
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public int getNetworkCount() {
    return network_.size();
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public com.v2ray.core.common.net.Network getNetwork(int index) {
    return network_converter_.convert(network_.get(index));
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public java.util.List<java.lang.Integer>
  getNetworkValueList() {
    return network_;
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public int getNetworkValue(int index) {
    return network_.get(index);
  }
  private int networkMemoizedSerializedSize;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getNetworkList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(networkMemoizedSerializedSize);
    }
    for (int i = 0; i < network_.size(); i++) {
      output.writeEnumNoTag(network_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < network_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(network_.get(i));
      }
      size += dataSize;
      if (!getNetworkList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }networkMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.common.net.NetworkList)) {
      return super.equals(obj);
    }
    com.v2ray.core.common.net.NetworkList other = (com.v2ray.core.common.net.NetworkList) obj;

    boolean result = true;
    result = result && network_.equals(other.network_);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getNetworkCount() > 0) {
      hash = (37 * hash) + NETWORK_FIELD_NUMBER;
      hash = (53 * hash) + network_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.common.net.NetworkList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.net.NetworkList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.NetworkList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.NetworkList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.common.net.NetworkList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.common.net.NetworkList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.net.NetworkList)
      com.v2ray.core.common.net.NetworkListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.net.NetworkList.class, com.v2ray.core.common.net.NetworkList.Builder.class);
    }

    // Construct using com.v2ray.core.common.net.NetworkList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
    }

    public com.v2ray.core.common.net.NetworkList getDefaultInstanceForType() {
      return com.v2ray.core.common.net.NetworkList.getDefaultInstance();
    }

    public com.v2ray.core.common.net.NetworkList build() {
      com.v2ray.core.common.net.NetworkList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.common.net.NetworkList buildPartial() {
      com.v2ray.core.common.net.NetworkList result = new com.v2ray.core.common.net.NetworkList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        network_ = java.util.Collections.unmodifiableList(network_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.network_ = network_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.common.net.NetworkList) {
        return mergeFrom((com.v2ray.core.common.net.NetworkList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.common.net.NetworkList other) {
      if (other == com.v2ray.core.common.net.NetworkList.getDefaultInstance()) return this;
      if (!other.network_.isEmpty()) {
        if (network_.isEmpty()) {
          network_ = other.network_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNetworkIsMutable();
          network_.addAll(other.network_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.common.net.NetworkList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.common.net.NetworkList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> network_ =
      java.util.Collections.emptyList();
    private void ensureNetworkIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        network_ = new java.util.ArrayList<java.lang.Integer>(network_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.net.Network> getNetworkList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.v2ray.core.common.net.Network>(network_, network_converter_);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public int getNetworkCount() {
      return network_.size();
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public com.v2ray.core.common.net.Network getNetwork(int index) {
      return network_converter_.convert(network_.get(index));
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetwork(
        int index, com.v2ray.core.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addNetwork(com.v2ray.core.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addAllNetwork(
        java.lang.Iterable<? extends com.v2ray.core.common.net.Network> values) {
      ensureNetworkIsMutable();
      for (com.v2ray.core.common.net.Network value : values) {
        network_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder clearNetwork() {
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getNetworkValueList() {
      return java.util.Collections.unmodifiableList(network_);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public int getNetworkValue(int index) {
      return network_.get(index);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetworkValue(
        int index, int value) {
      ensureNetworkIsMutable();
      network_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addNetworkValue(int value) {
      ensureNetworkIsMutable();
      network_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addAllNetworkValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureNetworkIsMutable();
      for (int value : values) {
        network_.add(value);
      }
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.net.NetworkList)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.net.NetworkList)
  private static final com.v2ray.core.common.net.NetworkList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.common.net.NetworkList();
  }

  public static com.v2ray.core.common.net.NetworkList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkList>
      PARSER = new com.google.protobuf.AbstractParser<NetworkList>() {
    public NetworkList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NetworkList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkList> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.common.net.NetworkList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

