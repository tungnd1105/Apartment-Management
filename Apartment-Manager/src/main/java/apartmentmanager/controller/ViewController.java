package apartmentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String pageadmin() {
        return "layout/LayoutAdmin";
    }
    @GetMapping("/residential")
    public String pageresidential() {
        return "components/Residential";
    }
    @GetMapping("/listResidential")
    public String pagelistresidential() {
        return "components/ListResidential";
    }
}
