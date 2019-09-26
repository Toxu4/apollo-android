// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.introspection_query;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TestQuery implements Query<TestQuery.Data, Optional<TestQuery.Data>, Operation.Variables> {
  public static final String OPERATION_ID = "83b062d9f8641da1394fb8753bb9eba2c24bac3cb727074d9613bdf1d5ceacb7";

  public static final String QUERY_DOCUMENT = "query TestQuery {\n"
      + "  __schema {\n"
      + "    __typename\n"
      + "    queryType {\n"
      + "      __typename\n"
      + "      name\n"
      + "    }\n"
      + "    types {\n"
      + "      __typename\n"
      + "      name\n"
      + "    }\n"
      + "  }\n"
      + "  __type(name: \"Vehicle\") {\n"
      + "    __typename\n"
      + "    name\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "TestQuery";
    }
  };

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String operationId() {
    return OPERATION_ID;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Optional<TestQuery.Data> wrapData(TestQuery.Data data) {
    return Optional.fromNullable(data);
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<TestQuery.Data> responseFieldMapper() {
    return new Data.Mapper();
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public OperationName name() {
    return OPERATION_NAME;
  }

  public static final class Builder {
    Builder() {
    }

    public TestQuery build() {
      return new TestQuery();
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("__schema", "__schema", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forObject("__type", "__type", new UnmodifiableMapBuilder<String, Object>(1)
      .put("name", "Vehicle")
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull __Schema __schema;

    final Optional<__Type> __type;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@NotNull __Schema __schema, @Nullable __Type __type) {
      this.__schema = Utils.checkNotNull(__schema, "__schema == null");
      this.__type = Optional.fromNullable(__type);
    }

    public @NotNull __Schema __schema() {
      return this.__schema;
    }

    public Optional<__Type> __type() {
      return this.__type;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], __schema.marshaller());
          writer.writeObject($responseFields[1], __type.isPresent() ? __type.get().marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "__schema=" + __schema + ", "
          + "__type=" + __type
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return this.__schema.equals(that.__schema)
         && this.__type.equals(that.__type);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __schema.hashCode();
        h *= 1000003;
        h ^= __type.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final __Schema.Mapper __SchemaFieldMapper = new __Schema.Mapper();

      final __Type.Mapper __TypeFieldMapper = new __Type.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final __Schema __schema = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<__Schema>() {
          @Override
          public __Schema read(ResponseReader reader) {
            return __SchemaFieldMapper.map(reader);
          }
        });
        final __Type __type = reader.readObject($responseFields[1], new ResponseReader.ObjectReader<__Type>() {
          @Override
          public __Type read(ResponseReader reader) {
            return __TypeFieldMapper.map(reader);
          }
        });
        return new Data(__schema, __type);
      }
    }
  }

  public static class __Schema {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forObject("queryType", "queryType", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forList("types", "types", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull QueryType queryType;

    final @NotNull List<Type> types;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public __Schema(@NotNull String __typename, @NotNull QueryType queryType,
        @NotNull List<Type> types) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.queryType = Utils.checkNotNull(queryType, "queryType == null");
      this.types = Utils.checkNotNull(types, "types == null");
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * The type that query operations will be rooted at.
     */
    public @NotNull QueryType queryType() {
      return this.queryType;
    }

    /**
     * A list of all types supported by this server.
     */
    public @NotNull List<Type> types() {
      return this.types;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeObject($responseFields[1], queryType.marshaller());
          writer.writeList($responseFields[2], types, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((Type) item).marshaller());
              }
            }
          });
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "__Schema{"
          + "__typename=" + __typename + ", "
          + "queryType=" + queryType + ", "
          + "types=" + types
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof __Schema) {
        __Schema that = (__Schema) o;
        return this.__typename.equals(that.__typename)
         && this.queryType.equals(that.queryType)
         && this.types.equals(that.types);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= queryType.hashCode();
        h *= 1000003;
        h ^= types.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<__Schema> {
      final QueryType.Mapper queryTypeFieldMapper = new QueryType.Mapper();

      final Type.Mapper typeFieldMapper = new Type.Mapper();

      @Override
      public __Schema map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final QueryType queryType = reader.readObject($responseFields[1], new ResponseReader.ObjectReader<QueryType>() {
          @Override
          public QueryType read(ResponseReader reader) {
            return queryTypeFieldMapper.map(reader);
          }
        });
        final List<Type> types = reader.readList($responseFields[2], new ResponseReader.ListReader<Type>() {
          @Override
          public Type read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<Type>() {
              @Override
              public Type read(ResponseReader reader) {
                return typeFieldMapper.map(reader);
              }
            });
          }
        });
        return new __Schema(__typename, queryType, types);
      }
    }
  }

  public static class QueryType {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("name", "name", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final Optional<String> name;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public QueryType(@NotNull String __typename, @Nullable String name) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.name = Optional.fromNullable(name);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public Optional<String> name() {
      return this.name;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], name.isPresent() ? name.get() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "QueryType{"
          + "__typename=" + __typename + ", "
          + "name=" + name
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof QueryType) {
        QueryType that = (QueryType) o;
        return this.__typename.equals(that.__typename)
         && this.name.equals(that.name);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<QueryType> {
      @Override
      public QueryType map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String name = reader.readString($responseFields[1]);
        return new QueryType(__typename, name);
      }
    }
  }

  public static class Type {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("name", "name", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final Optional<String> name;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Type(@NotNull String __typename, @Nullable String name) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.name = Optional.fromNullable(name);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public Optional<String> name() {
      return this.name;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], name.isPresent() ? name.get() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Type{"
          + "__typename=" + __typename + ", "
          + "name=" + name
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Type) {
        Type that = (Type) o;
        return this.__typename.equals(that.__typename)
         && this.name.equals(that.name);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Type> {
      @Override
      public Type map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String name = reader.readString($responseFields[1]);
        return new Type(__typename, name);
      }
    }
  }

  public static class __Type {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("name", "name", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final Optional<String> name;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public __Type(@NotNull String __typename, @Nullable String name) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.name = Optional.fromNullable(name);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public Optional<String> name() {
      return this.name;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], name.isPresent() ? name.get() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "__Type{"
          + "__typename=" + __typename + ", "
          + "name=" + name
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof __Type) {
        __Type that = (__Type) o;
        return this.__typename.equals(that.__typename)
         && this.name.equals(that.name);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<__Type> {
      @Override
      public __Type map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String name = reader.readString($responseFields[1]);
        return new __Type(__typename, name);
      }
    }
  }
}
