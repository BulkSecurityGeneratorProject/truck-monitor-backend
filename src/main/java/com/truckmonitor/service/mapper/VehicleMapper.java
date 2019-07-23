package com.truckmonitor.service.mapper;

import com.truckmonitor.domain.*;
import com.truckmonitor.service.dto.VehicleDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Vehicle} and its DTO {@link VehicleDTO}.
 */
@Mapper(componentModel = "spring", uses = {PositionMapper.class})
public interface VehicleMapper extends EntityMapper<VehicleDTO, Vehicle> {

    VehicleDTO toDto(Vehicle vehicle);

    Vehicle toEntity(VehicleDTO vehicleDTO);

    @AfterMapping
    default void setPosition(@MappingTarget VehicleDTO vehicleDTO, Vehicle vehicle) {
        if (vehicle.getLastPosition() != null) {
            vehicleDTO.getPosition().add(vehicle.getLastPosition().getLat());
            vehicleDTO.getPosition().add(vehicle.getLastPosition().getLng());
        }
    }

    default Vehicle fromId(Long id) {
        if (id == null) {
            return null;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        return vehicle;
    }
}
