package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayerController {

    @RequestMapping(value = "/searchPlayerForm")
    public String searchPlayerForm(){
        return "search-player-form";
    }

    @RequestMapping(value = "/showPlayerDetail")
    public String showPlayerDetail(HttpServletRequest request, Model model) {
        String pName = request.getParameter("playerName");
        model.addAttribute("name",pName);
        return "show-player-detail";
    }


}

