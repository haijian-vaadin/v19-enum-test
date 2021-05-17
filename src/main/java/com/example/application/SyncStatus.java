package com.example.application;

public enum SyncStatus {
    REQUESTED,
    PROCESSING,
    ERRORED,
    FINISHED;

    public static SyncStatus forName(String aa) {
        for(SyncStatus status: values()) {
            if(status.name().equals(aa)){
                return status;
            }
        }
        return null;
    }
}
