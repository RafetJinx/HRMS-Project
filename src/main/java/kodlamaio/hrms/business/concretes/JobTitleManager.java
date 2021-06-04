package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.api.controllers.JobTitleController;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.dataAccess.concretes.DataResult;
import kodlamaio.hrms.dataAccess.concretes.ErrorResult;
import kodlamaio.hrms.dataAccess.concretes.Result;
import kodlamaio.hrms.dataAccess.concretes.SuccessDataResult;
import kodlamaio.hrms.dataAccess.concretes.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;  
		
	}
	
	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Job titles listed");
	}
	
	@Override
	public Result add(JobTitle jobTitle) {
		if(getJobByTitle(jobTitle.getJobTitleName()).getData() != null){
			return new ErrorResult("Could not add because there is a job title with "
					+ "this name in the database.");
		} 
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job title added");
		
	}

	@Override
	public DataResult<JobTitle> getJobByTitle(String job_title) {
		return new SuccessDataResult<JobTitle>(this.jobTitleDao.getByJobTitleName(job_title));
		
	}
}
