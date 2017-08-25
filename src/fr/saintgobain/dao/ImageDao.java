package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Image;

public interface ImageDao {
	
	public void createImage(Image image);
    public void deleteImageById(int id);
    public List<Image> getAllImage();
    public Image findImageById(int id);

}
