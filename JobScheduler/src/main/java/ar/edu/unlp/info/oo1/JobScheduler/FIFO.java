package ar.edu.unlp.info.oo1.JobScheduler;

public class FIFO extends JobScheduler{
	
	@Override
	public JobDescription next() {
		JobDescription nextJob=null;
		nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
	}
}
