package ru.vtb.hack.commons;

import com.example.grpc.GreetingServiceProto;

public class Main {
    public GreetingServiceProto.GreetResponse get() {
        return GreetingServiceProto.GreetResponse.newBuilder().build();
    }
}