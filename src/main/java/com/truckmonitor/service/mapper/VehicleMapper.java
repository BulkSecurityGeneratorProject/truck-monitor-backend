package com.truckmonitor.service.mapper;

import com.truckmonitor.domain.*;
import com.truckmonitor.service.dto.VehicleDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Vehicle} and its DTO {@link VehicleDTO}.
 */
@Mapper(componentModel = "spring", uses = {PositionMapper.class})
public interface VehicleMapper extends EntityMapper<VehicleDTO, Vehicle> {

    @Mapping(source = "lastPosition.id", target = "lastPositionId")
    VehicleDTO toDto(Vehicle vehicle);

    @Mapping(source = "lastPositionId", target = "lastPosition")
    Vehicle toEntity(VehicleDTO vehicleDTO);

    default Vehicle fromId(Long id) {
        if (id == null) {
            return null;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        return vehicle;
    }
}
