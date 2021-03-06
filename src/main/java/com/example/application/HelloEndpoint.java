package com.example.application;

import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;

@Endpoint
@AnonymousAllowed
public class HelloEndpoint {
    public SyncStatus hello(String value){
        return SyncStatus.forName(value);
    }
}
