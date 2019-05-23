package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @RequestMapping("/home")
    public String home() {
        return "/index";
    }
    @RequestMapping("/ducdic")
    public String dictionary(@RequestParam String eng, Model model) {
        Map<String, String> dic = new HashMap<>();
        dic.put("banana", "chuối");
        dic.put("apple", "táo");
        dic.put("teacher", "cô giáo");
        dic.put("class", "lớp");
        dic.put("school", "trường học");
        String ducdit = dic.get(eng);
        model.addAttribute("search", ducdit);
        return "/dic";
    }
}
