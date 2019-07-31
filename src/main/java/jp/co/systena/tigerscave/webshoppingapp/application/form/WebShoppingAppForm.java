package jp.co.systena.tigerscave.webshoppingapp.application.form;

public class WebShoppingAppForm{

    /*
     * 商品ID
     */
    private int itemId;
    /*
     * 個数
     */
    private int num;
    /*
     * 商品名
     */
    private String name;
    /*
     * 値段
     */
    private int price;

    /*
     *以下、Getter,Setter
     */
    public int getItemId() {
      return itemId;
    }

    public void setItemId(int itemId) {
      this.itemId = itemId;
    }

    public int getNum() {
      return num;
    }

    public void setNum(int num) {
      this.num = num;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getPrice() {
      return price;
    }

    public void setPrice(int price) {
      this.price = price;
    }

}