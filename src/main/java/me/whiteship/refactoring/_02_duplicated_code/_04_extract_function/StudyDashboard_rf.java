package me.whiteship.refactoring._02_duplicated_code._04_extract_function;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


/**
 *
 *  extract method 를 통해 메소드 추출하기
 */
public class StudyDashboard_rf {

    private void printParticipants(int eventId) throws IOException {
        // Get github issue to check homework
        GHIssue issue = getGhIssue(eventId);

        Set<String> participants = getUserNames(issue);

        // Print participants
        participants.forEach(System.out::println);
    }

    private static Set<String> getUserNames(GHIssue issue) throws IOException {
        // Get participants
        Set<String> participants = new HashSet<>();
        issue.getComments().forEach(c -> participants.add(c.getUserName()));
        return participants;
    }

    private static GHIssue getGhIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }

    private void printReviewers() throws IOException {
        // Get github issue to check reviews
        GHIssue issue = getGhIssue(30);

        // Get reviewers
        Set<String> reviewers = getUserNames(issue);

        // Print reviewers
        reviewers.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard_rf studyDashboard = new StudyDashboard_rf();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }

}
