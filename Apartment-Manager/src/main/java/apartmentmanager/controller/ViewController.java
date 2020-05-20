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
        return "components/Residential";
    }

    // return template page table residential
    @GetMapping("/listResidential")
    public String pagebuildingresidential() {
        return "components/TableResidential";
    }

    // return template page table building
    @GetMapping("/tablebuilding")
    public String pagetablebuilding() {
        return "components/TableBuilding";
    }
    // return template page table building
    @GetMapping("/tableroom")
    public String pagetableroom() {
        return "components/TableRoom";
    }
    // return template page table Invoice
    @GetMapping("/tableinvoice")
    public String pagetableinvoice() {
        return "components/TableInvoice";
    }
    // return template page table Invoice detail
    @GetMapping("/tableinvoicedetail")
    public String pagetableinvoicedetail() {
        return "components/TableInvoiceDetial";
    }
    // return template page table Invoice detail
    @GetMapping("/tablevehicle")
    public String pagetablevehicle() {
        return "components/TableVehicle";
    }
}
