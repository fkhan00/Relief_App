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
    alert = headline + " ";
    date = when + " ";}

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
