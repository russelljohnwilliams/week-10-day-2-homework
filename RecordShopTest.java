import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RecordShopTest{
  RecordShop recordShop;
  Album album;

  @Before
  public void before(){
    recordShop = new RecordShop("Surface Noise");
    album = new Album();
  }

  @Test
  public void shopHasName(){
  assertEquals("Surface Noise", recordShop.getName());
  }

  @Test
  public void shopHasNoStock(){
    assertEquals(0, recordShop.stockCheck());
  }

  @Test
  public void bookAlbumIntoStock(){
    recordShop.checkInStock(album);
    assertEquals(1, recordShop.stockCheck());
  }

  // @Test
  // public void sellAnAlbum(){
  //   recordShop.checkInStock(album);
  //   assertEquals(1, recordShop.stockCheck());
  //   recordShop.sellAnAlbum();
  //   assertEquals(0, recordShop.stockCheck());
  // }

}