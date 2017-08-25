package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.ImageDao;
import fr.saintgobain.entities.Image;
import fr.saintgobain.repositories.ImageRepository;

public class ImageDaoImpl implements ImageDao {
	
	private ImageRepository imageRepository;

	/**
	 * 
	 * @return the Image List
	 */
	public List<Image> getAllImage() {
		return imageRepository.findAll();
	}

	/**
	 * create Image
	 */
	public void createImage(Image image) {
		imageRepository.save(image);
	}

	/**
	 * find Image by id
	 */
	@Override
	public Image findImageById(int id) {
		Image image = imageRepository.findOne(id);
		return image;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Image
	 */
	@Override
	public void deleteImageById(int id) {
		imageRepository.delete(id);

	}

	// getter
	public ImageRepository getImageRepository() {
		return imageRepository;
	}

	// setter
	public void setImageRepository(ImageRepository imageRepository) {
		this.imageRepository = imageRepository;
	}

}
