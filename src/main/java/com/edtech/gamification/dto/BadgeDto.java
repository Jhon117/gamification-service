package com.edtech.gamification.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BadgeDto {

    private long badgeId;
    private String userId;
    private String badgeTimestamp;
    private String badge;

    public BadgeDto() {
        super();
    }

    public BadgeDto(long badgeId, String userId, String badgeTimestamp, String badge) {
        this.badgeId = badgeId;
        this.userId = userId;
        this.badgeTimestamp = badgeTimestamp;
        this.badge = badge;
    }

    public long getBadgeId() { return badgeId;}

    public void setBadgeId(long badgeId) {this.badgeId = badgeId;}

    public String getUserId() { return userId;}

    public void setUserId(String userId) {this.userId = userId;}

    public String getBadgeTimestamp() { return badgeTimestamp;}

    public void setBadgeTimestamp(String badgeTimestamp) {this.badgeTimestamp = badgeTimestamp;}

    public String getBadge() { return badge; }

    public void setBadge(String badge) { this.badge = badge; }

    @Override
    public String toString() {
        return "Badge [badgeId=" + badgeId + ", userId=" + userId + ", badgeTimestamp=" + badgeTimestamp
                + ", badge=" + badge + "]";
    }
}
