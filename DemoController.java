package com.example.demo.Controller;

import com.example.demo.Interface.DemoInterface;
import com.example.demo.Model.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@Autowired
    private DemoInterface demoRepository;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/addcar")
    public String mobileAdd() {
        return "Add_car";
    }

    @PostMapping("/addcar")
    public String addcar(DemoModel car) {
        try {
            demoRepository.save(car);
            return "record_added";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/showcar")
    public String showcar(Model model) {
        Iterable<DemoModel> carList = demoRepository.findAll();
        model.addAttribute("car", carList);
        return "show_car";
    }

    @GetMapping("/deletecar")
    public String deletecar(@RequestParam Integer id) {
        demoRepository.deleteById(id);
        return "redirect:/showcar";
    }

    @GetMapping("/updateCar")
    public String updateCar(@RequestParam Integer id, Model model) {
        DemoModel car = demoRepository.findById(id).orElse(null);
        model.addAttribute("car", car);
        return "update_car";
    }

    @PostMapping("/updatecar")
    public String updatedcar(DemoModel car) {
        demoRepository.save(car);
        return "update_success";
    }
}
