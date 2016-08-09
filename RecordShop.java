import java.util.*;

public class RecordShop {
  private String name;
  private ArrayList<Album> stock;

  public RecordShop(String name){
    this.name = name;
    this.stock = new ArrayList<Album>();
  }

  public String getName(){
    return this.name;
  }

  public int stockCheck(){
    return stock.size();
  }

<<<<<<< HEAD
  public void bookInStock(Album album){
    stock.add(album);
=======
  public void checkInStock(Album album){
    stock.add(album)
>>>>>>> parent of adaaa10... 6 tests running after refactor
  }

  // public String getAlbumTitle(){
  //   for(Album album : stock){
  //     System.out.println(album.title);
  //   }
  // }


  // public void sellAnAlbum(){
  //   for (int i = 0; i < stock.length; i++){
  //     stock[i] = null;
  //   }
  // }
}



