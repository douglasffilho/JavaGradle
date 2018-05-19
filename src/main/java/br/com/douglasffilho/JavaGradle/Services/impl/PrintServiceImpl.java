package br.com.douglasffilho.JavaGradle.Services.impl;

import br.com.douglasffilho.JavaGradle.Model.Printer;
import br.com.douglasffilho.JavaGradle.Services.PrintService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintServiceImpl implements PrintService {

	Printer printer;

	public PrintServiceImpl(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String print() {
		String output = printer.getOutput();

		log.debug("M=print, I=Impressao: " + output);

		System.out.println(output);

		return output;
	}
}
