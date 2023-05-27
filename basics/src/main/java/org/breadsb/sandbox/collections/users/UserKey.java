package org.breadsb.sandbox.collections.users;

public final class UserKey {

    private final byte[] keyArray;

    public UserKey(byte[] keyArray) {
        this.keyArray = keyArray;
    }

    public byte[] getKeyArray() {
        return keyArray.clone();
    }
}
