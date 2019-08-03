package springproj_1.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MappingEntity {

    @JsonIgnore
    private long id;


    private String shortUrl;

    private String longUrl;

    private long LockId;

    private long user_id;

    private int is_alive;

    private MappingEntity(Builder builder) {
        setId(builder.id);
        setShortUrl(builder.shortUrl);
        setLongUrl(builder.longUrl);
        setLockId(builder.LockId);
        setUser_id(builder.user_id);
        setIs_alive(builder.is_alive);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public long getLockId() {
        return LockId;
    }

    public void setLockId(long lockId) {
        LockId = lockId;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getIs_alive() {
        return is_alive;
    }

    public void setIs_alive(int is_alive) {
        this.is_alive = is_alive;
    }


    public static final class Builder {
        private long id;
        private String shortUrl;
        private String longUrl;
        private long LockId;
        private long user_id;
        private int is_alive;

        public Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder shortUrl(String val) {
            shortUrl = val;
            return this;
        }

        public Builder longUrl(String val) {
            longUrl = val;
            return this;
        }

        public Builder LockId(long val) {
            LockId = val;
            return this;
        }

        public Builder user_id(long val) {
            user_id = val;
            return this;
        }

        public Builder is_alive(int val) {
            is_alive = val;
            return this;
        }

        public MappingEntity build() {
            return new MappingEntity(this);
        }
    }
}