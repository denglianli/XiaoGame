// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NewTurnBroadcast.proto

package org.redstone.protobuf.msg;

/**
 * Protobuf type {@code org.redstone.protobuf.msg.BoardSync}
 */
public  final class BoardSync extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:org.redstone.protobuf.msg.BoardSync)
    BoardSyncOrBuilder {
  // Use BoardSync.newBuilder() to construct.
  private BoardSync(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private BoardSync() {
    rows_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BoardSync(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              rows_ = new java.util.ArrayList<org.redstone.protobuf.msg.ChessRow>();
              mutable_bitField0_ |= 0x00000001;
            }
            rows_.add(input.readMessage(org.redstone.protobuf.msg.ChessRow.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        rows_ = java.util.Collections.unmodifiableList(rows_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_BoardSync_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_BoardSync_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.redstone.protobuf.msg.BoardSync.class, org.redstone.protobuf.msg.BoardSync.Builder.class);
  }

  public static final com.google.protobuf.Parser<BoardSync> PARSER =
      new com.google.protobuf.AbstractParser<BoardSync>() {
    public BoardSync parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BoardSync(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BoardSync> getParserForType() {
    return PARSER;
  }

  public static final int ROWS_FIELD_NUMBER = 1;
  private java.util.List<org.redstone.protobuf.msg.ChessRow> rows_;
  /**
   * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
   */
  public java.util.List<org.redstone.protobuf.msg.ChessRow> getRowsList() {
    return rows_;
  }
  /**
   * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
   */
  public java.util.List<? extends org.redstone.protobuf.msg.ChessRowOrBuilder> 
      getRowsOrBuilderList() {
    return rows_;
  }
  /**
   * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
   */
  public int getRowsCount() {
    return rows_.size();
  }
  /**
   * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
   */
  public org.redstone.protobuf.msg.ChessRow getRows(int index) {
    return rows_.get(index);
  }
  /**
   * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
   */
  public org.redstone.protobuf.msg.ChessRowOrBuilder getRowsOrBuilder(
      int index) {
    return rows_.get(index);
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
    getSerializedSize();
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(1, rows_.get(i));
    }
    unknownFields.writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rows_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.BoardSync parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.redstone.protobuf.msg.BoardSync parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.redstone.protobuf.msg.BoardSync parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.redstone.protobuf.msg.BoardSync prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.redstone.protobuf.msg.BoardSync}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.redstone.protobuf.msg.BoardSync)
      org.redstone.protobuf.msg.BoardSyncOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_BoardSync_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_BoardSync_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.redstone.protobuf.msg.BoardSync.class, org.redstone.protobuf.msg.BoardSync.Builder.class);
    }

    // Construct using org.redstone.protobuf.msg.BoardSync.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getRowsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.redstone.protobuf.msg.NewTurnBroadcastOuterClass.internal_static_org_redstone_protobuf_msg_BoardSync_descriptor;
    }

    public org.redstone.protobuf.msg.BoardSync getDefaultInstanceForType() {
      return org.redstone.protobuf.msg.BoardSync.getDefaultInstance();
    }

    public org.redstone.protobuf.msg.BoardSync build() {
      org.redstone.protobuf.msg.BoardSync result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.redstone.protobuf.msg.BoardSync buildPartial() {
      org.redstone.protobuf.msg.BoardSync result = new org.redstone.protobuf.msg.BoardSync(this);
      int from_bitField0_ = bitField0_;
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.redstone.protobuf.msg.BoardSync) {
        return mergeFrom((org.redstone.protobuf.msg.BoardSync)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.redstone.protobuf.msg.BoardSync other) {
      if (other == org.redstone.protobuf.msg.BoardSync.getDefaultInstance()) return this;
      if (rowsBuilder_ == null) {
        if (!other.rows_.isEmpty()) {
          if (rows_.isEmpty()) {
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowsIsMutable();
            rows_.addAll(other.rows_);
          }
          onChanged();
        }
      } else {
        if (!other.rows_.isEmpty()) {
          if (rowsBuilder_.isEmpty()) {
            rowsBuilder_.dispose();
            rowsBuilder_ = null;
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRowsFieldBuilder() : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.redstone.protobuf.msg.BoardSync parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.redstone.protobuf.msg.BoardSync) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.redstone.protobuf.msg.ChessRow> rows_ =
      java.util.Collections.emptyList();
    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        rows_ = new java.util.ArrayList<org.redstone.protobuf.msg.ChessRow>(rows_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.redstone.protobuf.msg.ChessRow, org.redstone.protobuf.msg.ChessRow.Builder, org.redstone.protobuf.msg.ChessRowOrBuilder> rowsBuilder_;

    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public java.util.List<org.redstone.protobuf.msg.ChessRow> getRowsList() {
      if (rowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rows_);
      } else {
        return rowsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public int getRowsCount() {
      if (rowsBuilder_ == null) {
        return rows_.size();
      } else {
        return rowsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public org.redstone.protobuf.msg.ChessRow getRows(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder setRows(
        int index, org.redstone.protobuf.msg.ChessRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.set(index, value);
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder setRows(
        int index, org.redstone.protobuf.msg.ChessRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder addRows(org.redstone.protobuf.msg.ChessRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder addRows(
        int index, org.redstone.protobuf.msg.ChessRow value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(index, value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder addRows(
        org.redstone.protobuf.msg.ChessRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder addRows(
        int index, org.redstone.protobuf.msg.ChessRow.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder addAllRows(
        java.lang.Iterable<? extends org.redstone.protobuf.msg.ChessRow> values) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rows_);
        onChanged();
      } else {
        rowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder clearRows() {
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public Builder removeRows(int index) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.remove(index);
        onChanged();
      } else {
        rowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public org.redstone.protobuf.msg.ChessRow.Builder getRowsBuilder(
        int index) {
      return getRowsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public org.redstone.protobuf.msg.ChessRowOrBuilder getRowsOrBuilder(
        int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);  } else {
        return rowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public java.util.List<? extends org.redstone.protobuf.msg.ChessRowOrBuilder> 
         getRowsOrBuilderList() {
      if (rowsBuilder_ != null) {
        return rowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rows_);
      }
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public org.redstone.protobuf.msg.ChessRow.Builder addRowsBuilder() {
      return getRowsFieldBuilder().addBuilder(
          org.redstone.protobuf.msg.ChessRow.getDefaultInstance());
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public org.redstone.protobuf.msg.ChessRow.Builder addRowsBuilder(
        int index) {
      return getRowsFieldBuilder().addBuilder(
          index, org.redstone.protobuf.msg.ChessRow.getDefaultInstance());
    }
    /**
     * <code>repeated .org.redstone.protobuf.msg.ChessRow rows = 1;</code>
     */
    public java.util.List<org.redstone.protobuf.msg.ChessRow.Builder> 
         getRowsBuilderList() {
      return getRowsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.redstone.protobuf.msg.ChessRow, org.redstone.protobuf.msg.ChessRow.Builder, org.redstone.protobuf.msg.ChessRowOrBuilder> 
        getRowsFieldBuilder() {
      if (rowsBuilder_ == null) {
        rowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.redstone.protobuf.msg.ChessRow, org.redstone.protobuf.msg.ChessRow.Builder, org.redstone.protobuf.msg.ChessRowOrBuilder>(
                rows_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        rows_ = null;
      }
      return rowsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:org.redstone.protobuf.msg.BoardSync)
  }

  // @@protoc_insertion_point(class_scope:org.redstone.protobuf.msg.BoardSync)
  private static final org.redstone.protobuf.msg.BoardSync defaultInstance;static {
    defaultInstance = new org.redstone.protobuf.msg.BoardSync();
  }

  public static org.redstone.protobuf.msg.BoardSync getDefaultInstance() {
    return defaultInstance;
  }

  public org.redstone.protobuf.msg.BoardSync getDefaultInstanceForType() {
    return defaultInstance;
  }

}

