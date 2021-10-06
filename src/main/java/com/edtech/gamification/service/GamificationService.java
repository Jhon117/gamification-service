package com.edtech.gamification.service;

import java.util.ArrayList;
import java.util.List;

import com.edtech.gamification.dto.BadgeDto;
import com.edtech.gamification.model.BadgeCardItem;
import com.edtech.gamification.repository.BadgeRepository;
import com.edtech.gamification.util.UtilMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamificationService {
    private BadgeRepository badgeRepository;

    @Autowired
    private UtilMapper utilMapper;

    @Autowired
    public GamificationService(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    public void createBadge(BadgeDto badgeDto) {
        BadgeCardItem badge = new BadgeCardItem(badgeDto.getBadgeId(), badgeDto.getUserId(), badgeDto.getBadgeTimestamp(),
                badgeDto.getBadge());
        this.badgeRepository.save(badge);
    }

    public List<BadgeDto> getAllBadge() {
        List<BadgeCardItem> badgeList = badgeRepository.findAll();
        List<BadgeDto> badgeDtoList = new ArrayList<>();
        badgeList.forEach((badge) -> {
            BadgeDto badgeDto = new BadgeDto();
            utilMapper.mapBadgeToBadgeDto(badge, badgeDto);
            badgeDtoList.add(badgeDto);
        });

        return badgeDtoList;
    }

    public BadgeDto getBadgeByBadgeId(long badgeId) {
        BadgeCardItem badge = badgeRepository.findByBadgeId(badgeId);
        BadgeDto badgeDto = new BadgeDto();
        utilMapper.mapBadgeToBadgeDto(badge, badgeDto);
        return badgeDto;

    }

    public BadgeDto updateBadgeByBadgeId(long badgeId, BadgeDto badgeDto) {
        BadgeCardItem badge = new BadgeCardItem();
        badgeDto.setBadgeId(badgeId);
        utilMapper.mapBadgeDtoToBadge(badgeDto, badge);
        this.badgeRepository.save(badge);
        return badgeDto;

    }

    public BadgeDto deleteBadgeByBadgeId(long badgeId) {
        BadgeCardItem badge = badgeRepository.findByBadgeId(badgeId);
        BadgeDto badgeDto = new BadgeDto();
        utilMapper.mapBadgeToBadgeDto(badge, badgeDto);
        badgeRepository.delete(badge);
        return badgeDto;
    }
}
