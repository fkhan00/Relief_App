import java.util.*;
import java.io.*;
public class InfoDistribution extends Information{
    // takes a chunk of news alerts at a time
    public Information[] sources;
    public InfoDistribution(Information[] info){
      super(5, "", "");
      sources = new Information[info.length];
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
        output += sources[i].getAlert() + "," + sources[i].getDate() + "," + sources[i].getImportance() + "\n";
        for(int j = 0; j < lineLength; j++){
          output += "-";}}
      return output;}

    public  void update(String file){
      // posts it into a file
      String news = format();
      try {
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        out.write(news);
        out.flush();
        out.close();}
      catch (FileNotFoundException e) {
        System.out.println("There is no file named " + file + ". Please check your spelling");}
      catch(IOException e){}}


  }
