package lessons2.Lesson06.application;

import lessons2.Lesson06.entities.Comment;
import lessons2.Lesson06.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    String momentDate1 = "21/06/2018 13:05:44";
    String title1 = "Traveling to New Zealand";
    String content1 = "I'm going to visit this wonderful country!";
    int likes1 = 12;
    Post p1 = new Post(sdf.parse(momentDate1), title1, content1, likes1);
    p1.addComment(c1);
    p1.addComment(c2);

    Comment c3 = new Comment("Good night");
    Comment c4 = new Comment("May the Force be with you");
    String momentDate2 = "28/07/2018 23:14:19";
    String title2 = "Good night guys";
    String content2 = "See you tomorrow";
    int likes2 = 5;
    Post p2 = new Post(sdf.parse(momentDate2), title2, content2, likes2);
    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p2);
  }
}
