package jp.co.systena.tigerscave.webshoppingapp.application.service;

import java.util.ArrayList;
import java.util.List;

public class WebShoppingAppService{

    public List<String> getItemList(int itemId){

      List<String> somethingList = new ArrayList<>();

      switch (itemId){
        case 1:

          // itemId
          somethingList.add(0, "1");
          // name
          somethingList.add(1, "smartphone");
          // price
          somethingList.add(2, "100000");

          break;

        case 2:

          // itemId
          somethingList.add(0, "2");
          // name
          somethingList.add(1, "雛人形");
          // price
          somethingList.add(2, "200000");

          break;
      }

      return somethingList;
    }

}