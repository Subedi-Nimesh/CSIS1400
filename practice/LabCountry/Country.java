public class Country
{
	// fields
	private String name;
   private Continent continent;	
      
      
	// constructor
	public Country(String name, Continent cont){
      this.name = name;
      this.continent = cont;
   }
   
	// methods
   public String getName(){
      return name;
   }
   public Continent getContinent(){
      return continent;
   }
	
	@Override
	public String toString()
	{
		return String.format("%s (%s)", name, continent);
	}
}