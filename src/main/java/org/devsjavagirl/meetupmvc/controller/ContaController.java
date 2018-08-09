package org.devsjavagirl.meetupmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devsjavagirl.meetupmvc.model.Conta;
import org.devsjavagirl.meetupmvc.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "/contas")
public class ContaController {

	@Autowired
    private ContaService contaService;

	@RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = {"application/json", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    List<Conta> getAll(HttpServletRequest request, HttpServletResponse response) {
        return contaService.getAll();
    }
	
}
