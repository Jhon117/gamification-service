package com.edtech.gamification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edtech.gamification.model.BadgeCardItem;

@Repository
public interface BadgeRepository extends JpaRepository<BadgeCardItem, Long> {

    BadgeCardItem findByBadgeId(long badgeId);

}
