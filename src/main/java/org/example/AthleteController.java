package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

    @RequestMapping("/showAthleteForm")
    public String showAthlete(Model model){
        model.addAttribute("athlete",new Athlete());
        return "athlete-form";
    }

    @RequestMapping("/showAthleteDetails") //Spring Validation
    public String showAthleteDetails(@Valid @ModelAttribute("athlete") Athlete myAthlete, BindingResult result){
        System.out.println("Athlete Details:" +myAthlete);
        if(result.hasErrors()){
            return "athlete-form";
        }

        return "athlete-details";
    }

}
