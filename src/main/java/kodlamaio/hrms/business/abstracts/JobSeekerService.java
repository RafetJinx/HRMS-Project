package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.dataAccess.concretes.DataResult;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
}
