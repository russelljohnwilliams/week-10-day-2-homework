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
    for (Album albumz : stock) {
      if (albumz.getTitle() == album.title) {
         return stock.indexOf(albumz);
         // stock.remove(i);
      }
    }
    return -1;
  }

  public void sellAlbum(Album album){
    int index = findIndex(album);
    stock.remove(index);
  }

  // public void sellAlbum(Album album){
  //   for (Album albumz : stock) {
  //     if (albumz.getTitle() == album.title) {
  //        int i = stock.indexOf(albumz);
  //         stock.remove(i);
  //     }
  //   }
  // }



}



