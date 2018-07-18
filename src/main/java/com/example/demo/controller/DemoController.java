package com.example.demo.controller;

import com.example.demo.dao.DemoDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@Api(value = "DemoController", description = "Restful API")
public class DemoController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ApiOperation(value="hello, World API", notes="hello, World를 반환하는 API, Ajax 통신 확인용.")
    public String helloWorld() {
        return "hello, World";
    }

    @RequestMapping(value="/test/get/{id}", method= RequestMethod.GET)
    @ApiOperation(value="test GET", notes="get test")
    public String testGetId(@PathVariable("id") Integer id) {
        return "id = " + id;
    }

    @RequestMapping(value="/test/post", method=RequestMethod.POST)
    @ApiOperation(value = "test Post", notes="post test")
    public ResponseEntity<DemoDao> testPost(@RequestBody DemoDao demo) {
        demo.setResult("success");
        return new ResponseEntity<DemoDao>(demo, HttpStatus.OK);
    }

    @RequestMapping(value="/test/delete/{id}", method= RequestMethod.DELETE)
    @ApiOperation(value="test Delete", notes="delete test")
    public String testDeleteId(@PathVariable("id") Integer id) {
        return "delete id = " + id;
    }
}

