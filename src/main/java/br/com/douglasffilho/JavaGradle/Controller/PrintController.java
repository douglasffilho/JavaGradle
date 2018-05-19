package br.com.douglasffilho.JavaGradle.Controller;

import br.com.douglasffilho.JavaGradle.Services.PrintService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintController {

	PrintService printService;

	public PrintController(PrintService printService) {
		this.printService = printService;
	}

	public void printControllerAction() {
		log.debug("M=printControllerAction, I=iniciando servico para impressao");
		printService.print();
	}
}
