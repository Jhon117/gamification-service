package com.edtech.gamification.controller;

import java.util.List;

import com.edtech.gamification.dto.BadgeDto;
import com.edtech.gamification.service.GamificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edtech/gamification")
public class GamificationController {
    @Autowired
    private GamificationService gamificationService;

    @GetMapping("badge")
    public List<BadgeDto> getAllBadge() {
        return gamificationService.getAllBadge();

    }

    @GetMapping("badge/{badgeId}")
    public BadgeDto getBadgeById(@PathVariable(value = "badgeId") long badgeId) {
        return gamificationService.getBadgeByBadgeId(badgeId);
    }

    @PostMapping("badge")
    public void createBadge(@RequestBody BadgeDto badgeDto) {
        gamificationService.createBadge(badgeDto);

    }

    @PatchMapping("badge/update/{badgeId}")
    public String updateBadgeByBadgeId(@PathVariable(value = "badgeId") long badgeId, @RequestBody BadgeDto badgeDto) {
        return ("Record Updated" + " " + gamificationService.updateBadgeByBadgeId(badgeId, badgeDto).toString());
    }

    @DeleteMapping("badge/{badgeId}")
    public String deleteBadgeByBadgeId(@PathVariable(value = "badgeId") long badgeId) {
        BadgeDto badgeDto = gamificationService.deleteBadgeByBadgeId(badgeId);
        return ("Record Deleted" + " " + badgeDto.toString());

    }
}
