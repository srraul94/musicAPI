package net.srraul94.musicAPI.services.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.srraul94.musicAPI.entity.Album;
import net.srraul94.musicAPI.repository.AlbumsRepository;
import net.srraul94.musicAPI.services.IAlbumsService;

@Service
public class AlbumService implements IAlbumsService{
	
	@Autowired
	private AlbumsRepository albumsRepo;

	@Override
	public List<Album> buscarTodos() {
		return albumsRepo.findAll();
	}

	@Override
	public void guardar(Album album) {
		albumsRepo.save(album);		
	}

	@Override
	public void eliminar(int id) {
		albumsRepo.deleteById(id);
	}

}
