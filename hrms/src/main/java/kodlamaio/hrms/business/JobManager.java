package kodlamaio.hrms.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.dataAccess.JobDao;
import kodlamaio.hrms.entities.Job;
@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}



	@Override
	public List<Job> getAll() {
		return jobDao.findAll();
	}

}
