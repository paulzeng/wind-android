// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_user_search.proto

package com.windchat.proto.server;

public final class ApiUserSearchProto {
  private ApiUserSearchProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiUserSearchRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserSearchRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    String getId();
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiUserSearchRequest}
   */
  public  static final class ApiUserSearchRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiUserSearchRequest, ApiUserSearchRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiUserSearchRequest)
      ApiUserSearchRequestOrBuilder {
    private ApiUserSearchRequest() {
      id_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private String id_;
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public String getId() {
      return id_;
    }
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(id_);
    }
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void setId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      id_ = value;
    }
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void clearId() {

      id_ = getDefaultInstance().getId();
    }
    /**
     * <pre>
     *site_login_id | phone_id | userIdPubk
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    private void setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      id_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!id_.isEmpty()) {
        output.writeString(1, getId());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!id_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiUserSearchRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiUserSearchRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiUserSearchRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiUserSearchRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiUserSearchRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiUserSearchRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiUserSearchRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiUserSearchRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiUserSearchRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiUserSearchRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserSearchRequest)
        ApiUserSearchRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiUserSearchProto.ApiUserSearchRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *site_login_id | phone_id | userIdPubk
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public String getId() {
        return instance.getId();
      }
      /**
       * <pre>
       *site_login_id | phone_id | userIdPubk
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        return instance.getIdBytes();
      }
      /**
       * <pre>
       *site_login_id | phone_id | userIdPubk
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          String value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <pre>
       *site_login_id | phone_id | userIdPubk
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }
      /**
       * <pre>
       *site_login_id | phone_id | userIdPubk
       * </pre>
       *
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiUserSearchRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiUserSearchRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiUserSearchRequest other = (ApiUserSearchRequest) arg1;
          id_ = visitor.visitString(!id_.isEmpty(), id_,
              !other.id_.isEmpty(), other.id_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  String s = input.readStringRequireUtf8();

                  id_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiUserSearchRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiUserSearchRequest)
    private static final ApiUserSearchRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiUserSearchRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiUserSearchRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiUserSearchRequest> PARSER;

    public static com.google.protobuf.Parser<ApiUserSearchRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiUserSearchResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiUserSearchResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    boolean hasProfile();
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    com.windchat.proto.core.UserProto.UserProfile getProfile();

    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    int getRelationValue();
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    com.windchat.proto.core.UserProto.UserRelation getRelation();
  }
  /**
   * Protobuf type {@code site.ApiUserSearchResponse}
   */
  public  static final class ApiUserSearchResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiUserSearchResponse, ApiUserSearchResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiUserSearchResponse)
      ApiUserSearchResponseOrBuilder {
    private ApiUserSearchResponse() {
    }
    public static final int PROFILE_FIELD_NUMBER = 1;
    private com.windchat.proto.core.UserProto.UserProfile profile_;
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    public boolean hasProfile() {
      return profile_ != null;
    }
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    public com.windchat.proto.core.UserProto.UserProfile getProfile() {
      return profile_ == null ? com.windchat.proto.core.UserProto.UserProfile.getDefaultInstance() : profile_;
    }
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    private void setProfile(com.windchat.proto.core.UserProto.UserProfile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      profile_ = value;

      }
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    private void setProfile(
        com.windchat.proto.core.UserProto.UserProfile.Builder builderForValue) {
      profile_ = builderForValue.build();

    }
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    private void mergeProfile(com.windchat.proto.core.UserProto.UserProfile value) {
      if (profile_ != null &&
          profile_ != com.windchat.proto.core.UserProto.UserProfile.getDefaultInstance()) {
        profile_ =
          com.windchat.proto.core.UserProto.UserProfile.newBuilder(profile_).mergeFrom(value).buildPartial();
      } else {
        profile_ = value;
      }

    }
    /**
     * <pre>
     *用户好友的信息
     * </pre>
     *
     * <code>optional .core.UserProfile profile = 1;</code>
     */
    private void clearProfile() {  profile_ = null;

    }

    public static final int RELATION_FIELD_NUMBER = 2;
    private int relation_;
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    public int getRelationValue() {
      return relation_;
    }
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    public com.windchat.proto.core.UserProto.UserRelation getRelation() {
      com.windchat.proto.core.UserProto.UserRelation result = com.windchat.proto.core.UserProto.UserRelation.forNumber(relation_);
      return result == null ? com.windchat.proto.core.UserProto.UserRelation.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    private void setRelationValue(int value) {
        relation_ = value;
    }
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    private void setRelation(com.windchat.proto.core.UserProto.UserRelation value) {
      if (value == null) {
        throw new NullPointerException();
      }

      relation_ = value.getNumber();
    }
    /**
     * <pre>
     *用户之间的关系
     * </pre>
     *
     * <code>optional .core.UserRelation relation = 2;</code>
     */
    private void clearRelation() {

      relation_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (profile_ != null) {
        output.writeMessage(1, getProfile());
      }
      if (relation_ != com.windchat.proto.core.UserProto.UserRelation.RELATION_NONE.getNumber()) {
        output.writeEnum(2, relation_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (profile_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getProfile());
      }
      if (relation_ != com.windchat.proto.core.UserProto.UserRelation.RELATION_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, relation_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiUserSearchResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiUserSearchResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiUserSearchResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiUserSearchResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiUserSearchResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiUserSearchResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiUserSearchResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiUserSearchResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiUserSearchResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiUserSearchResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiUserSearchResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiUserSearchResponse)
        ApiUserSearchResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiUserSearchProto.ApiUserSearchResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public boolean hasProfile() {
        return instance.hasProfile();
      }
      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public com.windchat.proto.core.UserProto.UserProfile getProfile() {
        return instance.getProfile();
      }
      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public Builder setProfile(com.windchat.proto.core.UserProto.UserProfile value) {
        copyOnWrite();
        instance.setProfile(value);
        return this;
        }
      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public Builder setProfile(
          com.windchat.proto.core.UserProto.UserProfile.Builder builderForValue) {
        copyOnWrite();
        instance.setProfile(builderForValue);
        return this;
      }
      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public Builder mergeProfile(com.windchat.proto.core.UserProto.UserProfile value) {
        copyOnWrite();
        instance.mergeProfile(value);
        return this;
      }
      /**
       * <pre>
       *用户好友的信息
       * </pre>
       *
       * <code>optional .core.UserProfile profile = 1;</code>
       */
      public Builder clearProfile() {  copyOnWrite();
        instance.clearProfile();
        return this;
      }

      /**
       * <pre>
       *用户之间的关系
       * </pre>
       *
       * <code>optional .core.UserRelation relation = 2;</code>
       */
      public int getRelationValue() {
        return instance.getRelationValue();
      }
      /**
       * <pre>
       *用户之间的关系
       * </pre>
       *
       * <code>optional .core.UserRelation relation = 2;</code>
       */
      public Builder setRelationValue(int value) {
        copyOnWrite();
        instance.setRelationValue(value);
        return this;
      }
      /**
       * <pre>
       *用户之间的关系
       * </pre>
       *
       * <code>optional .core.UserRelation relation = 2;</code>
       */
      public com.windchat.proto.core.UserProto.UserRelation getRelation() {
        return instance.getRelation();
      }
      /**
       * <pre>
       *用户之间的关系
       * </pre>
       *
       * <code>optional .core.UserRelation relation = 2;</code>
       */
      public Builder setRelation(com.windchat.proto.core.UserProto.UserRelation value) {
        copyOnWrite();
        instance.setRelation(value);
        return this;
      }
      /**
       * <pre>
       *用户之间的关系
       * </pre>
       *
       * <code>optional .core.UserRelation relation = 2;</code>
       */
      public Builder clearRelation() {
        copyOnWrite();
        instance.clearRelation();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiUserSearchResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiUserSearchResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          ApiUserSearchResponse other = (ApiUserSearchResponse) arg1;
          profile_ = visitor.visitMessage(profile_, other.profile_);
          relation_ = visitor.visitInt(relation_ != 0, relation_,    other.relation_ != 0, other.relation_);
          if (visitor == MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  com.windchat.proto.core.UserProto.UserProfile.Builder subBuilder = null;
                  if (profile_ != null) {
                    subBuilder = profile_.toBuilder();
                  }
                  profile_ = input.readMessage(com.windchat.proto.core.UserProto.UserProfile.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(profile_);
                    profile_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {
                  int rawValue = input.readEnum();

                  relation_ = rawValue;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (ApiUserSearchResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiUserSearchResponse)
    private static final ApiUserSearchResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiUserSearchResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiUserSearchResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiUserSearchResponse> PARSER;

    public static com.google.protobuf.Parser<ApiUserSearchResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
