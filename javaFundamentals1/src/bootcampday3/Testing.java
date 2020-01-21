package bootcampday3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


	class HawaiiNativeForestBirds {
		private String name;
		private String scientificname;
		private String color;
		private Integer population;
		public HawaiiNativeForestBirds(){

		  }
		  public HawaiiNativeForestBirds(String name, String scientificname,
		        String color, Integer population) {
		    super();
		    this.name = name;
		    this.scientificname = scientificname;
		    this.color = color;
		    this.population = population;
		  }  
		  public String getName() {
			    return name;
			}
			public void setName(String name) {
			    this.name = name;
			}
			public String getScientificname() {
			    return scientificname;
			}
			public void setScientificname(String scientificname) {
			    this.scientificname = scientificname;
			}
			public String getColor() {
			    return color;
			}
			public void setColor(String color) {
			    this.color = color;
			}
			public Integer getPopulation() {
			    return population;
			}
			public void setPopulation(Integer population) {
			    this.population = population;
			}
			
	 public static void main(String[] args) {

	    String csvFile = "birds.csv";
	    String line = "";
	    String cvsSplitBy = ",";

	    List<HawaiiNativeForestBirds>  listofBirds = new ArrayList<HawaiiNativeForestBirds>();
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

	        while ((line = br.readLine()) != null) {

	            // use comma as separator
	            String[] bird = line.split(cvsSplitBy);
	            HawaiiNativeForestBirds Hawaiinbird= new HawaiiNativeForestBirds(bird[0],bird[1],bird[2],Integer.valueOf(bird[3]));
	            listofBirds.add(Hawaiinbird);
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	// First display null values
	 HawaiiNativeForestBirds[]  hbirds=new        HawaiiNativeForestBirds[listofBirds.size()];
	    System.out.println("index   " + "element   ");  
	    int i=0;
	    for (HawaiiNativeForestBirds hbird:hbirds){
	        i++;
	        System.out.println(i+"   "+hbird);
	        }
	    // Now display actual values
	    hbirds= listofBirds.toArray(new HawaiiNativeForestBirds[listofBirds.size()]);

	    System.out.println("index   " + "name   "+ "Scientific Name    "+ "Color   " + "Population   ");        
	    i=0;
	    for (HawaiiNativeForestBirds hbird:hbirds){
	        i++;
	        System.out.println(i+"   "+hbird.toString());
	        }
	 }
	 }
