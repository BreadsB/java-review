package org.breadsb.sandbox.collections.users;

import java.util.Arrays;

public final class UserKey {

    private final byte[] keyArray;

    public UserKey(byte[] keyArray) {
        this.keyArray = keyArray;
    }

    public byte[] getKeyArray() {
        return keyArray.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return Arrays.equals(keyArray, userKey.keyArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(keyArray);
    }
}
