import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    private Calk calk=new Calk();
    @Test(groups = "init")
    public  void  testSum() throws Exception{

        Assert.assertEquals(5,calk.Sum(2,3));
    }
    @Test(groups = "init")
    public void  testDivision() throws Exception{
        Assert.assertEquals(2.5,calk.Division(5,2));
    }
    @Test(groups = "init")
    public  void testList() throws Exception{
        Assert.assertTrue(calk.list.isEmpty());
        Assert.assertTrue(calk.list.size()==0);
    }
    @Test(groups = "init")
    public void testListIsNotEmpty() throws  Exception
    {
        calk.list.add("1");
        calk.list.add("1");
        calk.list.add("1");
        calk.list.add("1");
        Assert.assertTrue(calk.list.size()==4);
    }
    @Test(groups = "init")
    public  void testSetList() throws  Exception
    {
         calk.list.add("2");
         Assert.assertEquals("2",calk.list.get(4));
    }

}
