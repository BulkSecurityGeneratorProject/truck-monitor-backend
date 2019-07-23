package com.truckmonitor.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@ApiModel(description = "Position entity")
@Entity
@Table(name = "position")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lng")
    private Double lng;

    @Column(name = "altitude")
    private Double altitude;

    @Column(name = "speed")
    private Double speed;

    @Column(name = "course")
    private Double course;

    @Column(name = "server_time")
    private Instant serverTime;

    @Column(name = "device_time")
    private Instant deviceTime;

    @ManyToOne
    @JsonIgnoreProperties("positions")
    private Vehicle vehicle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public Position lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public Position lng(Double lng) {
        this.lng = lng;
        return this;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getAltitude() {
        return altitude;
    }

    public Position altitude(Double altitude) {
        this.altitude = altitude;
        return this;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public Position speed(Double speed) {
        this.speed = speed;
        return this;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getCourse() {
        return course;
    }

    public Position course(Double course) {
        this.course = course;
        return this;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Instant getServerTime() {
        return serverTime;
    }

    public Position serverTime(Instant serverTime) {
        this.serverTime = serverTime;
        return this;
    }

    public void setServerTime(Instant serverTime) {
        this.serverTime = serverTime;
    }

    public Instant getDeviceTime() {
        return deviceTime;
    }

    public Position deviceTime(Instant deviceTime) {
        this.deviceTime = deviceTime;
        return this;
    }

    public void setDeviceTime(Instant deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Position vehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        return id != null && id.equals(((Position) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Position{" +
            "id=" + getId() +
            ", lat=" + getLat() +
            ", lng=" + getLng() +
            ", altitude=" + getAltitude() +
            ", speed=" + getSpeed() +
            ", course=" + getCourse() +
            ", serverTime='" + getServerTime() + "'" +
            ", deviceTime='" + getDeviceTime() + "'" +
            "}";
    }
}
