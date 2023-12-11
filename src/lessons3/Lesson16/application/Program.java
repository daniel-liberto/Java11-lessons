package lessons3.Lesson16.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<?> myObjList = new ArrayList<Object>();
    List<Integer> myNumberlist = new ArrayList<Integer>();

    myObjList = myNumberlist;
  }
}
