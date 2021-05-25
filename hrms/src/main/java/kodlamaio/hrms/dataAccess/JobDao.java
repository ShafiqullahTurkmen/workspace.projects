package kodlamaio.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
