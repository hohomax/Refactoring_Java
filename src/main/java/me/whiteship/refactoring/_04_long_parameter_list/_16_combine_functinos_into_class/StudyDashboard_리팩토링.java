package me.whiteship.refactoring._04_long_parameter_list._16_combine_functinos_into_class;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudyDashboard_리팩토링 {

    public static void main(String[] args) throws IOException, InterruptedException {

        StudyPrinter studyPrinter = new StudyPrinter();
        studyPrinter.print();
    }

}
