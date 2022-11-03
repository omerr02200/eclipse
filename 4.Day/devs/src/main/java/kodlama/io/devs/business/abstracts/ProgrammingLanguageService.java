package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language) throws Exception;
	void update(ProgrammingLanguage language);
	void delete(ProgrammingLanguage language);
	ProgrammingLanguage getByid(int id);
}
