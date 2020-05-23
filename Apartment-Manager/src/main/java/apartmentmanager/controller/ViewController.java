package apartmentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    // return template page admin
    @GetMapping("/")
    public String pageadmin() {
        return "layout/LayoutAdmin";
    }

    // return template page residential
    @GetMapping("/cudan")
    public String pageCudan() {
        return "components/quanly/Cudan";
    }

    // return template page table residential
    @GetMapping("/tablecudan")
    public String pageTableCudan() {
        return "components/quanly/TableCudan";
    }

}
