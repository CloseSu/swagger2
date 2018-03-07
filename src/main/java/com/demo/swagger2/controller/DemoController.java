package com.demo.swagger2.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @ApiOperation(value="測試", notes="測試")
    @RequestMapping(value={"/test"}, method= RequestMethod.GET)
    public String getTestString() {
	return "Teeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeest";
    }

    @ApiOperation(value="取得回傳資料", notes="取得回傳資料")
    @ApiImplicitParam(name = "data", value = "輸入資料", required = true, dataType = "String", paramType="path")
    @RequestMapping(value="/input/{data}", method=RequestMethod.GET)
    public String getStringData(@PathVariable String data) {
        System.out.println(data);
	return "Return :" + data ;
    }
}
