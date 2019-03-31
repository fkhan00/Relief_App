import java.util.*;
import java.io.*;
public class InfoDistribution{
  public class Information implements Comparable<Information>{
    public int importance;
    public String alert;
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

    public int compareTo(Information other){
      return getImportance() - other.getImportance();}}
  public class Receive{
    public Information[] sources;
    public Receive(Information[] info){
      for(int i = 0; i < info.length; i++){
        sources[i] = info[i];}
      Arrays.sort(sources);}

    public String format(){
      String output = "";
      int lineLength = output.length();
      for(int i = 0; i < sources.length; i++){
        output += sources[i].getAlert() + sources[i].getDate() + sources[i].getImportance() + "\n";
        for(int j = 0; j < lineLength; j++){
          output += "-";}}
      return output;}

    public  void update(String file){
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
