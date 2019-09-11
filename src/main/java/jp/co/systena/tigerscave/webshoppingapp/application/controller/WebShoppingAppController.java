package jp.co.systena.tigerscave.webshoppingapp.application.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jp.co.systena.tigerscave.webshoppingapp.application.service.WebShoppingAppService;

@Controller // Viewあり。Viewを返却するアノテーション
public class WebShoppingAppController extends WebShoppingAppService{

  int itemId;
  int num;
  int totalNum;
  String name;
  String customerName;
  List<String> nameList = new ArrayList<>();
  int price;
  int totalPrice;


  @RequestMapping("/home") // URLとのマッピング
  public String homePage(HttpSession session, Model model){

 // Viewに渡すデータを設定
    model.addAttribute("num", 0);
    model.addAttribute("price", 0);
    model.addAttribute("customerName", "ゲスト");

    // Viewのテンプレート名を返す
    return "home";
  }

  @RequestMapping("/buy-smartphone") // URLとのマッピング
  public String selectSmartphone(HttpSession session, Model model) {

    List<String> itemList = getItemList(1);
    itemId = Integer.valueOf(itemList.get(0));
//    name = itemList.get(1);
    price = Integer.valueOf(itemList.get(2));

    totalNum ++;
//    nameList.add(name);
    totalPrice = totalPrice + price;
    // Viewに渡すデータを設定
    model.addAttribute("num", totalNum);
//    model.addAttribute("name", nameList);
    model.addAttribute("price", totalPrice);
    model.addAttribute("customerName", customerName);

    // Viewのテンプレート名を返す
    return "home";
  }

  @RequestMapping("/buy-hinaningyou") // URLとのマッピング
  public String selectHinaningyou(HttpSession session, Model model) {

    List<String> itemList = getItemList(2);
    itemId = Integer.valueOf(itemList.get(0));
//    name = itemList.get(1);
    price = Integer.valueOf(itemList.get(2));

    totalNum ++;
//    nameList.add(name);
    totalPrice = totalPrice + price;
    // Viewに渡すデータを設定
    model.addAttribute("num", totalNum);
//    model.addAttribute("name", nameList);
    model.addAttribute("price", totalPrice);
    model.addAttribute("customerName", customerName);

    // Viewのテンプレート名を返す
    return "home";
  }

  @RequestMapping("/reset") // URLとのマッピング
  public String resetPage(HttpSession session, Model model){

    totalNum = 0;
    totalPrice = 0;

 // Viewに渡すデータを設定
    model.addAttribute("num", totalNum);
    model.addAttribute("price", totalPrice);
    model.addAttribute("customerName", customerName);

    // Viewのテンプレート名を返す
    return "home";
  }

  @RequestMapping("/login") // URLとのマッピング
  public String login(HttpSession session, Model model){

 // Viewに渡すデータを設定
    model.addAttribute("num", totalNum);
    model.addAttribute("price", totalPrice);
    model.addAttribute("customerName", customerName);

    // Viewのテンプレート名を返す
    return "login";
  }

  @RequestMapping("/login_home") // URLとのマッピング
  public String index(HttpSession session, Model model,@RequestParam(name = "loginName", required = false) String loginName) {

 // Viewに渡すデータを設定
    model.addAttribute("num", totalNum);
    model.addAttribute("price", totalPrice);
    model.addAttribute("customerName", loginName);

    // Viewのテンプレート名を返す
    return "home";
  }
}