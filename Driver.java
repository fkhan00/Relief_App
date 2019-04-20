public class Driver{
  public static void main(String[] args){
    Information[] ary = new Information[10];
    for(int i = 0; i < 10; i++){
      ary[i] = new Information(5, "heavy floods in Central", "8pm");}
    InfoDistribution sample = new InfoDistribution(ary);
    sample.update("main.csv");
}}
