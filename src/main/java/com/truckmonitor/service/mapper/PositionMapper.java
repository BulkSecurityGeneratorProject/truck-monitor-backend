package com.truckmonitor.service.mapper;

import com.truckmonitor.domain.*;
import com.truckmonitor.service.dto.PositionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Position} and its DTO {@link PositionDTO}.
 */
@Mapper(componentModel = "spring", uses = {VehicleMapper.class})
public interface PositionMapper extends EntityMapper<PositionDTO, Position> {

    @Mapping(source = "vehicle.id", target = "vehicleId")
    PositionDTO toDto(Position position);

    @Mapping(source = "vehicleId", target = "vehicle")
    Position toEntity(PositionDTO positionDTO);

    default Position fromId(Long id) {
        if (id == null) {
            return null;
        }
        Position position = new Position();
        position.setId(id);
        return position;
    }
}
