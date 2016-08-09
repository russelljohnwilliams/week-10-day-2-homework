import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RecordShopTest{
  RecordShop recordShop;
  Album album;
  Album album2;
  Album album3;

  @Before
  public void before(){
    recordShop = new RecordShop("Surface Noise");
    album = new Album("My Bloody Valentine", "Loveless", 7.99);
    album2 = new Album("Nightclubbing", "Grace Jones", 5.99);
    album3 = new Album("Mug Museum", "Cate Le Bon", 8.99);
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
    recordShop.bookInStock(album);
    assertEquals(1, recordShop.stockCheck());
  }

  @Test
  public void findIndexOfAlbum(){
    recordShop.bookInStock(album);
    recordShop.bookInStock(album2);
    recordShop.bookInStock(album3);
    assertEquals(3, recordShop.stockCheck());
    assertEquals(2, recordShop.findIndex(album3));
  }

  @Test
  public void sellAnAlbum(){
    recordShop.bookInStock(album);
    recordShop.bookInStock(album2);
    recordShop.bookInStock(album3);
    assertEquals(3, recordShop.stockCheck());
    recordShop.sellAlbum(album3);
    assertEquals(2, recordShop.stockCheck());
  }

}