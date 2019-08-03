package springproj_1.demo.entity;

public class LockEntity {

    private long id;

    private String password;

    private LockEntity(Builder builder) {
        setId(builder.id);
        setPassword(builder.password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static final class Builder {
        private long id;
        private String password;

        public Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder password(String val) {
            password = val;
            return this;
        }

        public LockEntity build() {
            return new LockEntity(this);
        }
    }
}
