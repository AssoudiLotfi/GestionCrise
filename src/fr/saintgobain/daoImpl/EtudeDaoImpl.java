	package fr.saintgobain.daoImpl;

	import java.util.List;

	import fr.saintgobain.dao.EtudeDao;
	import fr.saintgobain.entities.Etude;
	import fr.saintgobain.repositories.EtudeRepository;

	public class EtudeDaoImpl implements EtudeDao {

		private EtudeRepository etudeRepository;

		/**
		 * 
		 * @return the Etude List
		 */
		@Override
		public List<Etude> getAllEtude() {
			return etudeRepository.findAll();
		}

		/**
		 * create Etude
		 */
		@Override
		public void createEtude(Etude etude) {
			etudeRepository.save(etude);
		}

		/**
		 * find Etude by id
		 */
		@Override
		public Etude findEtudeById(int id) {
			Etude etude = etudeRepository.findOne(id);
			return etude;
		}

		/**
		 * 
		 * @param id
		 *            : the id of Etude
		 */
		@Override
		public void deleteEtudeById(int id) {
			etudeRepository.delete(id);

		}

		// getter
		public EtudeRepository getEtudeRepository() {
			return etudeRepository;
		}

		// setter
		public void setEtudeRepository(EtudeRepository etudeRepository) {
			this.etudeRepository = etudeRepository;
		}

	}
