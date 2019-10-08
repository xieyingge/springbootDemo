package com.example.demo.controller;


import com.example.demo.service.CountryPostalCodeService;
import com.example.demo.service.ShippingCostAcquireService;
import com.fedex.rate.stub.Address;
import com.fedex.rate.stub.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fedex")
public class ShippingCostAcquireController {

    @Autowired
    private CountryPostalCodeService countryPostalCodeService;

    @Autowired
    private ShippingCostAcquireService shippingCostAcquireService;

    @RequestMapping("/multiProcessGetShippingCost")
    @ResponseBody
    public Object multiProcessGetShippingCost(){
        try {
            shippingCostAcquireService.multiProcessGetShippingCostAndInsert();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return "multi process success";
    }

    @RequestMapping("/normalGetShippingCost")
    @ResponseBody
    public Object normalGetShippingCost(){
        try {
            shippingCostAcquireService.nomalProcessGetShippingCostAndInsert();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return "normal get success";
    }

    private static Party from() {
        Party party = new Party();
        Address address = new Address(); // Origin information
        address.setStreetLines(new String[]{"65 Vesta St"});
        address.setCity("San Francisco");//田纳西州 的城市 孟菲斯
        address.setStateOrProvinceCode("CA");//田纳西州
        address.setPostalCode("941124");
        address.setCountryCode("US");//美国
        party.setAddress(address);
        return party;
    }

    private static Party to() {
        Party party = new Party();
        Address address = new Address(); // Origin information
//        address.setStreetLines(new String[]{"SHIPPER ADDRESS LINE 1"});
        address.setCity("Diamond Bar");//钻石吧 又为 戴蒙德吧  美国的一个城市
        address.setStateOrProvinceCode("CA");//加利福尼亚州
        address.setPostalCode("91765");
        address.setCountryCode("US");
        party.setAddress(address);
        return party;
    }

}
