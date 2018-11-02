package com.epam.lock;

import java.io.Serializable;

public class User implements IVersionable, Serializable {

    private long version;
    private String username;

    public User(long version, String username) {
        this.version = version;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (version != user.version) return false;
        return username != null ? username.equals(user.username) : user.username == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (version ^ (version >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
            "version=" + version +
            ", username='" + username + '\'' +
            '}';
    }
}
