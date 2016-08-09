import static org.junit.Assert.assertEquals;
import org.junit.*;

public class AlbumTest{
  Album album;

  @Before
  public void before(){
    album = new Album("My Bloody Valentine", "Loveless", 7.99);
  }

  @Test
  public void albumHasArtist(){
  assertEquals("My Bloody Valentine", album.getArtist());
  }

  @Test
  public void albumHasTitle(){
  assertEquals("Loveless", album.getTitle());
  }

  @Test
  public void albumHasPrice(){
  assertEquals(7.99, album.getPrice(), 0.01);
  }

}