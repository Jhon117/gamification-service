package com.edtech.gamification.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gamification")
public class BadgeCardItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "badgeId")
    private long badgeId;

    @Column(name = "userId")
    private String userId;

    @Column(name = "badgeTimestamp")
    private String badgeTimestamp;

    @Column(name = "badge")
    private String badge;

    public BadgeCardItem() {
        super();
    }

    public BadgeCardItem(long badgeId, String userId, String badgeTimestamp, String badge) {
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
