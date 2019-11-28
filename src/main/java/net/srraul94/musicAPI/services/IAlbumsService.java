package net.srraul94.musicAPI.services;

import java.util.List;


import net.srraul94.musicAPI.entity.Album;

public interface IAlbumsService {
	
	public List<Album> buscarTodos();
	public void guardar(Album album);
	public void eliminar(int id);

}
