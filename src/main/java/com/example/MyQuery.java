package com.example;

import com.apollographql.apollo3.api.Adapter;
import com.apollographql.apollo3.api.CompiledField;
import com.apollographql.apollo3.api.CustomScalarAdapters;
import com.apollographql.apollo3.api.Query;
import com.apollographql.apollo3.api.json.JsonWriter;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class MyQuery implements Query<MyQuery.Data> {
    @NotNull
    @Override
    public Adapter<Data> adapter() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public String document() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public String id() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public String name() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public CompiledField rootField() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void serializeVariables(@NotNull JsonWriter jsonWriter, @NotNull CustomScalarAdapters customScalarAdapters) throws IOException {
        throw new UnsupportedOperationException();
    }

    public static class Data implements Query.Data {
    }
}
