package com.calindra.crm.controller;

import java.util.ArrayList;
import java.util.List;

import com.calindra.crm.dto.EnderecoDto;
import com.calindra.crm.feign.EnderecoResponse;
import com.calindra.crm.feign.Geolocalizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.calindra.crm.model.Endereco;
import com.calindra.crm.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private Geolocalizacao geolocalizacao;


	public EnderecoController(EnderecoRepository enderecoRepository, Geolocalizacao geolocalizacao) {
		this.enderecoRepository = enderecoRepository;
		this.geolocalizacao = geolocalizacao;
	}

	@GetMapping
	public List<EnderecoResponse> listar() {
		List<Endereco> enderecos = enderecoRepository.findAll();
		List<EnderecoResponse> enderecosResponse = new ArrayList<>();
		
		for(Endereco endereco: enderecos){
			EnderecoResponse enderecoResponse = geolocalizacao.consulta(endereco.getLogradouro(), "AIzaSyCLaOuOUXCDeg13hxuh_FNoyE7sFqgBW78");
			enderecosResponse.add(enderecoResponse);
		}
		return enderecosResponse;
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco adicionar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}


	

