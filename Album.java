public class Album{
  private String artist;
  private String title;
  private double price;

  public Album(String artist, String title, double price){
    this.artist = artist;
    this.title = title;
    this.price = price;
  }

  public String getArtist(){
    return this.artist;
  }

  public String getTitle(){
    return this.title;
  }

  public double getPrice(){
    return this.price;
  }

}
