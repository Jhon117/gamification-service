package com.edtech.gamification.util;

import com.edtech.gamification.dto.BadgeDto;
import com.edtech.gamification.model.BadgeCardItem;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NamingConventions;
import org.springframework.stereotype.Component;

@Component
public class UtilMapper {

    private ModelMapper modelMapper;

    public UtilMapper() {
        this.modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSourceNamingConvention(NamingConventions.NONE)
                .setDestinationNamingConvention(NamingConventions.NONE);

    }

    public BadgeCardItem mapBadgeDtoToBadge(BadgeDto badgeDto, BadgeCardItem badge) {
        this.modelMapper.map(badgeDto, badge);
        return badge;
    }

    public BadgeDto mapBadgeToBadgeDto(BadgeCardItem badge, BadgeDto badgeDto) {
        this.modelMapper.map(badge, badgeDto);
        return badgeDto;
    }

}
