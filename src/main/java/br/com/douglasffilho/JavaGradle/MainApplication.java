package br.com.douglasffilho.JavaGradle;

import br.com.douglasffilho.JavaGradle.Controller.PrintController;
import br.com.douglasffilho.JavaGradle.Model.Printer;
import br.com.douglasffilho.JavaGradle.Services.PrintService;
import br.com.douglasffilho.JavaGradle.Services.impl.PrintServiceImpl;

public class MainApplication {

	public static void main(String[] args) {
		Printer printer = Printer
				.builder()
				.output("HelloWorld")
				.build();

		PrintService printService = new PrintServiceImpl(printer);

		PrintController printController = new PrintController(printService);
		printController.printControllerAction();
	}
}
