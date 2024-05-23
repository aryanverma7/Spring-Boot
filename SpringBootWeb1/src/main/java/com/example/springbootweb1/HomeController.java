package com.example.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @ModelAttribute("course") Used to substitute value inside jsp
//    public String courseName(){
//        return "Java";
//    }

    @RequestMapping("/")
    public String home(){
//        System.out.println("Home Method Called");
        return "index";
    }

    @RequestMapping("add")
//    public String add(int num1, int num2){
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, HttpSession session){
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){

    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
//    public ModelAndView add(@ModelAttribute("alien") Alien alien){ the class will automatically store data and return it

        int result = num1 + num2;

//        session.setAttribute("result", result);

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }
}
