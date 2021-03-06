// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/protocol/user.proto

package com.v2ray.core.common.protocol;

/**
 * Protobuf type {@code v2ray.core.common.protocol.User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.protocol.User)
    UserOrBuilder {
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    level_ = 0;
    email_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private User(
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

            level_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 26: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (account_ != null) {
              subBuilder = account_.toBuilder();
            }
            account_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(account_);
              account_ = subBuilder.buildPartial();
            }

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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.common.protocol.UserOuterClass.internal_static_v2ray_core_common_protocol_User_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.protocol.UserOuterClass.internal_static_v2ray_core_common_protocol_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.common.protocol.User.class, com.v2ray.core.common.protocol.User.Builder.class);
  }

  public static final int LEVEL_FIELD_NUMBER = 1;
  private int level_;
  /**
   * <code>optional uint32 level = 1;</code>
   */
  public int getLevel() {
    return level_;
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object email_;
  /**
   * <code>optional string email = 2;</code>
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>optional string email = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 3;
  private com.v2ray.core.common.serial.TypedMessage account_;
  /**
   * <pre>
   * Protocol specific account information.
   * </pre>
   *
   * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
   */
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <pre>
   * Protocol specific account information.
   * </pre>
   *
   * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getAccount() {
    return account_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * Protocol specific account information.
   * </pre>
   *
   * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getAccountOrBuilder() {
    return getAccount();
  }

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
    if (level_ != 0) {
      output.writeUInt32(1, level_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
    }
    if (account_ != null) {
      output.writeMessage(3, getAccount());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, level_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
    }
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAccount());
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
    if (!(obj instanceof com.v2ray.core.common.protocol.User)) {
      return super.equals(obj);
    }
    com.v2ray.core.common.protocol.User other = (com.v2ray.core.common.protocol.User) obj;

    boolean result = true;
    result = result && (getLevel()
        == other.getLevel());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && (hasAccount() == other.hasAccount());
    if (hasAccount()) {
      result = result && getAccount()
          .equals(other.getAccount());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.common.protocol.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.User parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.common.protocol.User prototype) {
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
   * Protobuf type {@code v2ray.core.common.protocol.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.protocol.User)
      com.v2ray.core.common.protocol.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.protocol.UserOuterClass.internal_static_v2ray_core_common_protocol_User_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.protocol.UserOuterClass.internal_static_v2ray_core_common_protocol_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.protocol.User.class, com.v2ray.core.common.protocol.User.Builder.class);
    }

    // Construct using com.v2ray.core.common.protocol.User.newBuilder()
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
      level_ = 0;

      email_ = "";

      if (accountBuilder_ == null) {
        account_ = null;
      } else {
        account_ = null;
        accountBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.protocol.UserOuterClass.internal_static_v2ray_core_common_protocol_User_descriptor;
    }

    public com.v2ray.core.common.protocol.User getDefaultInstanceForType() {
      return com.v2ray.core.common.protocol.User.getDefaultInstance();
    }

    public com.v2ray.core.common.protocol.User build() {
      com.v2ray.core.common.protocol.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.common.protocol.User buildPartial() {
      com.v2ray.core.common.protocol.User result = new com.v2ray.core.common.protocol.User(this);
      result.level_ = level_;
      result.email_ = email_;
      if (accountBuilder_ == null) {
        result.account_ = account_;
      } else {
        result.account_ = accountBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.common.protocol.User) {
        return mergeFrom((com.v2ray.core.common.protocol.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.common.protocol.User other) {
      if (other == com.v2ray.core.common.protocol.User.getDefaultInstance()) return this;
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
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
      com.v2ray.core.common.protocol.User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.common.protocol.User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int level_ ;
    /**
     * <code>optional uint32 level = 1;</code>
     */
    public int getLevel() {
      return level_;
    }
    /**
     * <code>optional uint32 level = 1;</code>
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 level = 1;</code>
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>optional string email = 2;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string email = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string email = 2;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string email = 2;</code>
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>optional string email = 2;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.serial.TypedMessage account_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> accountBuilder_;
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public boolean hasAccount() {
      return accountBuilder_ != null || account_ != null;
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public Builder setAccount(com.v2ray.core.common.serial.TypedMessage value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
        onChanged();
      } else {
        accountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public Builder setAccount(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
        onChanged();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public Builder mergeAccount(com.v2ray.core.common.serial.TypedMessage value) {
      if (accountBuilder_ == null) {
        if (account_ != null) {
          account_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(account_).mergeFrom(value).buildPartial();
        } else {
          account_ = value;
        }
        onChanged();
      } else {
        accountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public Builder clearAccount() {
      if (accountBuilder_ == null) {
        account_ = null;
        onChanged();
      } else {
        account_ = null;
        accountBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getAccountBuilder() {
      
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : account_;
      }
    }
    /**
     * <pre>
     * Protocol specific account information.
     * </pre>
     *
     * <code>optional .v2ray.core.common.serial.TypedMessage account = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.protocol.User)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.protocol.User)
  private static final com.v2ray.core.common.protocol.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.common.protocol.User();
  }

  public static com.v2ray.core.common.protocol.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.common.protocol.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

