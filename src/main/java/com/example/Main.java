package com.example;

import com.apollographql.apollo3.ApolloCall;
import com.apollographql.apollo3.api.Operation;

public class Main {
    public static void main(String[] av) {
        Operation.Data data = new MyQuery.Data();
        ApolloCall<MyQuery.Data> queryCall = null;
    }
}
