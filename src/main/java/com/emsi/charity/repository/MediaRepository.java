package com.emsi.charity.repository;

import com.emsi.charity.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {
    List<Media> findByActionId(Long actionId);
}
