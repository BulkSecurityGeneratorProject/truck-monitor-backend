package com.truckmonitor.service.dto;
import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.truckmonitor.domain.Position} entity.
 */
@ApiModel(description = "Task entity. @author The JHipster team.")
public class PositionDTO implements Serializable {

    private Long id;

    private Double lat;

    private Double lng;

    private Double altitude;

    private Double speed;

    private Double course;

    private Instant serverTime;

    private Instant deviceTime;


    private Long vehicleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Instant getServerTime() {
        return serverTime;
    }

    public void setServerTime(Instant serverTime) {
        this.serverTime = serverTime;
    }

    public Instant getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Instant deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PositionDTO positionDTO = (PositionDTO) o;
        if (positionDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), positionDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PositionDTO{" +
            "id=" + getId() +
            ", lat=" + getLat() +
            ", lng=" + getLng() +
            ", altitude=" + getAltitude() +
            ", speed=" + getSpeed() +
            ", course=" + getCourse() +
            ", serverTime='" + getServerTime() + "'" +
            ", deviceTime='" + getDeviceTime() + "'" +
            ", vehicle=" + getVehicleId() +
            "}";
    }
}
