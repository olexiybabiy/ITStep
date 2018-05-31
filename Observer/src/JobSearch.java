public class JobSearch {
    public static void main(String[] args){
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Possition");
        jobSite.addVacancy("Second Java Possition");

        Observer firtsSubscriber = new Subscriber("Eugene");
        Observer secondSubscriber = new Subscriber("Peter");

        jobSite.addObserver(firtsSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Possition");
    }
}
