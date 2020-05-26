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
    @GetMapping("/table-canho")
    public String pageCanho() {
        return "components/quanly/table-Canho";
    }

    // return template page  chu can ho
    @GetMapping("/chucanho")
    public String pageChuCanho() {
        return "components/quanly/Chucanho";
    }

    // return template page   table chu can ho
    @GetMapping("/table-chucanho")
    public String pageTabelChuCanho() {
        return "components/quanly/table-Chucanho";
    }

    // return template page residential
    @GetMapping("/cudan")
    public String pageCudan() {
        return "components/quanly/Cudan";
    }

    // return template page table residential
    @GetMapping("/table-cudan")
    public String pageTableCudan() {
        return "components/quanly/table-Cudan";
    }

    // return template page table residential
    @GetMapping("/table-xe")
    public String pageTablexe() {
        return "components/quanly/table-xe";
    }


    // return template page table residential
    @GetMapping("/table-hoadon")
    public String pageTableHoadon() {
        return "components/quanly/table-Hoadon";
    }
}
