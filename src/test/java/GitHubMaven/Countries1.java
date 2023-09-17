package GitHubMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Countries1 {
  @Test
  public void ap() {
	  
	  String name = "andhra pradesh";
	  Assert.assertEquals(name, "andhra pradesh");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void bi() {
	  
	  String name = "Bihar";
	  Assert.assertEquals(name, "Bihar");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void te() {
	  
	  String name = "Telangana";
	  Assert.assertEquals(name, "Telangana");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void pu() {
	  
	  String name = "Punjab";
	  Assert.assertEquals(name, "Punjab");
	  System.out.println("The State is : " +name);
  }
  
  @Test
  public void gu() {
	  
	  String name = "Gujarath";
	  Assert.assertEquals(name, "Gujarath");
	  System.out.println("The State is : " +name);
  }
  
}
