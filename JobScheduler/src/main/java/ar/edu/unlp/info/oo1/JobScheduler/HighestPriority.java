package ar.edu.unlp.info.oo1.JobScheduler;

public class HighestPriority extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription nextJob=null;
		nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
        this.unschedule(nextJob);
        return nextJob;
	}
	
}
