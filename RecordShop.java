import java.util.*;

public class RecordShop {
  public String name;
  public ArrayList<Album> stock;

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

  public void bookInStock(Album album){
    stock.add(album);
  }

  public int findIndex(Album album){
    for (Album album1 : stock) {
      if (album1.getTitle() == album.title) {
         return stock.indexOf(album1);
         // stock.remove(i);
      }
    }
    return -1;
  }


  public void sellAlbum(Album album){
    for (Album albun : stock) {
      if (albun.getTitle() == album.title) {
         int i = stock.indexOf(albun);
          stock.remove(i);
      }
    }
  }

  // public void sellAnAlbum(Album album){
  //   int index = findIndex(album);
  //   return stock.remove(index);
  // }

}



