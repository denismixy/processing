package com.example.processing;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProcessingController {
    @GetMapping(value = "/processingPinChange", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String processingPinChange(@RequestParam(name = "pin") String pin,
                                      @RequestParam(name = "pan") String pan) {
        return Processing.processingPinChange(pin, pan);
    }
}
