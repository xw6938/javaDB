package springproj_1.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

public class AccessInfoEntity {

    @JsonIgnore
    private long id;

    private long MappingId;

    private String Ip;

    private String location;

    private Date date;

    private AccessInfoEntity(Builder builder) {
        setId(builder.id);
        setMappingId(builder.MappingId);
        setIp(builder.Ip);
        setLocation(builder.location);
        setDate(builder.date);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMappingId() {
        return MappingId;
    }

    public void setMappingId(long mappingId) {
        MappingId = mappingId;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static final class Builder {
        private long id;
        private long MappingId;
        private String Ip;
        private String location;
        private Date date;

        public Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder MappingId(long val) {
            MappingId = val;
            return this;
        }

        public Builder Ip(String val) {
            Ip = val;
            return this;
        }

        public Builder location(String val) {
            location = val;
            return this;
        }

        public Builder date(Date val) {
            date = val;
            return this;
        }

        public AccessInfoEntity build() {
            return new AccessInfoEntity(this);
        }
    }
}
