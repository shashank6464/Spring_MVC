package org.example.Controller;

import org.example.Player;
import org.example.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    PlayerService service;

    @RequestMapping(value = "/searchPlayerForm")
    public String searchPlayerForm(){
        return "search-player-form";
    }

//    @RequestMapping(value = "/showPlayerDetail")
    // using http servlet
//    public String showPlayerDetail(HttpServletRequest request, Model model) {
//
//        String pName = request.getParameter("playerName");
//        Player player = service.getPlayerByName(pName);
//        System.out.println(player);
//        model.addAttribute("pName",player.getName());
//        model.addAttribute("pAge",player.getAge());
//        model.addAttribute("pId",player.getId());
//        model.addAttribute("pNationality",player.getNationality());
//        return "show-player-detail";
//    }

    @RequestMapping(value = "/showPlayerDetail")
    //Without http servlet
    public String showPlayerDetail(@RequestParam(value = "playerName", defaultValue = "Mohit") String playerName, Model model) {

      //  String pName = request.getParameter("playerName");
        Player player = service.getPlayerByName(playerName);
        System.out.println(player);
        model.addAttribute("pName",player.getName());
        model.addAttribute("pAge",player.getAge());
        model.addAttribute("pId",player.getId());
        model.addAttribute("pNationality",player.getNationality());
        return "show-player-detail";
    }


}

