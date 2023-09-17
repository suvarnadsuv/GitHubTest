package GitHubMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Countries2 {
  @Test
  public void ke() {
	  
	  String name = "Kerala";
	  Assert.assertEquals(name, "Kerala");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void ka() {
	  
	  String name = "Karnataka";
	  Assert.assertEquals(name, "Karnataka");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void jk() {
	  
	  String name = "Jammu Kashmir";
	  Assert.assertEquals(name, "Jammu Kashmir");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void wb() {
	  
	  String name = "West Bengal";
	  Assert.assertEquals(name, "West Bengal");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void mh() {
	  
	  String name = "Maharastra";
	  Assert.assertEquals(name, "Maharastra");
	  System.out.println("The State is : " +name);
  }
  
}
