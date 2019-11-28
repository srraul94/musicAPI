package net.srraul94.musicAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.srraul94.musicAPI.entity.Album;

@Repository
public interface AlbumsRepository extends JpaRepository<Album, Integer>{

	
}
