import java.util.*;
import java.io.*;
public class InfoDistribution{
  // creates object that stores info, date, and level of importance
  public class Information implements Comparable<Information>{
    // importance level is on a rating of 1 - 10
    public int importance;
    // small headline
    public String alert;
    // date is of format d/m/y
    public String date;

    public Information(int severity, String headline, String when){
      importance = severity;
      alert = headline;
      date = when;}

    public int getImportance(){
      return importance;}

    public String getAlert(){
      return alert;}

    public String getDate(){
      return date;}
    // implementation of comparable interface
    // compares on basis of level of importance
    public int compareTo(Information other){
      return other.getImportance() - getImportance();}}

  public class Receive{
    // takes a chunk of news alerts at a time
    public Information[] sources;

    public Receive(Information[] info){
      for(int i = 0; i < info.length; i++){
        sources[i] = info[i];}
      // sorts from most to least important, will later use radix sort for more efficiency
      // sources length ~ 50 radix sort will be 2n for size 12 or lower insertion sort would be better
      Arrays.sort(sources);}

    public String format(){
      // formats into a presentable format
      String output = "";
      int lineLength = output.length();
      for(int i = 0; i < sources.length; i++){
        output += sources[i].getAlert() + sources[i].getDate() + sources[i].getImportance() + "\n";
        for(int j = 0; j < lineLength; j++){
          output += "-";}}
      return output;}

    public  void update(String file){
      // posts it into a file
      String news = format();
      try {
        BufferedWriter out = new BufferedWriter(new FileWriter("file"));
        out.write(news);
        out.close();}
      catch (FileNotFoundException e) {
        System.out.println("There is no file named " + file + ". Please check your spelling");}
      catch(IOException e){}}


  }
}
