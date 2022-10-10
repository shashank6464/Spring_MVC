package org.example;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/stats")
public class PlayerStatsController {
    @RequestMapping("/showPlayerStatsForm")
    public String showPlayerStats(Model model){
        model.addAttribute("playerStats",new PlayerStats()); // using model we assign Athlete attributes value using form
        return "head-to-head";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,editor);
    } // initBinder is mapped to BindingResult in showAthleteDetails Method

    @RequestMapping("/showPlayerStatsDetails") // Spring Validation
    public String showPlayerStatsDetails(@Valid @ModelAttribute("playerStats") PlayerStats myPlayerStats, BindingResult result){
        // BindingResult bind the valid form to Model Validation method (variable).
        System.out.println("Athlete Details: "+myPlayerStats);

        if(result.hasErrors()){
            System.out.println(result);
            return "head-to-head";
        }

        return "head-to-head-stats";
    }

}
