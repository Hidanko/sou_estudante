package br.com.nemeth.services;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControleRest {

	@GetMapping()
	public void getIndex(HttpServletResponse response) throws IOException {
		response.sendRedirect("index.xhtml");
	}
}
