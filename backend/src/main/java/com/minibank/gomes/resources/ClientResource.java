package com.minibank.gomes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.minibank.gomes.entities.Client;

public class ClientResource {

	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client());
		return ResponseEntity.ok().body(list);
	}
}
