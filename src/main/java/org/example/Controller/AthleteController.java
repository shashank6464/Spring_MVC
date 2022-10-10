package org.example.Controller;

import org.example.Athlete;
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
@RequestMapping("/athlete")
public class AthleteController {

    //http://localhost:8080/springmvc/athlete/showAthleteDetails
    @RequestMapping("/showAthleteForm")
    public String showAthlete(Model model){
        model.addAttribute("athlete",new Athlete()); // using model we assign Athlete attributes value using form
        return "athlete-form";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,editor);
    } // initBinder is mapped to BindingResult in showAthleteDetails Method

    @RequestMapping("/showAthleteDetails") // Spring Validation
    public String showAthleteDetails(@Valid @ModelAttribute("athlete") Athlete myAthlete, BindingResult result){
        // BindingResult bind the valid form to Model Validation method (variable).
        System.out.println("Athlete Details: "+myAthlete);

        if(result.hasErrors()){
            System.out.println(result);
            return "athlete-form";
        }

        return "athlete-details";
    }


}
