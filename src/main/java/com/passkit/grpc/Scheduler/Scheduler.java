// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/scheduler/scheduler.proto

package com.passkit.grpc.Scheduler;

public final class Scheduler {
  private Scheduler() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ListRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:scheduler.ListRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The id of SchedulingJob.
     * </pre>
     *
     * <code>string jobId = 1;</code>
     * @return The jobId.
     */
    java.lang.String getJobId();
    /**
     * <pre>
     * The id of SchedulingJob.
     * </pre>
     *
     * <code>string jobId = 1;</code>
     * @return The bytes for jobId.
     */
    com.google.protobuf.ByteString
        getJobIdBytes();

    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     * @return Whether the filters field is set.
     */
    boolean hasFilters();
    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     * @return The filters.
     */
    com.passkit.grpc.Filter.Filters getFilters();
    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     */
    com.passkit.grpc.Filter.FiltersOrBuilder getFiltersOrBuilder();
  }
  /**
   * Protobuf type {@code scheduler.ListRequest}
   */
  public static final class ListRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:scheduler.ListRequest)
      ListRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListRequest.newBuilder() to construct.
    private ListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListRequest() {
      jobId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ListRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListRequest(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              jobId_ = s;
              break;
            }
            case 18: {
              com.passkit.grpc.Filter.Filters.Builder subBuilder = null;
              if (filters_ != null) {
                subBuilder = filters_.toBuilder();
              }
              filters_ = input.readMessage(com.passkit.grpc.Filter.Filters.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(filters_);
                filters_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.passkit.grpc.Scheduler.Scheduler.internal_static_scheduler_ListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.passkit.grpc.Scheduler.Scheduler.internal_static_scheduler_ListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.passkit.grpc.Scheduler.Scheduler.ListRequest.class, com.passkit.grpc.Scheduler.Scheduler.ListRequest.Builder.class);
    }

    public static final int JOBID_FIELD_NUMBER = 1;
    private volatile java.lang.Object jobId_;
    /**
     * <pre>
     * The id of SchedulingJob.
     * </pre>
     *
     * <code>string jobId = 1;</code>
     * @return The jobId.
     */
    @java.lang.Override
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The id of SchedulingJob.
     * </pre>
     *
     * <code>string jobId = 1;</code>
     * @return The bytes for jobId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILTERS_FIELD_NUMBER = 2;
    private com.passkit.grpc.Filter.Filters filters_;
    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     * @return Whether the filters field is set.
     */
    @java.lang.Override
    public boolean hasFilters() {
      return filters_ != null;
    }
    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     * @return The filters.
     */
    @java.lang.Override
    public com.passkit.grpc.Filter.Filters getFilters() {
      return filters_ == null ? com.passkit.grpc.Filter.Filters.getDefaultInstance() : filters_;
    }
    /**
     * <pre>
     * Search filters.
     * </pre>
     *
     * <code>.io.Filters filters = 2;</code>
     */
    @java.lang.Override
    public com.passkit.grpc.Filter.FiltersOrBuilder getFiltersOrBuilder() {
      return getFilters();
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobId_);
      }
      if (filters_ != null) {
        output.writeMessage(2, getFilters());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobId_);
      }
      if (filters_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getFilters());
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
      if (!(obj instanceof com.passkit.grpc.Scheduler.Scheduler.ListRequest)) {
        return super.equals(obj);
      }
      com.passkit.grpc.Scheduler.Scheduler.ListRequest other = (com.passkit.grpc.Scheduler.Scheduler.ListRequest) obj;

      if (!getJobId()
          .equals(other.getJobId())) return false;
      if (hasFilters() != other.hasFilters()) return false;
      if (hasFilters()) {
        if (!getFilters()
            .equals(other.getFilters())) return false;
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
      hash = (37 * hash) + JOBID_FIELD_NUMBER;
      hash = (53 * hash) + getJobId().hashCode();
      if (hasFilters()) {
        hash = (37 * hash) + FILTERS_FIELD_NUMBER;
        hash = (53 * hash) + getFilters().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.passkit.grpc.Scheduler.Scheduler.ListRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code scheduler.ListRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:scheduler.ListRequest)
        com.passkit.grpc.Scheduler.Scheduler.ListRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.passkit.grpc.Scheduler.Scheduler.internal_static_scheduler_ListRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.passkit.grpc.Scheduler.Scheduler.internal_static_scheduler_ListRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.passkit.grpc.Scheduler.Scheduler.ListRequest.class, com.passkit.grpc.Scheduler.Scheduler.ListRequest.Builder.class);
      }

      // Construct using com.passkit.grpc.Scheduler.Scheduler.ListRequest.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        jobId_ = "";

        if (filtersBuilder_ == null) {
          filters_ = null;
        } else {
          filters_ = null;
          filtersBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.passkit.grpc.Scheduler.Scheduler.internal_static_scheduler_ListRequest_descriptor;
      }

      @java.lang.Override
      public com.passkit.grpc.Scheduler.Scheduler.ListRequest getDefaultInstanceForType() {
        return com.passkit.grpc.Scheduler.Scheduler.ListRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.passkit.grpc.Scheduler.Scheduler.ListRequest build() {
        com.passkit.grpc.Scheduler.Scheduler.ListRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.passkit.grpc.Scheduler.Scheduler.ListRequest buildPartial() {
        com.passkit.grpc.Scheduler.Scheduler.ListRequest result = new com.passkit.grpc.Scheduler.Scheduler.ListRequest(this);
        result.jobId_ = jobId_;
        if (filtersBuilder_ == null) {
          result.filters_ = filters_;
        } else {
          result.filters_ = filtersBuilder_.build();
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.passkit.grpc.Scheduler.Scheduler.ListRequest) {
          return mergeFrom((com.passkit.grpc.Scheduler.Scheduler.ListRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.passkit.grpc.Scheduler.Scheduler.ListRequest other) {
        if (other == com.passkit.grpc.Scheduler.Scheduler.ListRequest.getDefaultInstance()) return this;
        if (!other.getJobId().isEmpty()) {
          jobId_ = other.jobId_;
          onChanged();
        }
        if (other.hasFilters()) {
          mergeFilters(other.getFilters());
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
        com.passkit.grpc.Scheduler.Scheduler.ListRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.passkit.grpc.Scheduler.Scheduler.ListRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object jobId_ = "";
      /**
       * <pre>
       * The id of SchedulingJob.
       * </pre>
       *
       * <code>string jobId = 1;</code>
       * @return The jobId.
       */
      public java.lang.String getJobId() {
        java.lang.Object ref = jobId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          jobId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The id of SchedulingJob.
       * </pre>
       *
       * <code>string jobId = 1;</code>
       * @return The bytes for jobId.
       */
      public com.google.protobuf.ByteString
          getJobIdBytes() {
        java.lang.Object ref = jobId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jobId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The id of SchedulingJob.
       * </pre>
       *
       * <code>string jobId = 1;</code>
       * @param value The jobId to set.
       * @return This builder for chaining.
       */
      public Builder setJobId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The id of SchedulingJob.
       * </pre>
       *
       * <code>string jobId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearJobId() {
        
        jobId_ = getDefaultInstance().getJobId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The id of SchedulingJob.
       * </pre>
       *
       * <code>string jobId = 1;</code>
       * @param value The bytes for jobId to set.
       * @return This builder for chaining.
       */
      public Builder setJobIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        jobId_ = value;
        onChanged();
        return this;
      }

      private com.passkit.grpc.Filter.Filters filters_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.passkit.grpc.Filter.Filters, com.passkit.grpc.Filter.Filters.Builder, com.passkit.grpc.Filter.FiltersOrBuilder> filtersBuilder_;
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       * @return Whether the filters field is set.
       */
      public boolean hasFilters() {
        return filtersBuilder_ != null || filters_ != null;
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       * @return The filters.
       */
      public com.passkit.grpc.Filter.Filters getFilters() {
        if (filtersBuilder_ == null) {
          return filters_ == null ? com.passkit.grpc.Filter.Filters.getDefaultInstance() : filters_;
        } else {
          return filtersBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public Builder setFilters(com.passkit.grpc.Filter.Filters value) {
        if (filtersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          filters_ = value;
          onChanged();
        } else {
          filtersBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public Builder setFilters(
          com.passkit.grpc.Filter.Filters.Builder builderForValue) {
        if (filtersBuilder_ == null) {
          filters_ = builderForValue.build();
          onChanged();
        } else {
          filtersBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public Builder mergeFilters(com.passkit.grpc.Filter.Filters value) {
        if (filtersBuilder_ == null) {
          if (filters_ != null) {
            filters_ =
              com.passkit.grpc.Filter.Filters.newBuilder(filters_).mergeFrom(value).buildPartial();
          } else {
            filters_ = value;
          }
          onChanged();
        } else {
          filtersBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public Builder clearFilters() {
        if (filtersBuilder_ == null) {
          filters_ = null;
          onChanged();
        } else {
          filters_ = null;
          filtersBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public com.passkit.grpc.Filter.Filters.Builder getFiltersBuilder() {
        
        onChanged();
        return getFiltersFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      public com.passkit.grpc.Filter.FiltersOrBuilder getFiltersOrBuilder() {
        if (filtersBuilder_ != null) {
          return filtersBuilder_.getMessageOrBuilder();
        } else {
          return filters_ == null ?
              com.passkit.grpc.Filter.Filters.getDefaultInstance() : filters_;
        }
      }
      /**
       * <pre>
       * Search filters.
       * </pre>
       *
       * <code>.io.Filters filters = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.passkit.grpc.Filter.Filters, com.passkit.grpc.Filter.Filters.Builder, com.passkit.grpc.Filter.FiltersOrBuilder> 
          getFiltersFieldBuilder() {
        if (filtersBuilder_ == null) {
          filtersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.passkit.grpc.Filter.Filters, com.passkit.grpc.Filter.Filters.Builder, com.passkit.grpc.Filter.FiltersOrBuilder>(
                  getFilters(),
                  getParentForChildren(),
                  isClean());
          filters_ = null;
        }
        return filtersBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:scheduler.ListRequest)
    }

    // @@protoc_insertion_point(class_scope:scheduler.ListRequest)
    private static final com.passkit.grpc.Scheduler.Scheduler.ListRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.passkit.grpc.Scheduler.Scheduler.ListRequest();
    }

    public static com.passkit.grpc.Scheduler.Scheduler.ListRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ListRequest>
        PARSER = new com.google.protobuf.AbstractParser<ListRequest>() {
      @java.lang.Override
      public ListRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ListRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ListRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.passkit.grpc.Scheduler.Scheduler.ListRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scheduler_ListRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scheduler_ListRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034io/scheduler/scheduler.proto\022\tschedule" +
      "r\032\026io/common/filter.proto\":\n\013ListRequest" +
      "\022\r\n\005jobId\030\001 \001(\t\022\034\n\007filters\030\002 \001(\0132\013.io.Fi" +
      "ltersBe\n\032com.passkit.grpc.SchedulerZ.sta" +
      "sh.passkit.com/io/model/sdk/go/io/schedu" +
      "ler\252\002\026PassKit.Grpc.Schedulerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.passkit.grpc.Filter.getDescriptor(),
        });
    internal_static_scheduler_ListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scheduler_ListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scheduler_ListRequest_descriptor,
        new java.lang.String[] { "JobId", "Filters", });
    com.passkit.grpc.Filter.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
