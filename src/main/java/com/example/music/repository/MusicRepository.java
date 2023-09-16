package com.example.music.repository;

import com.example.music.entity.Musicplaylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Musicplaylist, Integer> {

}
