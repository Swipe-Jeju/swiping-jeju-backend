package com.goorm.domain;

import com.goorm.dto.Album;
import com.goorm.dto.Hotplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// 인터페이스 생성해 jpa repository 상속하면 기본 crud메소드 자동 생성
@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
