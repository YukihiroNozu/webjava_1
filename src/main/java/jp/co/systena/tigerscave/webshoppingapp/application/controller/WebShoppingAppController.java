package jp.co.systena.tigerscave.webshoppingapp.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Viewあり。Viewを返却するアノテーション
public class WebShoppingAppController {

  @RequestMapping("/home") // URLとのマッピング
  public String homePage(/* HttpSession session, Model model,
                          @RequestParam(name = "name", required = false) String name */) {
    // Viewに渡すデータを設定
//    model.addAttribute("name", name);
//    model.addAttribute("message", new java.util.Date());

    // Viewのテンプレート名を返す
    return "home";
  }

  @RequestMapping("/DetailAboutSmartPhone") // URLとのマッピング
  public String detailOfSmartPhonePage(/* HttpSession session, Model model,
                          @RequestParam(name = "name", required = false) String name */) {
    // Viewに渡すデータを設定
//    model.addAttribute("name", name);

 // Viewのテンプレート名を返す
    return "DetailAboutSmartPhone";
  }
}