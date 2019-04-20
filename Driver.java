public class Driver{
  public static void main(String[] args){
    Information[] ary = new Information[6];
    ary[0] = new Information(8, "Food Rations Destroyed", "4/15/19");
    ary[1] = new Information(6, "Relief Shelter set up in Connaught Place", "4/15/19");
    ary[2] = new Information(7, "NMDA advises all citizens to stay at home", "4/16/19");
    ary[3] = new Information(10, "Rescue Forces deployed in New Deli", "4/15/19");
    ary[4] = new Information(8, "We are expecting 15 inches of rain", "4/16/19");
    ary[5] = new Information(9, "Missing Child, Aryan Burhati, Age: 14, Curly hair, 5' 11, last seen in Colaba", "4/16/19");
    InfoDistribution sample = new InfoDistribution(ary);
    sample.update("main.csv");
}}
