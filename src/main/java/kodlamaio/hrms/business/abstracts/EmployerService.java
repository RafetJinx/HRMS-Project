package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.dataAccess.concretes.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
}
