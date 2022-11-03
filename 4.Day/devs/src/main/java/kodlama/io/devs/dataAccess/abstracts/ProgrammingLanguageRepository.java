package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language) throws Exception;
	void update(ProgrammingLanguage language);
	void delete(ProgrammingLanguage language);
	ProgrammingLanguage getByid(int id);
}