package behavior.observer;

public class JobSearch {
	public static void main(String[] args) {
		JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
		
		jobSite.addVacancy("First java position");
		jobSite.addVacancy("Second java position");
		jobSite.addVacancy("Third java position");
		
		Observer firstSubscriber = new Subscriber("Alex Markelov");
		Observer secondSubscriber = new Subscriber("Bulat Safin");
		Observer thirdSubscriber = new Subscriber("Alex Melnikov");
		
		jobSite.addObserver(firstSubscriber);
		jobSite.addObserver(secondSubscriber);
		jobSite.addObserver(thirdSubscriber);
		
		jobSite.addVacancy("Senior java position");
		
		jobSite.removeVacancy("Third java position");
	}
}
