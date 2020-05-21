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
    @GetMapping("/residential")
    public String pageresidential() {
        return "components/quanly/Residential";
    }

    // return template page table residential
    @GetMapping("/listResidential")
    public String pagebuildingresidential() {
        return "components/quanly/TableResidential";
    }

    // return template page table building
    @GetMapping("/tablebuilding")
    public String pagetablebuilding() {
        return "components/quanly/TableBuilding";
    }
    // return template page table building
    @GetMapping("/tableroom")
    public String pagetableroom() {
        return "components/quanly/TableRoom";
    }
    // return template page table Invoice
    @GetMapping("/tableinvoice")
    public String pagetableinvoice() {
        return "components/quanly/TableInvoice";
    }
    // return template page table Invoice detail
    @GetMapping("/tableinvoicedetail")
    public String pagetableinvoicedetail() {
        return "components/quanly/TableInvoiceDetial";
    }
    // return template page table Invoice detail
    @GetMapping("/tablevehicle")
    public String pagetablevehicle() {
        return "components/quanly/TableVehicle";
    }
}
