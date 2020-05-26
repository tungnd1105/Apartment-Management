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

    // return template page can ho
    @GetMapping("/canho")
    public String pageCanho() {
        return "components/quanly/canho";
    }
    // return template page  chu can ho
    @GetMapping("/chucanho")
    public String pageChuCanho() {
        return "components/quanly/chucanho";
    }
    // return template page   table chu can ho
    @GetMapping("/tablechucanho")
    public String pageTabelChuCanho() {
        return "components/quanly/tablechucanho";
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
