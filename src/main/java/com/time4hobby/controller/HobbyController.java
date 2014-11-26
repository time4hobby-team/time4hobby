/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.controller;

import com.time4hobby.form.Contact;
import com.time4hobby.model.User;
import com.time4hobby.model.UserSessionInfo;
import com.time4hobby.repository.HobbyDAO;
import com.time4hobby.service.HobbyService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author spalakod
 */
@Controller
public class HobbyController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private UserSessionInfo userSessionInfo;
    @Resource
    private HobbyDAO hobbyDAO;
    @Resource
    private HobbyService hobbyService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getIndex(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    //    User user = userSessionInfo.getUser();
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("method called");
        modelAndView.addObject("indexResults", hobbyDAO.listHobbies());
        return modelAndView;
    }

    @RequestMapping(value = "/results", method = RequestMethod.GET)
    public ModelAndView getSearchResults(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String hobby = request.getParameter("hobby");
        String city = request.getParameter("city");

        ModelAndView modelAndView = new ModelAndView("results");

        if (hobby.equalsIgnoreCase("All Categories")) {
            if (city.equals("")) {
                modelAndView.addObject("allResults", hobbyDAO.listHobbies());
                return modelAndView;
            } else {
                modelAndView.addObject("resultsByCity", hobbyDAO.listHobbyResultsByCity(city));
                return modelAndView;
            }
        } else {
            if (city == null) {
                modelAndView.addObject("resultsByHobby", hobbyDAO.listHobbyResults(hobby));
                return modelAndView;
            } else {
                modelAndView.addObject("resultsbyHobbyAndCity", hobbyDAO.listHobbyResultsByCategoryAndCity(hobby, city));
                return modelAndView;
            }
        }
    }

    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    public ModelAndView getCityResults(HttpServletRequest request, HttpServletResponse response,
            @PathVariable String city) {
        System.out.println("city is -- " + city);
        ModelAndView modelAndView = new ModelAndView("cityresult");
        modelAndView.addObject("resultsByCity", hobbyDAO.listHobbyResultsByCity(city));
        return modelAndView;
    }

//    @RequestMapping(value = "/music", method = RequestMethod.GET)
//    public ModelAndView getMusic(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String category = request.getParameter("category");
//        String musicSpec = request.getParameter("specialization");
//        System.out.println("Category:" + category);
//        System.out.println("specialization:" + musicSpec);
//
//        if (category != null && musicSpec != null) {
//            ModelAndView modelAndView = new ModelAndView("music");
//            modelAndView.addObject("selected_spec", musicSpec);
//            modelAndView.addObject("musicSpecResults", hobbyDAO.listHobbyResultsBySpec(category, musicSpec));
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("music");
//            modelAndView.addObject("musicResults", hobbyDAO.listHobbyResults("\"Music\""));
//            return modelAndView;
//        }
//    }

    @RequestMapping(value = "/category/{hobby}", method = RequestMethod.GET)
    public ModelAndView getHobby(HttpServletRequest request, HttpServletResponse response, @PathVariable("hobby") String hobby) throws ServletException, IOException {
        String spec = request.getParameter("specialization");
        System.out.println("specialization:" + spec);
        System.out.println("hobby:" + hobby);


        if (hobby != null && spec != null) {
            ModelAndView modelAndView = new ModelAndView("hobby");
            modelAndView.addObject("selected_spec", spec);
            modelAndView.addObject("selected_category", hobby);
            modelAndView.addObject("specResults", hobbyDAO.listHobbyResultsBySpec(hobby, spec));
            return modelAndView;
        } else {
            List<String> subCategoryList = new ArrayList<String>();
            subCategoryList.add("SUB-A");
            subCategoryList.add("SUB-B");
            subCategoryList.add("SUB-C");
            subCategoryList.add("SUB-D");
            ModelAndView modelAndView = new ModelAndView(hobby);
            modelAndView.addObject("categoryResults", hobbyDAO.listHobbyResults("\"" + hobby + "\""));

            modelAndView.addObject("subCategoryList", subCategoryList);
            return modelAndView;
        }

    }

    @RequestMapping(value = "/dance", method = RequestMethod.GET)
    public ModelAndView getDance(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String category = request.getParameter("category");
        String musicSpec = request.getParameter("specialization");
        System.out.println("Category:" + category);
        System.out.println("specialization:" + musicSpec);

        if (category != null && musicSpec != null) {
            ModelAndView modelAndView = new ModelAndView("music");
            modelAndView.addObject("selected_spec", musicSpec);
            modelAndView.addObject("musicSpecResults", hobbyDAO.listHobbyResultsBySpec(category, musicSpec));
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("music");
            modelAndView.addObject("musicResults", hobbyDAO.listHobbyResults("\"Music\""));
            return modelAndView;
        }
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView getProfile(@RequestParam(value = "profileid", required = true) int profileId, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println(profileId);

        if (hobbyDAO == null) {
            System.out.println("Hobbybena is null");
        }

        ModelAndView modelAndView = new ModelAndView("profile");
        modelAndView.addObject("profileResults", hobbyDAO.listProfile(profileId));
        return modelAndView;
    }

    @RequestMapping("/contact")
    public ModelAndView showContacts() {
        return new ModelAndView("contact", "command", new Contact());
    }
}
